package com.example.memogame;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memoElementRandom();
            }
        });
    }

    public void memoCheck(){
        ArrayList randomList = new ArrayList();
        randomList = memoElementRandom();

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

        return valueList;
    }

}