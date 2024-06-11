package com.example.mymoviewapp.data.api

import MovieListResponse
import com.example.mymoviewapp.network.RetrofitResult
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiInterface {

    @GET("movie/changes?page=1")
    suspend fun getMovieList(
        @Header("Content-Type") contentType: String
    ): RetrofitResult<MovieListResponse>

}