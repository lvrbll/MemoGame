package com.example.memogame;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView tV1;
    private TextView tV2;
    private TextView tV3;
    private TextView tV4;
    private TextView tV5;
    private TextView tV6;
    private TextView tV7;
    private TextView tV8;
    private TextView tV9;
    private TextView tV10;
    private TextView tV11;
    private TextView tV12;
    private TextView tV13;
    private TextView tV14;
    private TextView tV15;
    private TextView tV16;
    private Button button;
    private Button reset;
    private boolean isGenerated = false;
    private ArrayList finalRandomList;
    private TextView activeTv;
    private HashMap<TextView, Boolean> tv;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        tV1 = findViewById(R.id.tV1);
        tV2 = findViewById(R.id.tV2);
        tV3 = findViewById(R.id.tV3);
        tV4 = findViewById(R.id.tV4);
        tV5 = findViewById(R.id.tV5);
        tV6 = findViewById(R.id.tV6);
        tV7 = findViewById(R.id.tV7);
        tV8 = findViewById(R.id.tV8);
        tV9 = findViewById(R.id.tV9);
        tV10 = findViewById(R.id.tV10);
        tV11 = findViewById(R.id.tV11);
        tV12 = findViewById(R.id.tV12);
        tV13 = findViewById(R.id.tV13);
        tV14 = findViewById(R.id.tV14);
        tV15 = findViewById(R.id.tV15);
        tV16 = findViewById(R.id.tV16);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isGenerated){
                    finalRandomList = memoElementRandom();
                    Log.d("123", String.valueOf(finalRandomList));
                    memoElementRandom();
                    tV1.setText("");
                    tV2.setText("");
                    tV3.setText("");
                    tV4.setText("");
                    tV5.setText("");
                    tV6.setText("");
                    tV7.setText("");
                    tV8.setText("");
                    tV9.setText("");
                    tV10.setText("");
                    tV11.setText("");
                    tV12.setText("");
                    tV13.setText("");
                    tV14.setText("");
                    tV15.setText("");
                    tV16.setText("");
                }else{
                    Toast.makeText(getApplicationContext(), "Liczby juz wygenerowane", Toast.LENGTH_SHORT).show();
                }
            }
        });

        reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isGenerated = false;
                activeTv = null;
                tV1.setText("?");
                tV2.setText("?");
                tV3.setText("?");
                tV4.setText("?");
                tV5.setText("?");
                tV6.setText("?");
                tV7.setText("?");
                tV8.setText("?");
                tV9.setText("?");
                tV10.setText("?");
                tV11.setText("?");
                tV12.setText("?");
                tV13.setText("?");
                tV14.setText("?");
                tV15.setText("?");
                tV16.setText("?");

                tv.put(tV1, false);
                tv.put(tV2, false);
                tv.put(tV3, false);
                tv.put(tV4, false);
                tv.put(tV5, false);
                tv.put(tV6, false);
                tv.put(tV7, false);
                tv.put(tV8, false);
                tv.put(tV9, false);
                tv.put(tV10, false);
                tv.put(tV11, false);
                tv.put(tV12, false);
                tv.put(tV13, false);
                tv.put(tV14, false);
                tv.put(tV15, false);
                tv.put(tV16, false);

                count = 0;
            }
        });



        tV1.setOnClickListener(v -> handleCardClick(tV1, 0));
        tV2.setOnClickListener(v -> handleCardClick(tV2, 1));
        tV3.setOnClickListener(v -> handleCardClick(tV3, 2));
        tV4.setOnClickListener(v -> handleCardClick(tV4, 3));
        tV5.setOnClickListener(v -> handleCardClick(tV5, 4));
        tV6.setOnClickListener(v -> handleCardClick(tV6, 5));
        tV7.setOnClickListener(v -> handleCardClick(tV7, 6));
        tV8.setOnClickListener(v -> handleCardClick(tV8, 7));
        tV9.setOnClickListener(v -> handleCardClick(tV9, 8));
        tV10.setOnClickListener(v -> handleCardClick(tV10, 9));
        tV11.setOnClickListener(v -> handleCardClick(tV11, 10));
        tV12.setOnClickListener(v -> handleCardClick(tV12, 11));
        tV13.setOnClickListener(v -> handleCardClick(tV13, 12));
        tV14.setOnClickListener(v -> handleCardClick(tV14, 13));
        tV15.setOnClickListener(v -> handleCardClick(tV15, 14));
        tV16.setOnClickListener(v -> handleCardClick(tV16, 15));

        tv= new HashMap<TextView, Boolean>();
        tv.put(tV1, false);
        tv.put(tV2, false);
        tv.put(tV3, false);
        tv.put(tV4, false);
        tv.put(tV5, false);
        tv.put(tV6, false);
        tv.put(tV7, false);
        tv.put(tV8, false);
        tv.put(tV9, false);
        tv.put(tV10, false);
        tv.put(tV11, false);
        tv.put(tV12, false);
        tv.put(tV13, false);
        tv.put(tV14, false);
        tv.put(tV15, false);
        tv.put(tV16, false);

    }

    public ArrayList<Integer> memoElementRandom(){
        Random random = new Random();
        ArrayList<Integer> valueList = new ArrayList();



        for(int i=0; i<99; i++){
            int x = random.nextInt(8) + 1;
            if(x==1){
                if(!(Collections.frequency(valueList, 1) == 2)){
                    valueList.add(x);
                }
            }
            if(x==2){
                if(!(Collections.frequency(valueList, 2) == 2)){
                    valueList.add(x);
                }
            }
            if(x==3){
                if(!(Collections.frequency(valueList, 3) == 2)){
                    valueList.add(x);
                }
            }
            if(x==4){
                if(!(Collections.frequency(valueList, 4) == 2)){
                    valueList.add(x);
                }
            }
            if(x==5){
                if(!(Collections.frequency(valueList, 5) == 2)){
                    valueList.add(x);
                }
            }
            if(x==6){
                if(!(Collections.frequency(valueList, 6) == 2)){
                    valueList.add(x);
                }
            }
            if(x==7){
                if(!(Collections.frequency(valueList, 7) == 2)){
                    valueList.add(x);
                }
            }
            if(x==8){
                if(!(Collections.frequency(valueList, 8) == 2)){
                    valueList.add(x);
                }
            }
        }

        isGenerated=true;

        return valueList;
    }

    public void handleCardClick(final TextView card, int index) {

        if (isGenerated && Boolean.FALSE.equals(tv.get(card))) {
            card.setText(String.valueOf(finalRandomList.get(index)));
            tv.put(card, true);

            if (activeTv == null) {
                activeTv = card;
            } else {
                if (!Objects.equals(activeTv.getText().toString(), card.getText().toString())) {
                    TextView previousCard = activeTv;
                    card.postDelayed(() -> {
                        card.setText("");
                        previousCard.setText("");
                        tv.put(card, false);
                        tv.put(previousCard, false);
                    }, 1000);
                }
                count++;
                activeTv = null;
            }
        }
        isEndGame();
    }

    public void isEndGame() {
        boolean gameEnded = true;
        for (Map.Entry<TextView, Boolean> entry : tv.entrySet()) {
            if (!entry.getValue()) {
                gameEnded = false;
                break;
            }
        }
        if (gameEnded) {
            Toast.makeText(getApplicationContext(), "Wygrales! Liczba ruchow: " + count, Toast.LENGTH_SHORT).show();
        }

    }
}