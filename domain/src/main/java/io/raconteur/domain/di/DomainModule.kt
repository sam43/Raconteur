package io.raconteur.domain.di

import io.raconteur.domain.usecase.GetStoriesUseCase
import io.raconteur.domain.repository.ClipifyRepository
import org.koin.dsl.module

val domainModule = module {
    factory { GetStoriesUseCase(get<ClipifyRepository>()) }
}

