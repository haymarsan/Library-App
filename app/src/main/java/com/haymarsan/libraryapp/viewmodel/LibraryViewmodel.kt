package com.haymarsan.libraryapp.viewmodel

import androidx.lifecycle.LiveData
import com.haymarsan.libraryapp.data.BookVO

interface LibraryViewmodel {

    fun getAllBookListFromDB():LiveData<List<BookVO>>

    fun insertBookListToDB(bookVO: BookVO)

    fun deleteAllBookListInDB()

}