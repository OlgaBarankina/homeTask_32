package com.example.hometask_32

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_news.view.*

class NewsAdapter(val listOfNews: ArrayList<News>, val context: MainActivity) : RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_news, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.picture.setImageBitmap(listOfNews[position].newspicture)
        holder.caption.text = listOfNews[position].caption
        holder.description.text = listOfNews[position].description
    }

    override fun getItemCount(): Int {
        return listOfNews.size
    }

}

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val picture = itemView.ivNews
    val caption = itemView.tvСaption
    val description = itemView.tvDescription


}