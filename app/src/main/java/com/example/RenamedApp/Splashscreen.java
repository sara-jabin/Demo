package com.example.RenamedApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Splashscreen extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splashscreen);
        progressBar = (ProgressBar) findViewById(R.id.progressBarId);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }
        });
        thread.start();
    }

    private void startApp() {

        Intent intent = new Intent(Splashscreen.this,MainActivity.class);
        startActivity(intent);
        finish();


    }

    private void doWork() {
        for (progress = 20; progress <= 100; progress = progress + 20) {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}