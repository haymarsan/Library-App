package com.haymarsan.libraryapp.view.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.haymarsan.libraryapp.data.BookVO
import kotlinx.android.synthetic.main.activity_book_list.view.*
import kotlinx.android.synthetic.main.item_view_book_list.view.*

class BookViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {




    fun setData(bookVO: BookVO){

        itemView.tvBookName.text = itemView.edBookName.text.toString()
        itemView.tvBookPrice.text = itemView.edBookPrice.text.toString()

    }


}