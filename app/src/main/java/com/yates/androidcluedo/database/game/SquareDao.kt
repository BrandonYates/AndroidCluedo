package com.yates.androidcluedo.database.game

import androidx.room.*
import java.util.*

@Dao
interface SquareDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(square: Square): Boolean

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(square: Square): Boolean

    @Delete
    suspend fun delete(square: Square)

    @Query("SELECT * FROM square where squareId IN (:ids)")
    fun get(ids: List<UUID>): List<Square>
}