package com.yates.androidcluedo.database.game

import androidx.room.*
import java.util.*

@Dao
interface CardDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(card: Card): Boolean

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(card: Card): Boolean

    @Delete
    suspend fun delete(card: Card): Boolean

    @Query("SELECT * FROM card WHERE cardId = :id")
    fun get(id: UUID): Card

    @Query("SELECT * FROM card WHERE cardId IN (:ids)")
    fun get(ids: List<UUID>): List<Card>
}