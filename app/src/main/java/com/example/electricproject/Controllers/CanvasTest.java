package com.example.electricproject.Controllers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.electricproject.Interfaces.ICanvasTest;
import com.example.electricproject.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CanvasTest extends AppCompatActivity implements ICanvasTest {

    private RelativeLayout relativeLayout;
    private TextView twTest;
    private float x;
    private float y;
    private int verticesCount;
    private ArrayList<float[]> vLocation;
    private ArrayList<Button> buttons;
    private FloatingActionButton fabDraw;
    private LinearLayout layoutFabs;
    private LinearLayout layoutMain;
    private Button btnClear;
    private Button btnSubmit;
    private FloatingActionButton fabJunctionBox;
    private FloatingActionButton fabKey;
    private FloatingActionButton fabPowerSource;
    private FloatingActionButton fabLine;
    private boolean flagFabKey;
    private boolean flagFabPowerSource;
    private boolean flagFabJunctionBox;
    private boolean flagFabLine;

    private float x1,y1,x2,y2;
    private int[] linePointsId ={0,1};

    @SuppressLint({"ClickableViewAccessibility", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas_test);
//====================================================Start of Initialize All Stuff==============//
        btnSubmit = findViewById(R.id.btn_submit);
        twTest = findViewById(R.id.tw_test);
        relativeLayout = findViewById(R.id.relative_layout);
        fabDraw = findViewById(R.id.fab_draw);
        layoutFabs = findViewById(R.id.layout_fabs);
        layoutMain = findViewById(R.id.layout_main);
        btnClear = findViewById(R.id.btn_clear);
        fabJunctionBox = findViewById(R.id.fab_junction_box);
        fabKey = findViewById(R.id.fab_key);
        fabPowerSource = findViewById(R.id.fab_power_source);
        fabLine = findViewById(R.id.fab_line);
        buttons = new ArrayList<>();
        vLocation = new ArrayList<>();
        flagFabKey = false;
        flagFabPowerSource = false;
        flagFabJunctionBox = false;
        flagFabLine = false;
//====================================================End of Initialize All Stuff==============//

//====================================================Start of Submit============//

        btnSubmit.setOnClickListener((v) -> {
            // make and submit graph
        });


//=====================================================End of Submit============//

//======================================================Start of Fabs===================//
        fabDraw.setOnClickListener((v) -> {
            layoutFabs.setVisibility(View.VISIBLE);
        });
        fabJunctionBox.setOnClickListener((v) -> {
            if (!flagFabJunctionBox) {
                chooseOneFab(JUNCTIONBOX);
            }

        });
        fabKey.setOnClickListener((v) -> {
            if (!flagFabKey) {
                chooseOneFab(KEY);
            }

        });
        fabPowerSource.setOnClickListener((v) -> {
            if (!flagFabPowerSource) {
                chooseOneFab(POWERSOURCE);
            }
        });
        fabLine.setOnClickListener((v) -> {
            if (!flagFabLine) {
                chooseOneFab(LINE);
            }
        });
//=======================================================End of Fabs==================//
        btnClear.setOnClickListener((v) -> {
            Intent intent = new Intent(v.getContext(), CanvasTest.class);
            startActivity(intent);
        });
        layoutMain.setOnClickListener((v -> {
            layoutFabs.setVisibility(View.INVISIBLE);
        }));
//==============================================================Start of Canvas=========//
        relativeLayout.setOnTouchListener((v, event) -> {
            x = event.getX();
            y = event.getY();
            if (event.getAction() == MotionEvent.ACTION_UP) {
                twTest.setText("x is: " + x + " and y is: " + y);
                if (!(!flagFabPowerSource && !flagFabKey && !flagFabJunctionBox)) {
                    if (flagFabJunctionBox) {
                        alertJunctionBox();
                    }
                    if (flagFabKey) {
                        alertKey();
                    }
                    if (flagFabPowerSource) {
                        alertPowerSource();
                    }
                }
            }
            return true;
        });
//==============================================================End of Canvas==========//


    }
//=======================================================Start of Create Button======//
    @SuppressLint("SetTextI18n")
    private void createBtn() {
        relativeLayout = findViewById(R.id.relative_layout);
        Button btn = new Button(this);
        int btnSize = 80;
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(btnSize, btnSize);
        btn.setLayoutParams(lp);
        btn.setX(x - btnSize / 2);
        btn.setY(y - btnSize / 2);
        if (flagFabJunctionBox) {
            btn.setBackgroundResource(R.drawable.junction_box);
            vLocation.add(new float[]{x, y, TYPE_JUNCTIONBOX});
        }
        if (flagFabKey) {
            btn.setBackgroundResource(R.drawable.key);
            vLocation.add(new float[]{x, y, TYPE_KEY});
        }
        if (flagFabPowerSource) {
            btn.setBackgroundResource(R.drawable.power_source);
            vLocation.add(new float[]{x, y, TYPE_POWERSOURCE});
        }
        btn.setId(verticesCount);
        verticesCount++;

        relativeLayout.addView(btn);
        buttons.add(btn);
        btn.setOnClickListener((view) -> {
            int id = btn.getId();
            twTest.setText(
                    "btn id : " + id
                    + " x : " + vLocation.get(id)[0]
                    + " y : " + vLocation.get(id)[1]
                    + " type: " + vLocation.get(id)[2]
            );
        });
    }
//========================================================End of Create Button======//

//=====================================================Start of Alerts=======//
    private void alertJunctionBox() {
        alertPutButton(JUNCTIONBOX);
    }
    private void alertPowerSource() {
        alertPutButton(POWERSOURCE);

    }
    private void alertKey() {
        alertPutButton(KEY);
    }
    private void alertPutButton(String element) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Put A " + element + "?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        createBtn();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.setTitle("Put Element Down");
        alert.show();
    }
