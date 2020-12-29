package com.yates.androidcluedo.database.game

import androidx.room.Embedded
import androidx.room.Relation

data class BoardFull(

    @Embedded
    val board: Board,

    @Relation(
        parentColumn = "boardId",
        entityColumn = "boardId"
    )
    val square: List<Square>
)