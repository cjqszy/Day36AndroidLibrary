package com.example.cln62.day36androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.mylibrary.Message;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Message message = new Message();

        message.toastMessage(this, "hello");


    }
}