//=======================================================End of Alerts======//
    private void chooseOneFab(String chosen) {
        if (chosen.equals(JUNCTIONBOX)) {
            flagFabJunctionBox = true;
            flagFabPowerSource = false;
            flagFabLine = false;
            flagFabKey = false;
            fabLine.getBackground().setAlpha(255);
            fabPowerSource.getBackground().setAlpha(255);
            fabKey.getBackground().setAlpha(255);
            fabJunctionBox.getBackground().setAlpha(150);
        }
        if (chosen.equals(KEY)) {
            flagFabJunctionBox = false;
            flagFabPowerSource = false;
            flagFabLine = false;
            flagFabKey = true;
            fabLine.getBackground().setAlpha(255);
            fabPowerSource.getBackground().setAlpha(255);
            fabKey.getBackground().setAlpha(150);
            fabJunctionBox.getBackground().setAlpha(255);
        }
        if (chosen.equals(POWERSOURCE)) {
            flagFabJunctionBox = false;
            flagFabPowerSource = true;
            flagFabLine = false;
            flagFabKey = false;
            fabLine.getBackground().setAlpha(255);
            fabPowerSource.getBackground().setAlpha(150);
            fabKey.getBackground().setAlpha(255);
            fabJunctionBox.getBackground().setAlpha(255);
        }

        if (chosen.equals(LINE)) {
            flagFabJunctionBox = false;
            flagFabPowerSource = false;
            flagFabLine = true;
            flagFabKey = false;
            fabLine.getBackground().setAlpha(200);
            fabPowerSource.getBackground().setAlpha(255);
            fabKey.getBackground().setAlpha(255);
            fabJunctionBox.getBackground().setAlpha(255);
        }
    }

    private void clickOnButtons() {

    }
//=========================================Start of Draw Line=============//
    @SuppressLint("SetTextI18n")
    private void drawLine(int weight){
        x1 = vLocation.get(linePointsId[0])[0];
        y1 = vLocation.get(linePointsId[0])[1];
        x2 = vLocation.get(linePointsId[1])[0];
        y2 = vLocation.get(linePointsId[1])[1];
        relativeLayout = findViewById(R.id.relative_layout);
        //imageview for edge
        ImageView iv = new ImageView(this);
        //textview for weight
        TextView tw = new TextView(this);
        int x = (int)(x2-x1);
        int y = (int)(y2-y1);
        int width = Math.abs(x);
        int height = Math.abs(y);
        RelativeLayout.LayoutParams lp_iv = new RelativeLayout.LayoutParams(width, height);
        RelativeLayout.LayoutParams lp_tw = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        iv.setX(Math.min(x1,x2));
        iv.setY(Math.min(y1,y2));
        tw.setX(Math.min(x1,x2)+(width/2));
        tw.setY(Math.min(y1,y2)+(height/2)-100);
        iv.setLayoutParams(lp_iv);
        tw.setLayoutParams(lp_tw);
        tw.setText(""+weight);
        tw.setTextSize(20);
        if(x*y >=0){
            iv.setBackgroundResource(R.drawable.ic_left_diagonal);
        }else {
            iv.setBackgroundResource(R.drawable.ic_right_diagonal);
        }
        relativeLayout.addView(iv);
        relativeLayout.addView(tw);
    }
//================================================End of Draw Line=======//
}