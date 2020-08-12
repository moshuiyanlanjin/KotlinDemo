package com.zhongyagroup.kotlindemo.duixiang.Adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zhongyagroup.kotlindemo.R
import com.zhongyagroup.kotlindemo.duixiang.Bean.Fruit
import kotlinx.android.synthetic.main.item_fruit.view.*

class RectcleviewAdapter(activity: Activity, itemFruit: Int, fruitList: MutableList<Fruit>) :
    RecyclerView.Adapter<RectcleviewAdapter.ViewHolder>() {
    val itemFruit:Int = itemFruit
    val fruitList = fruitList
    val activity = activity

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val image:ImageView = view.findViewById(R.id.image)
        val text:TextView = view.findViewById(R.id.text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(itemFruit,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = fruitList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.image.setBackgroundResource(fruit.imageid)
        holder.text.setText(fruit.name)
    }



}
