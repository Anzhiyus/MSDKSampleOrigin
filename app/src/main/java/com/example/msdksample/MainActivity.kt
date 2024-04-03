package com.example.msdksample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDJIMSDK()
    }

    private fun initDJIMSDK() {
        // 获得“在地图中显示无人机(OpenLayers)”按钮实例对象
        val btnMap = findViewById<Button>(R.id.btn_DJIMSDK)
        // 对“在地图中显示无人机(OpenLayers)”按钮增加监听器
        btnMap.setOnClickListener { // 弹出MapActivity
            val i = Intent(this, WaypointActivity::class.java)
            startActivity(i)
        }
    }

}