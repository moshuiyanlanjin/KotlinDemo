package com.zhongyagroup.kotlindemo.duixiang

//open,让此类可以被继承
open class Person(name:String,age:Int){

    var name = name
    var age = age

    fun eat(){
        println("姓名："+name + "\n年龄：" + age )
    }
}