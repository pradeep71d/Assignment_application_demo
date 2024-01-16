package com.pradeep.demoapp.main.presentation.main

import com.pradeep.demoapp.main.domain.models.Genre
import com.pradeep.demoapp.main.domain.models.Media

data class MainUiState(

    val popularMoviesPage: Int = 1,
    val topRatedMoviesPage: Int = 1,
    val nowPlayingMoviesPage: Int = 1,

    val popularTvSeriesPage: Int = 1,
    val topRatedTvSeriesPage: Int = 1,

    val trendingAllPage: Int = 1,

    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val areListsToBuildSpecialListEmpty: Boolean = true,

    val popularMoviesList: List<Media> = emptyList(),
    val topRatedMoviesList: List<Media> = emptyList(),
    val nowPlayingMoviesList: List<Media> = emptyList(),

    val popularTvSeriesList: List<Media> = emptyList(),
    val topRatedTvSeriesList: List<Media> = emptyList(),

    val trendingAllList: List<Media> = emptyList(),

    val tvSeriesList: List<Media> = emptyList(),

    val topRatedAllList: List<Media> = emptyList(),

    val recommendedAllList: List<Media> = emptyList(),

    val specialList: List<Media> = emptyList(),

    val moviesGenresList: List<Genre> = emptyList(),
    val tvGenresList: List<Genre> = emptyList(),

)