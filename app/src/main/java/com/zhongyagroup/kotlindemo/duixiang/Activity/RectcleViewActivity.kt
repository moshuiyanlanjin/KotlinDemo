package com.zhongyagroup.kotlindemo.duixiang.Activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zhongyagroup.kotlindemo.R
import com.zhongyagroup.kotlindemo.duixiang.Adapter.RectcleviewAdapter
import com.zhongyagroup.kotlindemo.duixiang.Bean.Fruit
import kotlinx.android.synthetic.main.activity_recycleview.*

class RectcleViewActivity : BaseActivity() {

    var fruitList = mutableListOf<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleview)
        initFruit()
        val Manager = LinearLayoutManager(this)
        recy.layoutManager = Manager
        val adapter = RectcleviewAdapter(this,R.layout.item_fruit,fruitList)
        recy.adapter = adapter
    }

    private fun initFruit() {

        repeat(5){
            fruitList.add(Fruit("白居易",R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit("无敌",R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit("寂寞",R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit("诗仙",R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit("李白",R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit("诗词战神",R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit("辛弃疾",R.drawable.ic_launcher_foreground))

        }
    }
}
