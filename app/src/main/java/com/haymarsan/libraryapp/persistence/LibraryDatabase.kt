package com.haymarsan.libraryapp.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.haymarsan.libraryapp.data.BookVO

@Database(entities = arrayOf(BookVO::class), version = 1, exportSchema = false)
abstract class LibraryDatabase:RoomDatabase() {



    abstract fun libraryDao(): BookDao

    companion object{

        private var INSTANCE: LibraryDatabase? = null

        fun getDatabase(context: Context):LibraryDatabase{

            if (INSTANCE == null){

                INSTANCE = Room.databaseBuilder(context, LibraryDatabase::class.java, "LIBRARY_DB")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()

            }
            return INSTANCE!!

        }


    }



}