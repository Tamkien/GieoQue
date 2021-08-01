package com.kienct.gieoque.dao

import androidx.room.*
import com.kienct.gieoque.entities.History
@Dao
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