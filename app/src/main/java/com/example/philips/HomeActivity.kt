package com.example.philips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var tvHome: TextView
    lateinit var etContact:EditText
    lateinit var lvCountries:ListView
    var TAG = HomeActivity::class.java.simpleName
    var countries = arrayListOf<String>("India","USA","UK","Australia")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        etContact = findViewById(R.id.etContact)
      //  lvCountries = findViewById(R.id.countriesLV)
      //  var adapter:ArrayAdapter<String> = ArrayAdapter(this,arra)

        //var name  = intent.getStringExtra("namekey")
        //tvHome.setText(name)
    }



    fun handleClick(view: View) {
        var i = 0
        for(j in 1..10){
            i = i + j
        }
        var data = etContact.text.toString()
        var intent = Intent()
        intent.putExtra("contactkey", data)
        setResult(RESULT_OK,intent)
        finish()
    }

    /*fun cameraIntent(view: View) {
        var data = etContact.text.toString()
        var intent = Intent()
        intent.putExtra("contactkey", data)
        setResult(RESULT_OK,intent)
        finish()
    } */

}