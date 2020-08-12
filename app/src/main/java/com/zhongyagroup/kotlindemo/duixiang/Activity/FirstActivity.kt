package com.zhongyagroup.kotlindemo.duixiang.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.zhongyagroup.kotlindemo.R
import com.zhongyagroup.kotlindemo.duixiang.Utils.Static
import com.zhongyagroup.kotlindemo.duixiang.Utils.top
import com.zhongyagroup.kotlindemo.duixiang.Utils.topsss
import kotlinx.android.synthetic.main.activity_first.*
import java.lang.StringBuilder

class FirstActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        button1.setOnClickListener{
            initView()
            Toast.makeText(this,"点击了",Toast.LENGTH_LONG).show()
        }

        Date()

    }

    private fun initView() {

        AlertDialog.Builder(this).apply {
            setTitle("弹框")
            setMessage("内容很经济")
            setCancelable(false)
            setPositiveButton("确定"){dialog,whichsssss-> println("关闭了")}
            setNegativeButton("取消"){d,w->}
            show()
        }

    }

    fun Date(){
        //with、run、apply这三个函数代表当前函数的this
        val listOf = listOf("张三", "李四", "乌鸡", "稍等")
        with(StringBuilder()){
            append("上午")
            for (fou in listOf){
                append(fou).append("\n")
            }
            append("kkkk")
            println(toString())
        }

        StringBuilder().run {
            append("上午")
            for (fou in listOf){
                append(fou).append("\n")
            }
            append("kkkk")
            println(toString())
        }

        StringBuilder().apply {
            append("上午")
            for (fou in listOf){
                append(fou).append("\n")
            }
            append("kkkk")
            println(toString())
        }

        Static.doAction2()

        Static.doAction3()

        top()                                                                      //调用TopUtile顶层类

        topsss()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item -> Toast.makeText(this,"添加",Toast.LENGTH_LONG).show()
            R.id.remove_item -> Toast.makeText(this,"删除",Toast.LENGTH_LONG).show()
        }
        return true
    }
}
