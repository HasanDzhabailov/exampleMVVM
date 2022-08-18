package com.example.examplemvvm.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "name_table")
data class ExampleDataClass(
	@PrimaryKey(autoGenerate = true)
	var id: Long = 0L,

	@ColumnInfo(name = "name")
	val name: String = "Другое",

	@ColumnInfo(name = "age")
	val age: Int = 0,

	@ColumnInfo(name = "date_expense")
	val date: Long =  System.currentTimeMillis(),
): Parcelable