package com.echoless.bmi2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
float weight;
float height;
EditText edWeight;
EditText edHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findView() {
    edWeight = findViewById(R.id.ed_weight);
    edHeight = findViewById(R.id.ed_height);
    }
    public void bmi(View view){
    String w = edWeight.getText().toString();
    String h = edHeight.getText().toString();
    weight = Float.parseFloat(w);
    height = Float.parseFloat(h);
    float bmi = weight/((height/100)*(height/100));
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("bmi_EXTRA",bmi);
        startActivity(intent);
    }
}
