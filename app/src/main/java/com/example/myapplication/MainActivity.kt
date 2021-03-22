package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val <Button>bt = findViewById<Button>(R.id.button)
        bt.setOnClickListener { addnickname(it) }


    }



    private fun addnickname(view:View){
        val editText = findViewById<EditText>(R.id.nick_name_edit)
        val nickname_TV = findViewById<TextView>(R.id.resulttext)

        nickname_TV.text = editText.text
        editText.visibility = View.GONE

        view.visibility = View.GONE
        nickname_TV.visibility = View.VISIBLE

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)

    }



    private fun updateNickname(view:View){
        val editText:EditText = findViewById(R.id.nick_name_edit)
        val doneButton = findViewById<Button>(R.id.button)

        


    }
}