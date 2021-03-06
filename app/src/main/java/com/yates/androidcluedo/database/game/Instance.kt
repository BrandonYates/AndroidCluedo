package com.yates.androidcluedo.database.game

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "instance")
data class Instance(
    @PrimaryKey
    @ColumnInfo(name = "instanceId")
    val id: UUID,

    @Embedded
    val board: Board
)