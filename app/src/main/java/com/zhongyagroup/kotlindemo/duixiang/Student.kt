package com.zhongyagroup.kotlindemo.duixiang

import android.util.Log

//继承和多态，疑难点，打印主类方法无法打印
class Studert(val sno : String,val grade : Int,name :String ,age :Int) : Person(name  ,age ),Study{
    override fun feadBooks() {
        println("姓名：" + name)
    }


    init {
        println("职业：" + sno)
        println("薪资：" + grade)
    }

    //次构造函数，，任何一个类只有一个主构造函数，但是可以有多个次构造函数
    constructor(name:String,age: Int):this("教师",5000,name,age){

    }

    constructor():this("",0){

    }
}

fun main(){
    val studert = Studert("干活", 2300,"张飒",22)
    println("我想看：" + studert.eat())
    doStudy(studert)

    val cellphone = Cellphone("玩", 12.8)
    val cellphone1 = Cellphone("玩", 12.8)

    println("当前数据类的数据是：" + cellphone.toString() + "---当前两个数据是一样的吗？" + (cellphone == cellphone1))

    Singleton.singletonTest()

    //listof不可变集合，既只读集合
    val listOf = listOf("语音", "后台", "无法")                                //集合相当于java中的arraylist，只能读取数据

    for (funit in listOf){
        println(funit)
    }

    val mutableListOf = mutableListOf("换T", "幻弓")                   //集合相当于java中的arraylist，可添加数据
    mutableListOf.add("神器")
    for (ds in mutableListOf)
        println(ds)

    val hashMap = HashMap<String, Int>()
    hashMap["Apple"] = 1
    hashMap["Banana"] = 2
    hashMap["第一"] = 3
    for ((str,num) in hashMap){
        println("key值为：" + str  + "...vule值为..." + num)

    }
    val mutableMapOf = mutableMapOf("张飒" to 1, "乌鸡" to 2, "yunyan" to 3)
    mutableMapOf["第三"] = 4

    for ((str , num) in mutableMapOf){
        println("key值为：" + str  + "...vule值为..." + num)
    }

    val mutableListOf1 = mutableListOf("ssss", "aaaaa", "5222222222222222")
    val lambda = {ful :String -> ful.length}                                    //lambda函数
    val maxWith = mutableListOf1.maxBy(lambda)                                        //获取最长的item
    println(maxWith)


    println(mutableListOf1.maxBy{it.length})                                                    //lambda求取最大函数的简化写法


    val listOf1 = listOf("aDaaa", "dsdsfd", "fdsfsdf","dssadasdafsa")                            //利用lambda的map函数将集合内的数据转为大写
    val map = listOf1.map { it.toUpperCase() }
    for (it in map){
        println(it)
    }

    val map1 = listOf1.filter { it.length <= 5 }.map { it.toUpperCase() }                        //filter,按条件过滤
    for (it in map1){
        println(it)
    }

    val any = listOf1.any { it.length <= 5 }                                                      //判断当前结合是否有数据满足条件
    val all = listOf1.all { it.length <= 5 }                                                       //判断当前集合是否所有数据都满足条件
    println("any的结果为：" + any + "...all的结果为：" + all)


    //
}

fun doStudy(study: Study) {
    study.doHomework()
    study.feadBooks()
}
