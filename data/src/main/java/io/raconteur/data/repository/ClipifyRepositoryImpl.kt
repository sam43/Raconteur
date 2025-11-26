package io.raconteur.data.repository

import io.raconteur.core.Result
import io.raconteur.data.remote.XyzApi
import io.raconteur.domain.model.XyzData
import io.raconteur.domain.repository.ClipifyRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class ClipifyRepositoryImpl(
    private val api: XyzApi,
    private val ioDispatcher: CoroutineDispatcher
): ClipifyRepository {
    override suspend fun getDataXyz(): Result<List<XyzData>> = withContext(ioDispatcher) {
        return@withContext try {
            val response = api.getDataXyz().map { it.toDomain() }
            Result.Success(response)
        } catch (e: Exception) {
            Result.Error(e)
        }
    }
}

