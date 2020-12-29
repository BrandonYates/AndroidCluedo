package com.yates.androidcluedo.database.game

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "board")
data class Board(
    @PrimaryKey
    @ColumnInfo(name = "boardId")
    val id: UUID
)