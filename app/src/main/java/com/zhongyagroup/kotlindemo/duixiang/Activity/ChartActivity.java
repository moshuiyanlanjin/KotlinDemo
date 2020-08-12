package com.zhongyagroup.kotlindemo.duixiang.Activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.zhongyagroup.kotlindemo.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChartActivity extends Activity {

    private HorizontalBarChart bar;
    List<BarEntry>list;
    List<BarEntry>list2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        bar = (HorizontalBarChart) findViewById(R.id.bar);
        list=new ArrayList<>();
        list2=new ArrayList<>();

        //为第一组添加数据
        list.add(new BarEntry(1,new float[]{5,8}));
        list.add(new BarEntry(2,new float[]{2,8}));
        list.add(new BarEntry(3,new float[]{3,6}));
        list.add(new BarEntry(4,new float[]{7,5}));
        list.add(new BarEntry(5,new float[]{3,9}));



        BarDataSet barDataSet=new BarDataSet(list,"男");
        barDataSet.setColors(new int[]{Color.RED,Color.GRAY});    //为第一组柱子设置颜色
     //   BarDataSet barDataSet2=new BarDataSet(list2,"女");
     //   barDataSet2.setColor(Color.BLUE);   //为第二组柱子设置颜色
        BarData barData=new BarData(barDataSet);   //加上第一组

        //重点！！！ 加上第二组（多组也可以用同样的方法）  一定是以数据大小的降序添加
   //     barData.addDataSet(barDataSet2);

        bar.setData(barData);

        barData.setBarWidth(0.2f);//柱子的宽度


        bar.getAxisLeft().setAxisMaximum(18);   //Y轴最大数值
        bar.getAxisLeft().setAxisMinimum(0);   //Y轴最小数值
        //Y轴坐标的个数    第二个参数一般填false     true表示强制设置标签数 可能会导致X轴坐标显示不全等问题
        bar.getAxisLeft().setLabelCount(18,false);
        bar.getXAxis().setAxisMaximum(6);   //X轴最大数值
        bar.getXAxis().setAxisMinimum(0);   //X轴最小数值
        //X轴坐标的个数    第二个参数一般填false     true表示强制设置标签数 可能会导致X轴坐标显示不全等问题
        bar.getXAxis().setLabelCount(6,false);
        bar.getDescription().setEnabled(false);    //右下角一串英文字母不显示
        bar.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);   //X轴的位置设置为下  默认为上
        bar.getAxisRight().setEnabled(false);     //右侧Y轴不显示   默认为显示

        bar.setFitBars(true);
    }

  /*  private void initDate() {

        Random r = new Random(1);
        for (int i = 0; i < 3; i++) {
            barEntryDate = new ArrayList<>();
            for (int j = 0; j < 7; j++) {
                if(j == 2){
                    barEntryDate.add(new BarEntry(j,9));
                }else {
                    barEntryDate.add(new BarEntry(j, r.nextInt(5)));
                }
            }
            barEntryList.add(barEntryDate);
        }

        Log.d("我想拿到的数据是：",barEntryList.get(2).toString());

        sortList.add("方便面");
        sortList.add("矿泉水");
        sortList.add("面包");
        sortList.add("牛奶");
        sortList.add("饼干");
        sortList.add("乳酸菌");
        sortList.add("零食");
    }*/
}
