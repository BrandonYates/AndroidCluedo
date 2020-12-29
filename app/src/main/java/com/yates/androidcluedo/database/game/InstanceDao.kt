package com.yates.androidcluedo.database.game

import androidx.room.*
import java.util.*

@Dao
interface InstanceDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(instance: Instance): Boolean

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(instanceFull: InstanceFull): Boolean

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(instance: Instance): Boolean

    @Delete
    suspend fun delete(instance: Instance)

    @Query("DELETE FROM instance WHERE instanceId = :id")
    suspend fun delete(id: UUID): Boolean

    @Query("SELECT * FROM instance WHERE instanceId = :id")
    fun get(id: UUID): Instance

    @Query("SELECT * FROM instance WHERE instanceId = :id")
    fun getFullInstance(id: UUID): InstanceFull
}