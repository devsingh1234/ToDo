package com.example.todo

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface TodoDao {


    @Insert()
    suspend fun inserttask(toDomodel: ToDomodel):Long

    @Query("Select * from ToDomodel where isFinished != -1")
    fun gettask():LiveData<List<ToDomodel>>

    @Query("Update ToDomodel set isFinished = 1 where id =:uid")
    fun isfinshed(uid:Long)

    @Query("Delete from ToDomodel  where id =:uid")
    fun deletetask(uid:Long)
}