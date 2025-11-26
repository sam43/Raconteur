package io.raconteur.data.remote

import io.raconteur.data.remote.dto.XyzDto
import retrofit2.http.GET

interface XyzApi {
    @GET("stories")
    suspend fun getDataXyz(): List<XyzDto>
}

