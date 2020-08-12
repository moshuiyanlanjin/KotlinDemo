package com.zhongyagroup.kotlindemo.duixiang.Activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zhongyagroup.kotlindemo.R
import com.zhongyagroup.kotlindemo.duixiang.Adapter.ChatAdapter
import com.zhongyagroup.kotlindemo.duixiang.Bean.MessageBean
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity: BaseActivity() {

    val msgList = mutableListOf<MessageBean>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val manage = LinearLayoutManager(this)
        recy.layoutManager = manage
        val adapter = ChatAdapter(msgList)
        recy.adapter = adapter


    }


}