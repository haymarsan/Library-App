package com.haymarsan.libraryapp.persistence

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.haymarsan.libraryapp.data.BookVO

@Dao
interface BookDao {

    @Insert(onConflict =OnConflictStrategy.REPLACE)
    fun insertBook(bookVO: BookVO)


    @Query("DELETE FROM book_table")
    fun deleteAllBookList()


    @Query("SELECT * FROM book_table")
    fun getAllBookList():LiveData<List<BookVO>>





}