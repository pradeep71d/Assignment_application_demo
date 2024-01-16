package com.pradeep.demoapp.media_details.domain.repository

import com.pradeep.demoapp.media_details.domain.models.Cast
import com.pradeep.demoapp.main.domain.models.Media
import com.pradeep.demoapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface ExtraDetailsRepository {

    suspend fun getSimilarMediaList(
        isRefresh: Boolean,
        type: String,
        id: Int,
        page: Int,
        apiKey: String
    ): Flow<Resource<List<Media>>>

    suspend fun getCastList(
        isRefresh: Boolean,
        id: Int,
        apiKey: String
    ): Flow<Resource<Cast>>

    suspend fun getVideosList(
        isRefresh: Boolean,
        id: Int,
        apiKey: String
    ): Flow<Resource<List<String>>>

}










