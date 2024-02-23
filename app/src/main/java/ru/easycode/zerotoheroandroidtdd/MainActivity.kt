package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val linearLayout = LinearLayout(this)
        val textView = TextView(this)
        textView.id = R.id.titleTextView
        textView.text = "I am an Android Developer!"

        val button = Button(this)
        button.text = "Click me"
        button.height = 70

        linearLayout.addView(textView)
        linearLayout.addView(button)
        setContentView(linearLayout)
    }
}