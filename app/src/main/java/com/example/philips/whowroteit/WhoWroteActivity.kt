package com.example.philips.whowroteit

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.philips.R

class WhoWroteActivity : AppCompatActivity() {
    lateinit var mBookInput: EditText
    lateinit var mTitleText: TextView
    lateinit var mAuthorText:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_who_wrote)

        mBookInput = findViewById(R.id.bookInput);
        mTitleText = findViewById(R.id.titleText);
        mAuthorText = findViewById(R.id.authorText);
    }

    fun searchBooksApi(view: View) {
        val bookName = mBookInput.getText().toString()
        val fetchBookTask = FetchBookTask(mTitleText, mAuthorText)
        fetchBookTask.execute(bookName)
    }
}