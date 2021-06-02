package com.example.electricproject.Controllers;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.electricproject.Classes.DijkstraAlgorithm;
import com.example.electricproject.Classes.GraphEdge;
import com.example.electricproject.Classes.GraphNode;
import com.example.electricproject.Classes.GraphNodeType;
import com.example.electricproject.Interfaces.ICanvasTest;
import com.example.electricproject.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CanvasTest extends AppCompatActivity implements ICanvasTest {

    private RelativeLayout relativeLayout;
    private TextView twTest;
    private float x;
    private float y;
    private int verticesCount;
    private ArrayList<float[]> vLocation;
    private ArrayList<int[]> connected;
    private ArrayList<Button> buttons;
    private ArrayList<GraphNode> nodes;
    private ArrayList<GraphNode> resultNodes;
    private FloatingActionButton fabDraw;
    private LinearLayout layoutFabs;
    private LinearLayout layoutMain;
    private Button btnClear;
    private Button btnSubmit;
    private FloatingActionButton fabJunctionBox;
    private FloatingActionButton fabKey;
    private FloatingActionButton fabPowerSource;
    private FloatingActionButton fabLine;
    private FloatingActionButton fabRemoveBtn;
    private boolean flagFabKey;
    private boolean flagFabPowerSource;
    private boolean flagFabJunctionBox;
    private boolean flagFabLine;
    private boolean flagFabRemoveBtn;
    private float x1, y1, x2, y2;
    private int[] linePointsId = {0, 1};
    private Button btnTmp;
    private boolean selected;
    private ArrayList<ImageView> imageViews;
    private ArrayList<TextView> textViews;
    private String btnSubmitState;
    private GraphNode result;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @SuppressLint({"ClickableViewAccessibility", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas_test);
        snack(findViewById(R.id.layout_main), "Click On " + getEmoji(0x1F58A) + "To Choose Elements");
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
        fabRemoveBtn = findViewById(R.id.fab_remove_btn);
        buttons = new ArrayList<>();
        vLocation = new ArrayList<>();
        connected = new ArrayList<>();
        nodes = new ArrayList<>();
        imageViews = new ArrayList<>();
        textViews = new ArrayList<>();
        resultNodes = new ArrayList<>();
        flagFabKey = false;
        flagFabPowerSource = false;
        flagFabJunctionBox = false;
        flagFabLine = false;
        flagFabRemoveBtn = false;
        btnSubmitState = SUBMITBUTTONSTATE_SUBMIT; // submit
//====================================================End of Initialize All Stuff==============//

//====================================================Start of Submit============//

        btnSubmit.setOnClickListener((v) -> {
            if (btnSubmitState.equals(SUBMITBUTTONSTATE_SUBMIT)) {
                if (powerSourceAvailability()) {
                    btnSubmitState = SUBMITBUTTONSTATE_RESULTSHOWING;
                    btnSubmit.setText("Change");
                    makeButtonsInvisible();
                    makeImagieviewsInvisible();
                    makeTextViewsInvisible();
                    GraphNode head = makeGraph();
                    DijkstraAlgorithm solution = new DijkstraAlgorithm();
                    head = solution.findTheOptimumSolution(head, nodes.size());
                    //resultNodes.add(result);
//                    showResult();
                    snack(v, "No Problem Bro");
                  List<GraphNode> adj=  nodes.get(0).adjacentNodes();

                    twTest.setText(adj.get(0).getName() + " " + adj.get(0).getType());
                } else {
                    alertNoPowerSource();
                }
            }
            if (btnSubmitState.equals(SUBMITBUTTONSTATE_RESULTSHOWING)) {
//                relativeLayout.setVisibility(View.VISIBLE);
//                resultRelativeLayout.setVisibility(View.GONE);
//                btnSubmitState = SUBMITBUTTONSTATE_UNPROCCESSEDGRAPH;
            }
            if (btnSubmitState.equals(SUBMITBUTTONSTATE_UNPROCCESSEDGRAPH)) {
//                relativeLayout.setVisibility(View.GONE);
//                resultRelativeLayout.setVisibility(View.VISIBLE);
//                btnSubmitState = SUBMITBUTTONSTATE_RESULTSHOWING;
            }

        });

//=====================================================End of Submit============//

//======================================================Start of Fabs===================//
        fabDraw.setOnClickListener((v) -> {
            layoutFabs.setVisibility(View.VISIBLE);
        });
        fabJunctionBox.setOnClickListener((v) -> {
            if (!flagFabJunctionBox) {
                snack(v, "Choosing Junction Box" + getEmoji(0x1F9F0));
                chooseOneFab(JUNCTIONBOX);
                unSelectButtons();
                btnTmp = null;
                selected = false;
            }

        });
        fabKey.setOnClickListener((v) -> {
            if (!flagFabKey) {
                snack(v, "Choosing Key" + getEmoji(0x1F5DD));
                chooseOneFab(KEY);
                unSelectButtons();
                btnTmp = null;
                selected = false;
            }

        });
        fabPowerSource.setOnClickListener((v) -> {
            if (!flagFabPowerSource) {
                snack(v, "Choosing Power Source" + getEmoji(0x1F50B));
                chooseOneFab(POWERSOURCE);
                unSelectButtons();
                btnTmp = null;
                selected = false;
            }
        });
        fabRemoveBtn.setOnClickListener((v) -> {
            if (!flagFabRemoveBtn) {
                snack(v, "Choosing Remove");
                chooseOneFab(REMOVE);
                unSelectButtons();
                btnTmp = null;
                selected = false;
            }

        });
        fabLine.setOnClickListener((v) -> {
            if (!flagFabLine) {
                snack(v, "Draw Line Between Elements" + getEmoji(0x2195));
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
                } else if (flagFabLine) {
                    unSelectButtons();
                    btnTmp = null;
                    selected = false;
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
        btn.setText("" + verticesCount);
        btn.setPadding(0, 0, 0, 1);
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
            if (flagFabLine) {
                if (selected) {
                    if (btnTmp != null) {
                        if (btn.getId() != btnTmp.getId()) {
                            linePointsId[1] = btn.getId();
                            alertPutLine(btn);
                        }
                    } else {
                        selected = false;
                    }
                } else {
                    btnTmp = btn;
                    selectButton(btnTmp);
                    linePointsId[0] = btnTmp.getId();
                }
            } else if (flagFabRemoveBtn) {
                twTest.setText("remove " + id);
                alertRemoveBtn(id);
            }
        });
    }

    //========================================================End of Create Button======//
//=====================================================Start of Alerts=======//
    private void alertJunctionBox() {
        alertPutButton(JUNCTIONBOX, getEmoji(0x1F9F0));
    }

    private void alertPowerSource() {
        alertPutButton(POWERSOURCE, getEmoji(0x1F50B) + getEmoji(0x26A1));

    }

    private void alertKey() {
        alertPutButton(KEY, getEmoji(0x1F5DD));
    }

    private void alertPutButton(String element, String emoji) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Put A " + element + "?")
                .setCancelable(false)
                .setPositiveButton("Yes", (dialog, which) -> createBtn()).
                setNegativeButton("No", (dialog, which) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.setTitle("Put Element Down" + emoji);
        alert.show();
    }

    private void alertPutLine(Button currentBtn) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        String firstElement = findType(vLocation.get(btnTmp.getId())[2]);
        String secondElement = findType(vLocation.get(currentBtn.getId())[2]);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.nubmer_picker, null);
        builder.setView(dialogView);
        final NumberPicker numberPicker = dialogView.findViewById(R.id.dialog_number_picker);
        int[] value = {0};
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(100);
        numberPicker.setWrapSelectorWheel(true);
        numberPicker.setOnValueChangedListener((picker, oldVal, newVal) -> value[0] = numberPicker.getValue());
        builder.setMessage("Draw A Line Between " + firstElement + " And " + secondElement + "?")
                .setCancelable(false)
                .setPositiveButton("yes", (dialog, which) -> {
                    drawEdge(value[0]);
                    selected = false;
                    unSelectButtons();
                    connected.add(new int[]{linePointsId[0], linePointsId[1], value[0]});
                }).setNegativeButton("No", (dialog, which) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.setTitle("Now I Gotta Draw A Line " + getEmoji(0x1F440) + getEmoji(0x1F3B6));
        alert.show();
    }

    private void alertRemoveBtn(int id) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Remove node" + id + " ?")
                .setCancelable(false)
                .setPositiveButton("Yes", (dialog, which) -> removeBtn(id)).
                setNegativeButton("No", (dialog, which) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.setTitle("Remove A Node " + getEmoji(0x26A0));
        alert.show();
    }

    private void alertRemoveLine(int id) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Remove the line from node" + connected.get(id)[0] + " to node" + connected.get(id)[1] + " ?")
                .setCancelable(false)
                .setPositiveButton("Yes", (dialog, which) -> removeLine(id)).
                setNegativeButton("No", (dialog, which) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.setTitle("Remove A Line " + getEmoji(0x26A0));
        alert.show();
    }


    private void alertNoPowerSource() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Place A PowerSource!")
                .setCancelable(false).
                setNegativeButton("Ok", (dialog, which) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.setTitle("No Connected PowerSource Detected!" + getEmoji(0x26A0));
        alert.show();
    }

    //=======================================================End of Alerts======//
    private void chooseOneFab(String chosen) {
        if (chosen.equals(JUNCTIONBOX)) {
            flagFabJunctionBox = true;
            flagFabPowerSource = false;
            flagFabLine = false;
            flagFabKey = false;
            flagFabRemoveBtn = false;
            fabLine.getBackground().setAlpha(255);
            fabPowerSource.getBackground().setAlpha(255);
            fabKey.getBackground().setAlpha(255);
            fabJunctionBox.getBackground().setAlpha(150);
            fabRemoveBtn.getBackground().setAlpha(255);
        }
        if (chosen.equals(KEY)) {
            flagFabJunctionBox = false;
            flagFabPowerSource = false;
            flagFabLine = false;
            flagFabKey = true;
            flagFabRemoveBtn = false;
            fabLine.getBackground().setAlpha(255);
            fabPowerSource.getBackground().setAlpha(255);
            fabKey.getBackground().setAlpha(150);
            fabJunctionBox.getBackground().setAlpha(255);
            fabRemoveBtn.getBackground().setAlpha(255);
        }
        if (chosen.equals(POWERSOURCE)) {
            flagFabJunctionBox = false;
            flagFabPowerSource = true;
            flagFabLine = false;
            flagFabKey = false;
            flagFabRemoveBtn = false;
            fabLine.getBackground().setAlpha(255);
            fabPowerSource.getBackground().setAlpha(150);
            fabKey.getBackground().setAlpha(255);
            fabJunctionBox.getBackground().setAlpha(255);
            fabRemoveBtn.getBackground().setAlpha(255);
        }

        if (chosen.equals(LINE)) {
            flagFabJunctionBox = false;
            flagFabPowerSource = false;
            flagFabLine = true;
            flagFabKey = false;
            flagFabRemoveBtn = false;
            fabLine.getBackground().setAlpha(150);
            fabPowerSource.getBackground().setAlpha(255);
            fabKey.getBackground().setAlpha(255);
            fabJunctionBox.getBackground().setAlpha(255);
            fabRemoveBtn.getBackground().setAlpha(255);
        }
        if (chosen.equals(REMOVE)) {
            flagFabJunctionBox = false;
            flagFabPowerSource = false;
            flagFabLine = false;
            flagFabKey = false;
            flagFabRemoveBtn = true;
            fabLine.getBackground().setAlpha(255);
            fabPowerSource.getBackground().setAlpha(255);
            fabKey.getBackground().setAlpha(255);
            fabJunctionBox.getBackground().setAlpha(255);
            fabRemoveBtn.getBackground().setAlpha(150);
        }
    }

    private void selectButton(Button btn) {
        selected = true;
        for (Button btns : buttons) {
            int id = btns.getId();
            if (!(id == btn.getId())) {
                float type = vLocation.get(id)[2];
                if (type == TYPE_JUNCTIONBOX) {
                    btns.setBackgroundResource(R.drawable.junction_box_selected);
                }
                if (type == TYPE_POWERSOURCE) {
                    btns.setBackgroundResource(R.drawable.power_source_selected);
                }
                if (type == TYPE_KEY) {
                    btns.setBackgroundResource(R.drawable.key_selected);
                }
            }
        }
    }

    private void unSelectButtons() {
        for (Button btns : buttons) {
            int id = btns.getId();
            float type = vLocation.get(id)[2];
            if (type == TYPE_JUNCTIONBOX) {
                btns.setBackgroundResource(R.drawable.junction_box);
            }
            if (type == TYPE_POWERSOURCE) {
                btns.setBackgroundResource(R.drawable.power_source);
            }
            if (type == TYPE_KEY) {
                btns.setBackgroundResource(R.drawable.key);
            }
        }


    }

    private String findType(float type) {

        if (type == TYPE_JUNCTIONBOX) {
            return JUNCTIONBOX;
        }
        if (type == TYPE_KEY) {
            return KEY;
        }
        if (type == TYPE_POWERSOURCE) {
            return POWERSOURCE;
        }
        return null;
    }

    private String getEmoji(int unicode) {
        return new String(Character.toChars(unicode));
    }

    private void snack(View v, String message) {
        //Snackbar.make(v, message, Snackbar.LENGTH_LONG).show();
        Snackbar snack = Snackbar.make(v, message, Snackbar.LENGTH_LONG);
        View view = snack.getView();
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) view.getLayoutParams();
        params.gravity = Gravity.TOP;
        view.setLayoutParams(params);
        snack.show();
    }

    @SuppressLint("SetTextI18n")
    private void drawEdge(int weight) {
        x1 = vLocation.get(linePointsId[0])[0];
        y1 = vLocation.get(linePointsId[0])[1];
        x2 = vLocation.get(linePointsId[1])[0];
        y2 = vLocation.get(linePointsId[1])[1];
        relativeLayout = findViewById(R.id.relative_layout);
        //imageview for edge
        ImageView iv = new ImageView(this);
        //textview for weight
        TextView tw = new TextView(this);
        int x = (int) (x2 - x1);
        int y = (int) (y2 - y1);
        double absX = Math.abs(x);
        double absY = Math.abs(y);
        int lineLength = (int) Math.sqrt(Math.pow(absX, 2) + Math.pow(absY, 2));
        // -_-
        float angle = (float) Math.toDegrees(Math.atan(absY / absX));
        RelativeLayout.LayoutParams lp_iv = new RelativeLayout.LayoutParams(lineLength, 20);
        RelativeLayout.LayoutParams lp_tw = new
                RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        iv.setX((float) (Math.min(x1, x2) - (lineLength - absX) / 2));
        iv.setY((float) (Math.min(y1, y2) + (absY / 2)));
        tw.setX((float) (Math.min(x1, x2) + (absX / 2)));
        tw.setY((float) (Math.min(y1, y2) + (absY / 2) - 100));
        iv.setLayoutParams(lp_iv);
        tw.setLayoutParams(lp_tw);
        tw.setText("" + weight);
        tw.setTextSize(20);
        if (x * y >= 0) {
            iv.setBackgroundResource(R.drawable.line);
            iv.setRotation(angle);

        } else {
            iv.setBackgroundResource(R.drawable.line);
            iv.setRotation(-1 * angle);
        }
        imageViews.add(iv);
        textViews.add(tw);
        relativeLayout.addView(iv);
        relativeLayout.addView(tw);
        iv.setOnClickListener(View -> {
            if (flagFabRemoveBtn) {
                alertRemoveLine(imageViews.indexOf(iv));
            }
        });
    }

    private GraphNodeType findGraphNodeType(int index) {
        float type = vLocation.get(index)[2];
        if (type == TYPE_JUNCTIONBOX) {
            return GraphNodeType.JUNCTION_BOX;
        }
        if (type == TYPE_KEY) {
            return GraphNodeType.SWITCH;
        }
        if (type == TYPE_POWERSOURCE) {
            return GraphNodeType.POWER_SOURCE;
        }
        return null;
    }

    private GraphNode makeGraph() {
        /*for (Button btns : buttons) {
            int id = btns.getId();
            GraphNodeType type = findGraphNodeType(id);
            String name = String.valueOf(id);
            GraphNode node = new GraphNode(name, type);
            for (int[] connection : connected) {
                if (node.getName().equals(String.valueOf(connection[0]))) {
                    GraphNode secondNode = new
                            GraphNode(String.valueOf(connection[1]),
                            findGraphNodeType(connection[1]));
                    node.addAdjacent(secondNode, connection[2]);
                }
            }
            nodes.add(node);
        }*/
        GraphNode head = null;
        for (Button btn : buttons) {
            Map<Integer, GraphNode> nodes = new HashMap<>();
            int id = btn.getId();
            GraphNodeType type = findGraphNodeType(id);
            String name = String.valueOf(id);
            GraphNode newNode = new GraphNode(name, type);
            nodes.put(id, newNode);
            if (type == GraphNodeType.POWER_SOURCE) {
                head = newNode;
            }
        }
        for (int[] connection : connected) {
            nodes.get(connection[0]).addAdjacent(nodes.get(connection[1]), connection[2]);
        }
        return head;
    }

    private int btnPowerSourceId() {
        for (Button btns : buttons) {
            int id = btns.getId();
            if (vLocation.get(id)[2] == TYPE_POWERSOURCE) {
                return id;
            }
        }
        return -1;
    }

    private GraphNode getPowerSourceNode() {
        for (GraphNode node : nodes) {
            if (node.getType() == findGraphNodeType(btnPowerSourceId())) {
                return node;
            }
        }
        return null;
    }

    @SuppressLint("ResourceType")
    private void removeBtn(int removeId) {
        // remove button
        relativeLayout.removeView(buttons.get(removeId));
        buttons.remove(removeId);
        for (int i = removeId; i < buttons.size(); i++) {
            Button btn = buttons.get(i);
            btn.setId(btn.getId() - 1);
        }
        vLocation.remove(removeId);
        verticesCount--;
        // remove and edit lines
        int node1_id = -1, node2_id = -1, w = -1;
        for (int i = 0; i < connected.size(); i++) {
            node1_id = connected.get(i)[0];
            node2_id = connected.get(i)[1];
            w = connected.get(i)[2];
            if (node1_id == removeId || node2_id == removeId) {//remove
                relativeLayout.removeView(imageViews.get(i));
                relativeLayout.removeView(textViews.get(i));
                imageViews.remove(i);
                textViews.remove(i);
                connected.remove(i);
                i--;
            } else if (node1_id > removeId || node2_id > removeId) {//edit
                if (node1_id > removeId) {
                    connected.set(i, new int[]{node1_id - 1, node2_id, w});
                    node1_id = node1_id - 1;
                }
                if (node2_id > removeId) {
                    connected.set(i, new int[]{node1_id, node2_id - 1, w});
                }
            }
        }
    }

    private void removeLine(int index) {
        relativeLayout.removeView(imageViews.get(index));
        relativeLayout.removeView(textViews.get(index));
        imageViews.remove(index);
        textViews.remove(index);
        connected.remove(index);
    }

    private boolean powerSourceAvailability() {
        for (float[] vloc : vLocation) {
            if (vloc[2] == TYPE_POWERSOURCE) {
                return true;
            }
        }
        return false;
    }


    @SuppressLint("SetTextI18n")
    private void showResult() {
        makeResultNodes();
        twTest.setText(resultNodes.get(2).getType() + "");
        setAllButtonsOnResultLayout();
    }

    private void makeResultNodes() {
        while (!allNodesCleared()) {
            List<GraphNode> temporaryResultList = new ArrayList<>(resultNodes);
            for (GraphNode node : temporaryResultList) {
                List<GraphNode> tmplist = new ArrayList<>(node.adjacentNodes());
                for (GraphNode insideNode : tmplist) {
                    if (!temporaryResultList.contains(insideNode)) {
                        resultNodes.add(insideNode);
                    }
                }
            }
        }
    }

    private boolean isNodeCleared(GraphNode node) {
        List<GraphNode> tmplist = node.adjacentNodes();
        for (GraphNode tmps : tmplist) {
            if (!resultNodes.contains(tmps)) {
                return false;
            }
        }
        return true;
    }

    private boolean allNodesCleared() {
        for (GraphNode node : resultNodes) {
            if (!isNodeCleared(node)) {
                return false;
            }
        }
        return true;
    }

    private void putButton(GraphNodeType type, float x, float y) {
        Button btn = new Button(this);
        int btnSize = 80;
        RelativeLayout.LayoutParams lp
                = new RelativeLayout.LayoutParams(btnSize, btnSize);
        btn.setLayoutParams(lp);
        btn.setX(x - btnSize / 2);
        btn.setY(y - btnSize / 2);
        if (type == GraphNodeType.JUNCTION_BOX) {
            btn.setBackgroundResource(R.drawable.junction_box);
        }
        if (type == GraphNodeType.POWER_SOURCE) {

            btn.setBackgroundResource(R.drawable.power_source);
        }
        if (type == GraphNodeType.SWITCH) {
            btn.setBackgroundResource(R.drawable.key);
        }
        relativeLayout.addView(btn);
    }

    private void setAllButtonsOnResultLayout() {
        for (GraphNode node : resultNodes) {
            int btnId = Integer.parseInt(node.getName());
            float[] arr = vLocation.get(btnId);
            float x = arr[0];
            float y = arr[1];
            GraphNodeType type = findGraphNodeType(btnId);
            putButton(type, x, y);
        }
    }

    private void makeButtonsInvisible() {
        for (Button btns : buttons) {
            btns.setVisibility(View.INVISIBLE);
        }
    }

    private void makeTextViewsInvisible() {
        for (TextView tw : textViews) {
            tw.setVisibility(View.INVISIBLE);
        }
    }

    private void makeImagieviewsInvisible() {
        for (ImageView iv : imageViews) {
            iv.setVisibility(View.INVISIBLE);
        }
    }
}
