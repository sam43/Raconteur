package io.raconteur.data.remote

import io.raconteur.data.remote.dto.StoryDto
import retrofit2.http.GET

interface StoryApi {
    @GET("stories")
    suspend fun getStories(): List<StoryDto>
}

