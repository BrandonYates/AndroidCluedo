package com.yates.androidcluedo.database.game

import androidx.room.*
import java.util.*

@Dao
interface PieceDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(piece: Piece): Boolean

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(piece: Piece): Boolean

    @Delete
    suspend fun delete(piece: Piece)

    @Query("SELECT * FROM piece WHERE pieceId = :id")
    fun get(id: UUID): Piece

    @Query("SELECT * FROM piece where pieceId IN (:ids)")
    fun get(ids: List<UUID>): List<Piece>
}