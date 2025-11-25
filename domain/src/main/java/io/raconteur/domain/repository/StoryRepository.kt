package io.raconteur.domain.repository

import io.raconteur.core.Result
import io.raconteur.domain.model.Story

interface StoryRepository {
    suspend fun getStories(): Result<List<Story>>
}

