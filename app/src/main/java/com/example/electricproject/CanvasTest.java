package com.example.electricproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CanvasTest extends AppCompatActivity {
    private ImageView ivCanvas;
    private TextView twTest;

    @SuppressLint({"ClickableViewAccessibility", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas_test);
        ivCanvas = findViewById(R.id.iv_canvas);
        twTest = findViewById(R.id.tw_test);
        ivCanvas.setOnTouchListener((v, event) -> {
            float x = event.getX();
            float y = event.getY();
            twTest.setText("x is: " + x + " and y is: " + y);
            return true;
        });

    }
}