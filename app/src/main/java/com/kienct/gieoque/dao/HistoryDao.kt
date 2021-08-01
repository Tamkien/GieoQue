package com.kienct.gieoque.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kienct.gieoque.entities.History

interface HistoryDao {
    @Query("SELECT * FROM history_table ORDER BY hex_id DESC")
    fun getAllHistories(): List<History>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(history: History)
    @Delete
    fun delete(history: History)
    @Query("DELETE FROM history_table")
    fun deleteAll()
}