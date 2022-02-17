package com.example.flash_light;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private static int splash_screen =5000 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    new Handler().postDelayed(new Runnable(){
    @Override
    public void run() {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
    }
},splash_screen);

    }
}