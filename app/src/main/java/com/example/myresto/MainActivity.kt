package com.example.myresto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMenu: Button = findViewById(R.id.btn_menu)
        val btnScan: Button = findViewById(R.id.btn_scan)
        btnMenu.setOnClickListener(this)
        btnScan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_menu -> {
                val menuIntent = Intent(this@MainActivity, MenuActivity::class.java)
                startActivity(menuIntent)
            }

            R.id.btn_scan -> {
                val scanIntent = Intent(this@MainActivity, ScanActivity::class.java)
                startActivity(scanIntent)
            }
        }
    }
}