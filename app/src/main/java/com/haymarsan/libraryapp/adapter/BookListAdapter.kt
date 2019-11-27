package com.haymarsan.libraryapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.haymarsan.libraryapp.R
import com.haymarsan.libraryapp.data.BookVO
import com.haymarsan.libraryapp.view.holders.BookViewHolder
import kotlinx.android.synthetic.main.activity_book_list.view.*
import kotlinx.android.synthetic.main.item_view_book_list.view.*

class BookListAdapter(var bookList: ArrayList<BookVO>): RecyclerView.Adapter<BookListAdapter.BookViewHolder> () {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = BookViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_view_book_list, parent, false)
    )

    override fun getItemCount() = bookList.size


    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bindData(bookList[position])
    }


    inner class BookViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView){



        fun bindData(bookVO:BookVO){

            itemView.tvBookName.text = bookVO.bookName
            itemView.tvBookPrice.text = bookVO.bookPrice.toString()

        }



    }



}




