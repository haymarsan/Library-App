package com.haymarsan.libraryapp.repository

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData
import com.haymarsan.libraryapp.data.BookVO
import com.haymarsan.libraryapp.persistence.BookDao
import com.haymarsan.libraryapp.persistence.LibraryDatabase

class repositoryImpl(application: Application): repository {

    private val mdatabase = LibraryDatabase.getDatabase(application)

    private val mDao = mdatabase.libraryDao()

    private val allBookList = mdatabase.libraryDao().getAllBookList()


    override fun getAllBooks(): LiveData<List<BookVO>> = allBookList

    override fun insertBook(bookVO: BookVO) {

        InsertBook(mDao).execute(bookVO)

    }


    private class InsertBook(dao: BookDao): AsyncTask<BookVO, Void, Void>(){

        private val mAsyncDao: BookDao = dao
        override fun doInBackground(vararg param: BookVO?): Void? {

            mAsyncDao.insertBook(param[0]!!)

            return null

        }

    }



    override fun deleteAllBooks() {

        DeleteAllBooks(mDao).execute()
    }

    private class DeleteAllBooks(dao: BookDao):AsyncTask<BookVO, Void, Void>(){

        private val mAsyncDao: BookDao = dao
        override fun doInBackground(vararg param: BookVO?): Void? {

            mAsyncDao.deleteAllBookList()

            return null
        }

    }




}