package io.raconteur.domain.repository

import io.raconteur.core.Result
import io.raconteur.domain.model.XyzData

interface ClipifyRepository {
    suspend fun getDataXyz(): Result<List<XyzData>>
}

