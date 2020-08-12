package com.zhongyagroup.kotlindemo.duixiang.Adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.zhongyagroup.kotlindemo.R
import com.zhongyagroup.kotlindemo.duixiang.Bean.Fruit

class PinterestAdapter(activity: Activity, fruitList: MutableList<Fruit>) :
    RecyclerView.Adapter<PinterestAdapter.ViewHolder>() {

    var fruitList = fruitList

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val text: TextView = view.findViewById(R.id.text)
        val image: ImageView = view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PinterestAdapter.ViewHolder {
        val inflate =
            LayoutInflater.from(parent.context).inflate(R.layout.item_pinterest, parent, false)
        val viewHolder = ViewHolder(inflate)
        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            val fruit = fruitList[position]
            Toast.makeText(parent.context,"当前点击的条目的姓名是：${fruit.name}",Toast.LENGTH_LONG ).show()
        }
        return viewHolder
    }

    override fun getItemCount(): Int = fruitList.size

    override fun onBindViewHolder(holder: PinterestAdapter.ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.text.setText(fruit.name)
        holder.image.setBackgroundResource(fruit.imageid)
    }

}
