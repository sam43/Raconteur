package io.raconteur.data.repository

import io.raconteur.core.Result
import io.raconteur.data.remote.StoryApi
import io.raconteur.domain.model.Story
import io.raconteur.domain.repository.StoryRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class StoryRepositoryImpl(
    private val api: StoryApi,
    private val ioDispatcher: CoroutineDispatcher
): StoryRepository {
    override suspend fun getStories(): Result<List<Story>> = withContext(ioDispatcher) {
        return@withContext try {
            val response = api.getStories().map { it.toDomain() }
            Result.Success(response)
        } catch (e: Exception) {
            Result.Error(e)
        }
    }
}

