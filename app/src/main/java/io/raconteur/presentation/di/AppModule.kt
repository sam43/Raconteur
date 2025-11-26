package io.raconteur.presentation.di

import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel
import io.raconteur.presentation.viewmodel.NewsViewModel

val appPresentationModule = module {
    // Provide view models
    viewModel { NewsViewModel() }
}
