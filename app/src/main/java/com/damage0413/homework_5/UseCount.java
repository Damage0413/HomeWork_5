package com.damage0413.homework_5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class UseCount extends AppCompatActivity {

    SharedPreferences preferences;
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = getSharedPreferences("count", MODE_PRIVATE);
        //读取SharedPreferences里的count数据
        int count =preferences.getInt("count" , 0);
        //显示程序以前使用的次数
        Toast.makeText(this , "程序以前被使用了" + count + "次。",10000).show();
        SharedPreferences.Editor editor =preferences.edit();
        //存入数据
        editor.putInt("count" , ++count);
        //提交修改
        editor.commit();
    }
}