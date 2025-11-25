package io.raconteur.domain.di

import io.raconteur.domain.usecase.GetStoriesUseCase
import io.raconteur.domain.repository.StoryRepository
import org.koin.dsl.module

val domainModule = module {
    factory { GetStoriesUseCase(get<StoryRepository>()) }
}

