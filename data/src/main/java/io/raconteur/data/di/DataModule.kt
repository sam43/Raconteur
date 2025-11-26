package io.raconteur.data.di

import io.raconteur.core.dispatcher.DispatcherProvider
import io.raconteur.data.remote.XyzApi
import io.raconteur.data.repository.ClipifyRepositoryImpl
import io.raconteur.domain.repository.ClipifyRepository
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
    single { get<Retrofit>().create(XyzApi::class.java) }
    single<ClipifyRepository> { ClipifyRepositoryImpl(get(), get<DispatcherProvider>().io) }
}
