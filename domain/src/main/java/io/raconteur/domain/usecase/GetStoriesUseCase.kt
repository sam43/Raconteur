package io.raconteur.domain.usecase

import io.raconteur.core.Result
import io.raconteur.core.base.UseCase
import io.raconteur.domain.model.Story
import io.raconteur.domain.repository.StoryRepository

class GetStoriesUseCase(private val repository: StoryRepository) : UseCase<Unit, Result<List<Story>>> {
    override suspend operator fun invoke(params: Unit): Result<List<Story>> = repository.getStories()
    suspend operator fun invoke(): Result<List<Story>> = invoke(Unit)
}
