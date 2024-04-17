package com.example.atividade_ademar;

import static java.lang.Thread.sleep;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    try {
                        sleep(5050);
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        finish();
                    } catch(InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
            }; thread1.start();

    }
}