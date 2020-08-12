package com.zhongyagroup.kotlindemo.duixiang.Adapter

import android.transition.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zhongyagroup.kotlindemo.R
import com.zhongyagroup.kotlindemo.duixiang.Bean.MessageBean

class ChatAdapter(msgList: MutableList<MessageBean>) :
    RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    var msgList = msgList;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        val viewHolder = ViewHolder(inflate)
        return viewHolder
    }

    override fun getItemCount(): Int = msgList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val messageBean = msgList[position]
        if (messageBean.age == "女"){
            holder.relaman.visibility = View.GONE
            holder.relanv.visibility = View.VISIBLE
            holder.textnv.setText(messageBean.msg)
        }else{
            holder.relaman.visibility = View.VISIBLE
            holder.relanv.visibility = View.GONE
            holder.textman.setText(messageBean.msg)
        }

    }

    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val textman:TextView = view.findViewById(R.id.textman)
        val textnv:TextView = view.findViewById(R.id.textnv)
        val relaman:RelativeLayout = view.findViewById(R.id.rela_man)
        val relanv:RelativeLayout = view.findViewById(R.id.rela_nv)
    }

}
