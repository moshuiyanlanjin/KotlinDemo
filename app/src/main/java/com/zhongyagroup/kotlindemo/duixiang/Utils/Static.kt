package com.zhongyagroup.kotlindemo.duixiang.Utils

class Static {
    fun doAction1(){
        println("调用doAction1")
    }
    /**
     * companion object在类中生成伴生类，一个类中只有一个伴生类，外部可直接调用其中的方法
     * 近似于静态类，但是并不是静态，如果需要定义静态，则需要在函数上加注解@JvmStatic
     */
    companion object{

        fun doAction2(){                                                     //非静态
            println("调用doAction2")
        }
        @JvmStatic                                                            //静态
        fun doAction3(){
            println("调用doAction3")
        }
    }


}