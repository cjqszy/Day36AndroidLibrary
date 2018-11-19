package com.example.cln62.day36androidlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.Message

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val msg : Message = Message()

//        msg.toastMessage(this, "hello")
    }
}
