package com.pradeep.demoapp.search.domain.repository

import com.pradeep.demoapp.util.Resource
import com.pradeep.demoapp.main.domain.models.Media
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    suspend fun getSearchList(
        fetchFromRemote: Boolean,
        query: String,
        page: Int,
        apiKey: String
    ): Flow<Resource<List<Media>>>

}










