package com.zhongyagroup.kotlindemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zhongyagroup.kotlindemo.duixiang.Activity.*
import com.zhongyagroup.kotlindemo.duixiang.Adapter.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var titlelist:MutableList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDate()
        initView()

    }

    companion object{
        fun sctionStart(
            context: Context,
            activity: Class<FirstActivity>
        ){
            val intent = Intent(context,activity)
            context.startActivity(intent)
        }
    }

    private fun initView() {
        val linearLayoutManager = LinearLayoutManager(this)
        recy.layoutManager = linearLayoutManager
        val mainAdapter = MainAdapter(this, titlelist)
        recy.adapter = mainAdapter

        mainAdapter.SetItemOnClike(object :MainAdapter.Onclike{
            override fun ItemOnClike(position: Int) {
                postActivity(position)
            }

        })
    }

    private fun postActivity(position: Int) {
        val intent:Intent
        when(position){
            0 -> {
                MainActivity.sctionStart(this,FirstActivity::class.java)
               /* intent = Intent(this,FirstActivity::class.java)
                startActivity(intent)*/
            }
            1->{
                intent = Intent(this, ChartActivity::class.java)
                startActivity(intent)
            }
            2->{
                intent = Intent(this,ListViewActivity::class.java)
                startActivity(intent)
            }
            3->{
                intent = Intent(this, RectcleViewActivity::class.java)
                startActivity(intent)
            }
            4-> {
                intent = Intent(this, PinterestActivity::class.java)
                startActivity(intent)
            }
        }


    }




    private fun initDate() {
        titlelist =  mutableListOf("Activity")
        titlelist.add("图表")
        titlelist.add("ListView")
        titlelist.add("RecycleView")
        titlelist.add("瀑布流")
    }


}
