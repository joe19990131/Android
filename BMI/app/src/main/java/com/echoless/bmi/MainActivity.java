package com.echoless.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.EditText;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Scanner sc1 = new Scanner(System.in);

    float weight;
    float height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void bmi(View view){
    Log.d("MainActivity","bmi");
    EditText edWeight = findViewById(R.id.ed_weight);
    EditText edHeight = findViewById(R.id.ed_height);
    String w = edWeight.getText().toString();
    String h = edHeight.getText().toString();
    float weight = Float.parseFloat(w);
    float height = Float.parseFloat(h);
    float bmi = weight/(height*height);
    Log.d("MainActivity",height+"/"+weight+"/"+bmi);

    }
}






