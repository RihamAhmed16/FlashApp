package com.example.flash_light;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Camera;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    ImageButton switchoff,switchon;
    Camera camera ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        switchoff = findViewById(R.id.ic_off);
        switchon = findViewById(R.id.ic_on);
        camera = Camera.open();
        final Camera.Parameters parameters= camera.getParameters();

        switchoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchoff.setVisibility(View.GONE);
                switchon.setVisibility(View.VISIBLE);
                parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
               // parameters.setFlashMode(Camera.Parameters.FLASH_MODE_ON);
               camera.setParameters(parameters);
               camera.startPreview();
            }
        });
switchon.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        switchoff.setVisibility(View.VISIBLE);
        switchon.setVisibility(View.GONE);
        parameters.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
        camera.setParameters(parameters);
        camera.stopPreview();
    }
});
    }
}