package com.haymarsan.libraryapp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haymarsan.libraryapp.R

class BookListActivity : AppCompatActivity() {


    companion object{

        fun newIntent(context: Context): Intent{

            return Intent(context, BookListActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)
    }
}
