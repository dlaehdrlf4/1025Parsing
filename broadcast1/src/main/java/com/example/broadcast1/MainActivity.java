package com.example.broadcast1;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //뒤에께 오면 앞에있는 MyReceiver을 수행하자.
        registerReceiver(new MyReceiver(), new IntentFilter("com.example.sendbroadcast"));

    }
}
