package com.zhongyagroup.kotlindemo

/**
 * kotlin基础语法实例
 */

fun main(){
    println("运行了")
    var a = 10;
    println("当前数据：" + largerNumber(1,2).toString() + "......" + getScor("张峰") + "...." +
            checkumber(0.0) + "...." + getScore("张飒"));

    //从一到十
    /*for (i in 0 .. 10){
        println(i)
    }*/

    //左闭右开循环，【0,10）
 /*   for (i in 0 until 10){
        println(i)
    }*/

    //间隔2个数打印
   /* for (i in 0 until  10 step 2){
        println(i)
    }*/

    //倒序
    for (i in 10 downTo 1 step 2){
        println(i)
    }
}


fun largerNumber(num1:Int,num2:Int) = if (num1 > num2){
        num1
    }else{
        num2
    }

fun getScor(name : String) = when(name){
    "张飒" -> 76+10
    "sanfeng" -> 88
    else -> 0
}

fun checkumber(num :Number) = when(num){
    is Int -> "这是Int"
    is Double -> "这是Double"
    else -> "这个不识别"
}

fun getScore(name: String) = when{
    name.startsWith("张") -> 80
    name == "lisi" -> 56
    else -> 70
}