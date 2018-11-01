package com.echoless.bmi4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
float weight;
float height;
EditText edWeight;
EditText edheight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findViews() {
    edWeight = findViewById(R.id.ed_weight);
    edheight = findViewById(R.id.ed_height);
    }
    public void bmi(View view) {
        findViews();
    String w = edWeight.getText().toString();
    String h = edheight.getText().toString();
    weight = Float.parseFloat(w);
    height = Float.parseFloat(h);
    float bmi = weight/(height*height);
    Intent intent = new Intent(this,ResultActivity.class);
    intent.putExtra("BMI_EXTRA",bmi);
    startActivity(intent);
    }
}
