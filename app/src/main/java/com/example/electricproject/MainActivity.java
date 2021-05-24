package com.example.electricproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button takePhotoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        takePhotoBtn = findViewById(R.id.take_photo_btn);

        takePhotoBtn.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), captureImage.class);
            startActivity(intent);
        });
    }
}