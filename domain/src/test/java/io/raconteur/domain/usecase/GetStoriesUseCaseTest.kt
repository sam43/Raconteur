package io.raconteur.domain.usecase

import io.raconteur.core.Result
import io.raconteur.domain.model.Story
import io.raconteur.domain.repository.StoryRepository
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

private class FakeStoryRepository(private val stories: List<Story>) : StoryRepository {
    override suspend fun getStories(): Result<List<Story>> = Result.Success(stories)
}

class GetStoriesUseCaseTest {
    @Test
    fun `invoke returns success with stories`() = runTest {
        val fakeStories = listOf(Story("1", "Title", "Content"))
        val repo = FakeStoryRepository(fakeStories)
        val useCase = GetStoriesUseCase(repo)
        val result = useCase()
        assertTrue(result is Result.Success)
        assertEquals(fakeStories, (result as Result.Success).data)
    }
}
