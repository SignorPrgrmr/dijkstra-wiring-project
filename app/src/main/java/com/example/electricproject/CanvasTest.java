package com.example.electricproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CanvasTest extends AppCompatActivity {
    private RelativeLayout relativeLayout;
    private TextView twTest;
    private  float x;
    private  float y;
    private  int verticesCount;
    private ArrayList<float []> vLocation;

    @SuppressLint({"ClickableViewAccessibility", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas_test);
        twTest = findViewById(R.id.tw_test);
        relativeLayout = findViewById(R.id.relative_layout);
        vLocation = new ArrayList<>();
        relativeLayout.setOnTouchListener((v, event) -> {
            x = event.getX();
            y = event.getY();
            if (event.getAction() == MotionEvent.ACTION_UP){
                twTest.setText("x is: " + x + " and y is: " + y);
                createBtn();
            }
            return true;
        });
    }

    @SuppressLint("SetTextI18n")
    private void createBtn() {
        relativeLayout = findViewById(R.id.relative_layout);
        Button btn = new Button(this);
        RelativeLayout.LayoutParams lp= new RelativeLayout.LayoutParams(80,80);
        btn.setLayoutParams(lp);
        btn.setX(x);
        btn.setY(y);
        btn.setBackgroundResource(R.drawable.vertices);
        btn.setId(verticesCount);
        verticesCount++;

        vLocation.add(new float[]{x, y});
        relativeLayout.addView(btn);

        btn.setOnClickListener((view) -> {
            int id = btn.getId();
            twTest.setText("btn id : " + id + " x : " + vLocation.get(id)[0] + " y : " + vLocation.get(id)[1]);
        });
    }
}