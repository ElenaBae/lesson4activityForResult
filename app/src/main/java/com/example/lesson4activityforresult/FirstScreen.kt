package com.example.lesson4activityforresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_firstscreen.*

class FirstScreen : AppCompatActivity() {

      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstscreen)

        val tvFirst = findViewById<TextView>(R.id.tvFirst)
        val tvSecond = findViewById<TextView>(R.id.tvSecond)
        val tvThird = findViewById<TextView>(R.id.tvThrid)
        val btGo = findViewById<Button>(R.id.btGo)

        btGo.setOnClickListener {
            val intent = Intent(applicationContext, CheckFilm::class.java)
            startActivityForResult(intent,1)}
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val tvFirst = findViewById<TextView>(R.id.tvFirst)
        val tvSecond = findViewById<TextView>(R.id.tvSecond)
        val tvThird = findViewById<TextView>(R.id.tvThrid)

        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            val firstText = data?.getStringExtra("TextViewFirst")
            val firstCheckBox = data?.getBooleanExtra("First_checkbox", false)

            if (firstCheckBox!!) {
                tvFirst?.text = firstText
            } else {
                tvFirst?.text = "Не выбран"
            }

            val secondText = data?.getStringExtra("TextViewSecond")
            val secondCheckBox = data?.getBooleanExtra("Second_checkbox", false)

            if (secondCheckBox!!) {
                tvSecond?.text = secondText
            } else {
                tvSecond?.text = "Не выбран"
            }

            val thirdText = data?.getStringExtra("TextViewThird")
            val thirdCheckBox = data?.getBooleanExtra("Third_checkbox", false)

            if (thirdCheckBox!!) {
                tvThird?.text = thirdText
            } else {
                tvThird?.text = "Не выбран"
            }
        }
    }
}


