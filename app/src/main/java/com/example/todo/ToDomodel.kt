package com.example.todo

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
 data class ToDomodel(
var titile:String,
var discription:String,
var Task:String,
var Date:Long,
var Time:Long,
var isFinished: Int=-1,
@PrimaryKey(autoGenerate = true )
var id:Long =0

 )

