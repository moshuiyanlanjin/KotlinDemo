package com.zhongyagroup.kotlindemo.duixiang.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zhongyagroup.kotlindemo.MainActivity
import com.zhongyagroup.kotlindemo.R
import com.zhongyagroup.kotlindemo.duixiang.Adapter.MainAdapter.ViewHolder

class MainAdapter(mainActivity: MainActivity, titlelist: MutableList<String>) :
    RecyclerView.Adapter<ViewHolder?>() {
    internal val mainActivity : MainActivity = mainActivity
    internal var titlelist:MutableList<String> = titlelist

    var onclike: Onclike? = null



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(mainActivity).inflate(R.layout.item_main, parent, false)
        val viewHolder = ViewHolder(inflate)
        return viewHolder
    }

    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        var text: TextView = view.findViewById(R.id.text)

    }

    interface Onclike{
        fun ItemOnClike(position: Int)
    }

    override fun getItemCount(): Int {
        return titlelist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.setText(titlelist[position])

        holder.text.setOnClickListener{
            onclike?.ItemOnClike(position)
        }
    }


    fun SetItemOnClike(onclike: Onclike){
        this.onclike = onclike
    }
}
