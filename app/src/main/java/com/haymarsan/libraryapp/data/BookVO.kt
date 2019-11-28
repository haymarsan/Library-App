package com.haymarsan.libraryapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "book_table")
data class BookVO(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "book_name")
    val bookName: String,

    @ColumnInfo(name = "book_price")
    val bookPrice: Double


)