package com.pradeep.demoapp.search.presentation

import com.pradeep.demoapp.main.domain.models.Media

data class SearchScreenState(

    val searchPage: Int = 1,

    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,

    val searchQuery: String = "",

    val searchList: List<Media> = emptyList(),


)