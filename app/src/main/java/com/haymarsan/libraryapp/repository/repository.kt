package com.haymarsan.libraryapp.repository

import androidx.lifecycle.LiveData
import com.haymarsan.libraryapp.data.BookVO

interface repository {


    fun getAllBooks():LiveData<List<BookVO>>

    fun insertBook(bookVO: BookVO)

    fun deleteAllBooks()

}