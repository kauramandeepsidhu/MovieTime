package com.example.mymoviewapp.data.repository

import com.example.mymoviewapp.data.api.ApiInterface
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val apiInterface: ApiInterface
) {
    private val contentType = "application/json"


}