package com.zhongyagroup.kotlindemo.duixiang.Adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.zhongyagroup.kotlindemo.R
import com.zhongyagroup.kotlindemo.duixiang.Bean.Fruit
import kotlinx.android.synthetic.main.item_fruit.view.*

class FruitAdapter(activity: Activity, itemFruit: Int, fruitLvst: MutableList<Fruit>) :
    ArrayAdapter<Fruit>(activity,itemFruit,fruitLvst) {

    val itemFruit = itemFruit

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view:View
        //converView为之前布局的缓存，判断是否有缓存如果有缓存直接使用缓存，没有的话，重新加载布局
        if(convertView == null){
            view = LayoutInflater.from(context).inflate(itemFruit,parent,false)
        }else{
            view = convertView
        }

        val image:ImageView = view.findViewById(R.id.image)
        val text:TextView = view.findViewById(R.id.text);
        val item = getItem(position)
        if (item != null){
            text.setText(item.name)
            image.setBackgroundResource(item.imageid)
        }
        return view
    }
}
