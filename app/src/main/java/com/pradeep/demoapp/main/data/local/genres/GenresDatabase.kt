package com.pradeep.demoapp.main.data.local.genres

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [GenreEntity::class],
    version = 1
)
abstract class GenresDatabase: RoomDatabase() {
    abstract val genreDao: GenreInterfaceDao
}