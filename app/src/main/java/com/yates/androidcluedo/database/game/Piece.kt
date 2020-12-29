package com.yates.androidcluedo.database.game

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "piece")
data class Piece(
    @PrimaryKey
    @ColumnInfo(name = "pieceId")
    val id: UUID,

    @ColumnInfo(name = "pieceX")
    val x: Int,

    @ColumnInfo(name = "pieceY")
    val y: Int
)