package com.example.lesson4activityforresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_checkfilm.*

class CheckFilm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkfilm)

        val tvcbFirst = findViewById<TextView>(R.id.tvCbFirst)
        val tvcbSecond = findViewById<TextView>(R.id.tvCbSecond)
        val tvcbThird = findViewById<TextView>(R.id.tvCbThird)
        val bnBack = findViewById<Button>(R.id.bnBack)

        bnBack.setOnClickListener {
            val First_checkbox: Boolean = cbFirst.isChecked
            val Second_checkbox: Boolean = cbSecond.isChecked
            val Third_checkbox: Boolean = cbThird.isChecked
            val intent = Intent()
            intent.putExtra("First_checkbox", First_checkbox)
            intent.putExtra("TextViewFirst", tvCbFirst.text.toString())
            intent.putExtra("Second_checkbox", Second_checkbox)
            intent.putExtra("TextViewSecond", tvcbSecond.text.toString())
            intent.putExtra("Third_checkbox", Third_checkbox)
            intent.putExtra("TextViewThird", tvcbThird.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()}
    }
}