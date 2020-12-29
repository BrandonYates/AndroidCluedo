package com.yates.androidcluedo.database.player

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import java.util.*

@Dao
interface PlayerDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(player: Player): Boolean

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(player: Player): Boolean

    @Delete
    suspend fun delete(player: Player)

    @Query("DELETE FROM player WHERE playerId = :id")
    suspend fun delete(id: UUID): Boolean

    @Query("SELECT * FROM player WHERE playerId = :id")
    fun get(id: UUID): Player

    @Query("SELECT * FROM player WHERE playerId IN (:ids)")
    fun get(ids: List<UUID>): List<Player>

    @Query("SELECT * FROM player WHERE playerName = :name")
    fun getAll(name: String): Flow<List<Player>>
}