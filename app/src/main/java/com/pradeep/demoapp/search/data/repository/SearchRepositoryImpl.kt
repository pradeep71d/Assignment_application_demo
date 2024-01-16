package com.pradeep.demoapp.search.data.repository

import com.pradeep.demoapp.main.data.mappers.toMedia
import com.pradeep.demoapp.main.data.remote.api.MediaApi
import com.pradeep.demoapp.main.domain.models.Media
import com.pradeep.demoapp.search.domain.repository.SearchRepository
import com.pradeep.demoapp.util.Constants
import com.pradeep.demoapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SearchRepositoryImpl @Inject constructor(
    private val mediaApi: MediaApi,
) : SearchRepository {
//SearchRepo
    override suspend fun getSearchList(
        fetchFromRemote: Boolean,
        query: String,
        page: Int,
        apiKey: String
    ): Flow<Resource<List<Media>>> {

        return flow {
            emit(Resource.Loading(true))

            val remoteMediaList = try {
                mediaApi.getSearchList(query, page, apiKey).results.map { media ->
                    media.toMedia(
                        type = media.media_type ?: Constants.unavailable,
                        category = media.category ?: Constants.unavailable
                    )
                }
            } catch (e: IOException) {
                e.printStackTrace()
                emit(Resource.Error("Couldn't load data"))
                emit(Resource.Loading(false))
                return@flow
            } catch (e: HttpException) {
                e.printStackTrace()
                emit(Resource.Error("Couldn't load data"))
                emit(Resource.Loading(false))
                return@flow
            }

            emit(Resource.Success(remoteMediaList))

            emit(Resource.Loading(false))
        }
    }
}










