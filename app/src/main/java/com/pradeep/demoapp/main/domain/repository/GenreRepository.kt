package com.pradeep.demoapp.main.domain.repository

import com.pradeep.demoapp.util.Resource
import com.pradeep.demoapp.main.domain.models.Genre
import kotlinx.coroutines.flow.Flow

interface GenreRepository {
    suspend fun getGenres(
        fetchFromRemote: Boolean,
        type: String,
        apiKey: String
    ): Flow<Resource<List<Genre>>>
}










