package com.yates.androidcluedo.database.game

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "card")
data class Card(
    @PrimaryKey
    @ColumnInfo(name = "cardId")
    val id: UUID,

    @ColumnInfo(name = "ownerId")
    val ownerId: UUID,

    @ColumnInfo(name = "cardName")
    val name: String,

    @ColumnInfo(name = "cardType")
    val type: Int
)