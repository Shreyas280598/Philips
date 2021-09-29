package com.example.philips

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var etname:EditText
    lateinit var tvRes: TextView
    lateinit var pass:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etname = findViewById(R.id.etName)
        tvRes = findViewById(R.id.textView)
        pass = findViewById(R.id.editTextTextPassword)


    }

    fun clickHandler(view: android.view.View) {
        //setTextView()
        var dial = pass.text.toString()
        when(view.id){
            R.id.button-> {
                //startHome()
                setTextView()
            }
            R.id.dial->{
                var dIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$dial"))
                startActivity(dIntent)
            }

            R.id.alarm->{
                createAlarm("Hello wake up",17,1)
            }

            R.id.timer -> {
                startTimer("Wake Up",5)
            }
        }

    }

    private fun startHome() {
        var hIntent: Intent = Intent(this, HomeActivity::class.java);//Explicit intent
        //hIntent.putExtra("namekey", data)
        startActivityForResult(hIntent,123)
    }

    private fun setTextView() {
        var name: String = etname.text.toString()
        tvRes.text = name
    }

    fun createAlarm(message: String, hour: Int, minutes: Int) {
        val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
            putExtra(AlarmClock.EXTRA_HOUR, hour)
            putExtra(AlarmClock.EXTRA_MINUTES, minutes)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    fun startTimer(message: String, seconds: Int) {
        val intent = Intent(AlarmClock.ACTION_SET_TIMER).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
            putExtra(AlarmClock.EXTRA_LENGTH, seconds)
            putExtra(AlarmClock.EXTRA_SKIP_UI, true)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        var data = intent?.getStringExtra("contactkey")
        tvRes.text = data


    }

}