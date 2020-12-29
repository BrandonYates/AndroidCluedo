package com.yates.androidcluedo.database.player

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.yates.androidcluedo.database.game.Piece
import java.util.*

@Entity(tableName = "player")
data class Player(
    @PrimaryKey
    @ColumnInfo(name = "playerId")
    val id: UUID,

    @ColumnInfo(name = "owningInstanceId")
    val owningInstanceId: UUID,

    @ColumnInfo(name = "playerName")
    val name: String,

    @Embedded
    val piece: Piece
)