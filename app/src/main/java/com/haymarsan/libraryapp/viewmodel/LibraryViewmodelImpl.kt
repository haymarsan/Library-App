package com.haymarsan.libraryapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.haymarsan.libraryapp.data.BookVO
import com.haymarsan.libraryapp.repository.repositoryImpl


class LibraryViewmodelImpl(application: Application): AndroidViewModel(application), LibraryViewmodel {


    private val repository = repositoryImpl(application)


    override fun getAllBookListFromDB(): LiveData<List<BookVO>> {
       return repository.getAllBooks()
    }

    override fun insertBookListToDB(bookVO: BookVO) {
        return repository.insertBook(bookVO)
    }

    override fun deleteAllBookListInDB() {
        return repository.deleteAllBooks()
    }
}