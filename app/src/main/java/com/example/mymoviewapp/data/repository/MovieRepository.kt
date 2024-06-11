package com.example.mymoviewapp.data.repository

import MovieListResponse
import com.example.mymoviewapp.data.api.ApiInterface
import com.example.mymoviewapp.network.RetrofitResult
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val apiInterface: ApiInterface
) {
    private val contentType = "application/json"

    suspend fun getMovieList(): RetrofitResult<MovieListResponse> {
        return apiInterface.getMovieList(contentType)
    }
}