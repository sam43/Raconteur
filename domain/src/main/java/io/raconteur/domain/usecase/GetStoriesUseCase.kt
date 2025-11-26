package io.raconteur.domain.usecase

import io.raconteur.core.Result
import io.raconteur.core.base.UseCase
import io.raconteur.domain.model.XyzData
import io.raconteur.domain.repository.ClipifyRepository

class GetStoriesUseCase(private val repository: ClipifyRepository) : UseCase<Unit, Result<List<XyzData>>> {
    override suspend operator fun invoke(params: Unit): Result<List<XyzData>> = repository.getDataXyz()
    suspend operator fun invoke(): Result<List<XyzData>> = invoke(Unit)
}
