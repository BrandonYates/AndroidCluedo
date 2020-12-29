package com.yates.androidcluedo.database.player

import androidx.room.Embedded
import androidx.room.Relation
import com.yates.androidcluedo.database.game.Card

data class PlayerFull(
    @Embedded
    val player: Player,

    @Relation(
        parentColumn = "playerId",
        entityColumn = "ownerId"
    )
    val hand: List<Card>
)