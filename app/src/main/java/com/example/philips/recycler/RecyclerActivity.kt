package com.example.philips.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.philips.R

class RecyclerActivity : AppCompatActivity() {
    var coutries = arrayListOf<String>("india","usa","uk","australia","india","usa","uk","australia")//plug
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler) //layout inflater
        recyclerView = findViewById(R.id.countriesRV)  //taking the handle of recyclerview

        var adapter = WordsAdapter(coutries)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.adapter = adapter

    }
}