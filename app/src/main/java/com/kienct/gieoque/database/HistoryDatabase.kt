package com.kienct.gieoque.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kienct.gieoque.dao.HistoryDao
import com.kienct.gieoque.entities.History

@Database(entities = [History::class], version = 1)
abstract class HistoryDatabase: RoomDatabase() {
    abstract fun historyDao() : HistoryDao
}