package com.yates.androidcluedo.database.game

import androidx.room.*
import java.util.*

@Dao
interface BoardDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(board: Board): Boolean

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(board: Board): Boolean

    suspend fun delete(board: Board): Boolean

    @Transaction
    @Query("SELECT * FROM board WHERE boardId = :id")
    fun get(id: UUID): BoardFull

    @Transaction
    @Query("SELECT * FROM board WHERE boardId IN (:ids)")
    fun get(ids: List<UUID>): List<BoardFull>
}