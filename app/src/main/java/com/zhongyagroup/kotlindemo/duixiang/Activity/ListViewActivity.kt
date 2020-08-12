package com.zhongyagroup.kotlindemo.duixiang.Activity

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.zhongyagroup.kotlindemo.R
import com.zhongyagroup.kotlindemo.duixiang.Adapter.FruitAdapter
import com.zhongyagroup.kotlindemo.duixiang.Bean.Fruit
import kotlinx.android.synthetic.main.activity_listview.*

class ListViewActivity : AppCompatActivity(){

    var data = mutableListOf("语文","数学","生物","物理")

    var fruitLvst = mutableListOf<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)
        /*//调用系统布局的listview
        val arrayAdapter =
            ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, data)

        listView.adapter = arrayAdapter*/

        initFruist()

        val adapter = FruitAdapter(this,R.layout.item_fruit,fruitLvst)
        listView.adapter = adapter
    }

    private fun initFruist() {
        //将数据添加5遍
        repeat(5){
            fruitLvst.add(Fruit("张飒",R.drawable.ic_launcher_background))
            fruitLvst.add(Fruit("无情",R.drawable.ic_launcher_background))
            fruitLvst.add(Fruit("天数",R.drawable.ic_launcher_background))
            fruitLvst.add(Fruit("蓝菲",R.drawable.ic_launcher_background))
        }
    }
}