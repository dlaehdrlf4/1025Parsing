package com.example.module3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //앱을 죽이면 죽는다.
       /* Thread th = new Thread() {
            public void run() {
                for (int i = 0; i < 30; i = i + 1) {
                    try {
                        Thread.sleep(1000);
                        Log.e("Thread", i + "");

                    } catch (Exception e) {
                    }
                }
            }
        };
        th.start();*/
       //앱을 종료시키면 그냥 죽어버린다. 앱이 실행중이 아니면 스레드와 인텐트 서비스는 죽어버린다.
       //인텐트 서비스
       /* Intent intent = new Intent(this,MyIntentService.class);
        //서비스 실행
        startService(intent);*/


       // 앱이 죽어서 동작한다.
        //스타트 서비스
        Intent intent1 = new Intent(this,MyService.class);
        startService(intent1);


    }
}
