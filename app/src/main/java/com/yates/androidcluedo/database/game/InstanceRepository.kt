package com.yates.androidcluedo.database.game

import androidx.annotation.WorkerThread
import java.util.*

class InstanceRepository(private val instanceDao: InstanceDao) {

    @WorkerThread
    suspend fun getInstance(id: UUID) =
        instanceDao.getFullInstance(id)

    @WorkerThread
    suspend fun insert(instanceFull: InstanceFull) =
        instanceDao.insert(instanceFull)

}