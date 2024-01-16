package com.pradeep.demoapp.dimodule

import com.pradeep.demoapp.media_details.data.repository.DetailsRepositoryImpl
import com.pradeep.demoapp.media_details.data.repository.ExtraDetailsRepositoryImpl
import com.pradeep.demoapp.media_details.domain.repository.DetailsRepository
import com.pradeep.demoapp.media_details.domain.repository.ExtraDetailsRepository
import com.pradeep.demoapp.main.data.repository.GenreRepositoryImpl
import com.pradeep.demoapp.main.data.repository.MediaRepositoryImpl
import com.pradeep.demoapp.search.data.repository.SearchRepositoryImpl
import com.pradeep.demoapp.main.domain.repository.GenreRepository
import com.pradeep.demoapp.main.domain.repository.MediaRepository
import com.pradeep.demoapp.search.domain.repository.SearchRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMediaRepository(
        mediaRepositoryImpl: MediaRepositoryImpl
    ): MediaRepository

    @Binds
    @Singleton
    abstract fun bindSearchRepository(
        searchRepositoryImpl: SearchRepositoryImpl
    ): SearchRepository

    @Binds
    @Singleton
    abstract fun bindGenreRepository(
        genreRepositoryImpl: GenreRepositoryImpl
    ): GenreRepository

    @Binds
    @Singleton
    abstract fun bindDetailsRepository(
        detailsRepositoryImpl: DetailsRepositoryImpl
    ): DetailsRepository

    @Binds
    @Singleton
    abstract fun bindExtraDetailsRepository(
       extraDetailsRepositoryImpl: ExtraDetailsRepositoryImpl
    ): ExtraDetailsRepository

}
