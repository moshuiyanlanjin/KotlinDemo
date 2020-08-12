package com.zhongyagroup.kotlindemo.duixiang.Activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.zhongyagroup.kotlindemo.R
import com.zhongyagroup.kotlindemo.duixiang.Adapter.PinterestAdapter
import com.zhongyagroup.kotlindemo.duixiang.Bean.Fruit
import kotlinx.android.synthetic.main.activity_pinterest.*
import java.lang.StringBuilder

class PinterestActivity : BaseActivity() {

    var fruitList = mutableListOf<Fruit>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pinterest)
        pinterstDate()
        val manager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        recy.layoutManager = manager
        val adapter = PinterestAdapter(this,fruitList)
        recy.adapter = adapter

    }

    private fun pinterstDate() {
        repeat(5){
            fruitList.add(Fruit(getRandomLengthString("无效....."),R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit(getRandomLengthString("几点........"),R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit(getRandomLengthString("无法........"),R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit(getRandomLengthString("到达........."),R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit(getRandomLengthString("蓝牙..........."),R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit(getRandomLengthString("二维.........."),R.drawable.ic_launcher_foreground))
            fruitList.add(Fruit(getRandomLengthString("三维........."),R.drawable.ic_launcher_foreground))

        }
    }

    private fun getRandomLengthString(str:String):String{
        //获取1到20直接的随机数
        val random = (1..20).random()
        val builder = StringBuilder()
        repeat(random){
            builder.append(str)
        }
        return builder.toString()
    }
}
