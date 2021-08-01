package com.kienct.gieoque.client

import android.content.Context
import androidx.room.Room
import com.kienct.gieoque.database.HistoryDatabase

class DatabaseClient private constructor(context: Context) {
    val appDatabase: HistoryDatabase =
        Room.databaseBuilder(context, HistoryDatabase::class.java, "history_table").build()

    companion object {
        var instance: DatabaseClient? = null

        @Synchronized
        fun getInstance(context: Context) : DatabaseClient {
            if (instance==null) instance = DatabaseClient(context)
            return instance as DatabaseClient
        }
    }
}