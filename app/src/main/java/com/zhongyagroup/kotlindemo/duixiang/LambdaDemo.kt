package com.zhongyagroup.kotlindemo.duixiang

/**
 * 对Lambda的应用demo
 * maxby求取当前集合length最长的字符串
 * map遍历映射成另外的值
 * filter,按条件筛选
 * ?.let非空判断
 */

var cons:String? = "herr"

fun main() {
    val mutableListOf = mutableListOf("sssss", "wwwwwww", "vvvvvvv")

    val maxBy = mutableListOf.maxBy { it.length }

    println("该集合中字符串最长的是：" + maxBy)

    val map = mutableListOf.map { it.toUpperCase() }
    var i = 0
    for (it in map) {
        println("转化后的集合数据第" + i + "位是：" + it)
        i++
    }

    val filter = mutableListOf.filter { it.length <= 5 }
        .map { it.toUpperCase() }        //建议先执行filter筛选方法，在执行map方法，防止资源浪费
    for (it in filter) {
        println(it)
    }

    val studert = null
    //在kotlin中会自动做非空判断，如：openstidert(studert),会直接报错
    //openstidert(studert)
    //在函数类型后加上？表示可以为空,但是加上问号后调用对象方法会提示不可操作，必须加上非空判断,或者在要执行的对象后加上？即studert?.doHomework()
    openstidert(null)


    println("传入数据，返回不为空的是" + isnull(null, "s"))
   /* if (cons != null) {
        postda()
    }*/

    //？.可以用来做非空判断
    cons?.let { cons->
        postda()
    }

    postName("无极")
    isPost(10,"sss")
}

       fun isPost(i : Int = 100,str:String ){
            println("我想看的书数是：${str},插入的数据是：$i")
        }

//字符串嵌入表达式正常应该是"当前我传人的名字是${obj.jname}"但是只有一个表达式的时候可以省略{}
    fun postName(name:String){
        println("当前我传人的名字是$name")
    }
/**
 * !!强制可以接受非空判断
 * 在执行此方法的时候判空，但是函数无法真正确定cons是否真的判空val conss = cons.toUpperCase()会报错，这时需要添加！！
 */
fun postda() {
    val conss = cons!!.toUpperCase()
    println(conss)
}

fun openstidert(studert: Studert?) {
    studert?.doHomework()
}

//？：对比两个数据如果a为空则返回b，
fun isnull(a: String?, b: String?): String? = a ?: b
