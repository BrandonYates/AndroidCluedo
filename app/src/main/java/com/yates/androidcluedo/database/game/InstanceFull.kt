package com.yates.androidcluedo.database.game

import androidx.room.Embedded
import androidx.room.Relation
import com.yates.androidcluedo.database.player.Player

data class InstanceFull(
    @Embedded
    val instance: Instance,

    @Relation(
        parentColumn = "instanceId",
        entityColumn = "owningInstanceId"
    )
    val players: List<Player>,

    @Relation(
        parentColumn = "instanceId",
        entityColumn = "ownerId"
    )
    val solution: List<Card>
)