package com.haymarsan.libraryapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.haymarsan.libraryapp.R
import com.haymarsan.libraryapp.adapter.BookListAdapter
import com.haymarsan.libraryapp.data.BookVO
import kotlinx.android.synthetic.main.activity_book_list.*

class BookListActivity : AppCompatActivity() {


        val bookList: ArrayList<BookVO> = ArrayList()
        lateinit var bookAdapter: BookListAdapter

    companion object {

        fun newIntent(context: Context): Intent {

            return Intent(context, BookListActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)


//        bookList.add(BookVO("Android", 26.33))
//        bookList.add(BookVO("Java", 26.33))
//        bookList.add(BookVO("HTML", 26.33))


        bookAdapter = BookListAdapter(bookList)

        rvBookList.layoutManager = LinearLayoutManager(this)
        rvBookList.adapter = bookAdapter


        btnBookAdd.setOnClickListener {

            bookList.add(BookVO(edBookName.text.toString(), edBookPrice.text.toString().toDouble()))
            bookAdapter.notifyDataSetChanged()



        }

    }
}
