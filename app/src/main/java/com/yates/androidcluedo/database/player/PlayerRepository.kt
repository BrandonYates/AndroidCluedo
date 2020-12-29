package com.yates.androidcluedo.database.player

import androidx.annotation.WorkerThread
import java.util.*

class PlayerRepository(private val playerDao: PlayerDao) {

    @WorkerThread
    suspend fun getPlayers(ids: List<UUID>) =
        playerDao.get(ids)

    @WorkerThread
    suspend fun insert(player: Player) =
        playerDao.insert(player)
}