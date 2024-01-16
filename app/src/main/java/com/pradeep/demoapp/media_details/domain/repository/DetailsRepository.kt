package com.pradeep.demoapp.media_details.domain.repository

import com.pradeep.demoapp.main.domain.models.Media
import com.pradeep.demoapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface DetailsRepository {

    suspend fun getDetails(
        type: String,
        isRefresh: Boolean,
        id: Int,
        apiKey: String
    ): Flow<Resource<Media>>

}










