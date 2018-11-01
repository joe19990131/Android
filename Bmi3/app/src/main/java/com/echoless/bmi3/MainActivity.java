package com.echoless.bmi3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText edWeight;
EditText edHeight;
float weight;
float height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findView() {
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);

    }
    public void bmi3(View view) {
        findView();
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
        weight = Float.parseFloat(w);
        height = Float.parseFloat(h);
        float bmi = weight/(height*height);
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("BMI_EXTRA",bmi);
        startActivity(intent);
    }
}
