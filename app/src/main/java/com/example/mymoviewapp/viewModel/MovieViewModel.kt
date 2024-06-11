package com.example.mymoviewapp.viewModel

import MovieListResponse
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mymoviewapp.data.repository.MovieRepository
import com.example.mymoviewapp.di.MovieModule
import com.example.mymoviewapp.network.RetrofitResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val repository: MovieRepository,
    private val dispatcher: CoroutineDispatcher
): ViewModel() {

    private val _movieList = MutableSharedFlow<RetrofitResult<MovieListResponse>>()
    val movieList = _movieList.asSharedFlow()

    fun getMovieList() {
        viewModelScope.launch {
            launch(dispatcher) {
                _movieList.emit(repository.getMovieList())
            }
        }
    }
}