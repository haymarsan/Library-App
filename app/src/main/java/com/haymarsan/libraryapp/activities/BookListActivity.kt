package com.haymarsan.libraryapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.haymarsan.libraryapp.R
import com.haymarsan.libraryapp.adapter.BookListAdapter
import com.haymarsan.libraryapp.data.BookVO
import com.haymarsan.libraryapp.viewmodel.LibraryViewmodel
import com.haymarsan.libraryapp.viewmodel.LibraryViewmodelImpl
import kotlinx.android.synthetic.main.activity_book_list.*


class BookListActivity : AppCompatActivity() {


        val bookList: ArrayList<BookVO> = ArrayList()
        lateinit var bookAdapter: BookListAdapter
        lateinit var mViewModel: LibraryViewmodel

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

        mViewModel = ViewModelProviders.of(this).get(LibraryViewmodelImpl::class.java)

        bookAdapter = BookListAdapter(bookList)

        rvBookList.layoutManager = LinearLayoutManager(this)
        rvBookList.adapter = bookAdapter


//        btnBookAdd.setOnClickListener {
//
//            bookList.add(BookVO(edBookName.text.toString(), edBookPrice.text.toString().toDouble()))
//            bookAdapter.notifyDataSetChanged()
//
//
//        }





        btnBookAdd.setOnClickListener {

            //bookList.add(BookVO(0, edBookName.text.toString(), edBookPrice.text.toString().toDouble()))

            var allbooks = ArrayList<BookVO>()

            mViewModel.insertBookListToDB(BookVO(0, edBookName.text.toString(), edBookPrice.text.toString().toDouble()))

            mViewModel.getAllBookListFromDB().observe(this, Observer {

                bookList.clear()

                for (books in it){

                    bookList.add(books)


                }


            })

            bookAdapter.notifyDataSetChanged()


        }




    }
}
