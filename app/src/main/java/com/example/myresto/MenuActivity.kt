package com.example.myresto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.shashank.sony.fancytoastlib.FancyToast
import java.util.ArrayList

class MenuActivity : AppCompatActivity(), View.OnClickListener {

    private val list: ArrayList<Menu> = ArrayList<Menu>()
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val rvMenu = findViewById<RecyclerView>(R.id.rv_menu)
        val btnOrder = findViewById<RelativeLayout>(R.id.btn_order)
        btnOrder.setOnClickListener(this)

        // If size of the all items are equal and won't change for a better performance it's better to set setHasFixedSize to true
        rvMenu.setHasFixedSize(true)

        // Creating an instance of our NameAdapter class and setting it to our RecyclerView
        list.addAll(MenuData.listData)
        val menuAdapter = MenuAdapter(list)
        rvMenu.adapter = menuAdapter
        // Setting our RecyclerView's layout manager equal to LinearLayoutManager
        rvMenu.layoutManager = LinearLayoutManager(this)
        menuAdapter.notifyDataSetChanged()


    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_order -> {
                Toast.makeText(this, "Order kami proses dulu ya! ;)", Toast.LENGTH_LONG).show()
                Handler().postDelayed({
                    val mainIntent = Intent(this, MainActivity::class.java)
                    startActivity(mainIntent)
                    finish()
                }, 2000)

            }
        }
    }

    fun numIncrease(){
        counter++
        val tvOrder : TextView = findViewById(R.id.tv_order)
        tvOrder.text = "ORDER (${counter})"
    }

    fun numDecrease(){
        counter--
        val tvOrder : TextView = findViewById(R.id.tv_order)
        tvOrder.text = "ORDER (${counter})"
    }
}