package io.raconteur.data.di

import io.raconteur.core.dispatcher.DispatcherProvider
import io.raconteur.data.remote.StoryApi
import io.raconteur.data.repository.StoryRepositoryImpl
import io.raconteur.domain.repository.StoryRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://example.com/api/" // Placeholder

val dataModule = module {
    single {
        val logging = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
        OkHttpClient.Builder().addInterceptor(logging).build()
    }
    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    single { get<Retrofit>().create(StoryApi::class.java) }
    single<StoryRepository> { StoryRepositoryImpl(get(), get<DispatcherProvider>().io) }
}
