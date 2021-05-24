package com.example.electricproject.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.electricproject.R;

public class MainActivity extends AppCompatActivity {
    private Button btnCanvas;
    private Button btnCapture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCanvas = findViewById(R.id.btn_canvas);
        btnCapture = findViewById(R.id.btn_capture);
        btnCapture.setOnClickListener((v)->{
            Intent intent = new Intent(v.getContext(), CaptureImage.class);
            startActivity(intent);
        });




        btnCanvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CanvasTest.class);
                startActivity(intent);
            }
        });
    }
}