package com.zhongyagroup.kotlindemo.duixiang.Utils

import android.app.Activity


object ActivityCollector {
    private var Activitylist = ArrayList<Activity>();


    fun addActivity(activity: Activity) {
        Activitylist.add(activity)
    }

    fun romeActivity(activity: Activity){
        Activitylist.remove(activity)
    }

    fun finshActivity(){
        for (act in Activitylist){
            if(act != null){
                act.finish()
            }
        }
        Activitylist.clear()
    }
}