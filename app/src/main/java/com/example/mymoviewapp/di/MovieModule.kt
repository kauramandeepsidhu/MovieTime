package com.example.mymoviewapp.di

import com.example.mymoviewapp.data.api.ApiInterface
import com.example.mymoviewapp.util.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MovieModule {

    @Provides
    @Singleton
    fun provideMovieApi(
        retrofit: Retrofit.Builder,
        httpClient: OkHttpClient.Builder
    ): ApiInterface {
        return retrofit.baseUrl(Constant.BASE_URL)
            .client(httpClient.build())
            .build()
            .create()
    }

}