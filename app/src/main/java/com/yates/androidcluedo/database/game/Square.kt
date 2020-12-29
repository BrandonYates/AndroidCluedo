package com.yates.androidcluedo.database.game

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "square")
data class Square(
    @PrimaryKey
    @ColumnInfo(name = "squareId")
    val id: UUID,

    @ColumnInfo(name = "boardId")
    val boardId: UUID,

    @ColumnInfo(name = "squareX")
    val x: Int,

    @ColumnInfo(name = "squareY")
    val y: Int,

    @ColumnInfo(name = "navigable")
    val navigable: Boolean,

    @ColumnInfo(name = "occupied")
    val occupied: Boolean
)