package com.example.todo

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [ToDomodel::class],version = 1)
abstract  class Appdatabse:RoomDatabase() {
        abstract fun todoDao():TodoDao
}