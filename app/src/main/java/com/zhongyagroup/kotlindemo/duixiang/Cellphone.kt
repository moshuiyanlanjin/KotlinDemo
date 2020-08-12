package com.zhongyagroup.kotlindemo.duixiang

//数据类，deta关键字，表明希望这个类为数据类，Kotlin会根据主构造参数帮忙生成toString、equals、hasjCode
data class Cellphone(val brand:String,val price : Double)