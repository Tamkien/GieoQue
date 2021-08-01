package com.kienct.gieoque.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "history_table")
class History(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "hex_id") val hexID: String,
    @ColumnInfo(name = "hex_name") val hexName: String,
    @ColumnInfo(name = "solar_date") val sDate: String,
    @ColumnInfo(name = "lunar_date") val lDate: String,
)