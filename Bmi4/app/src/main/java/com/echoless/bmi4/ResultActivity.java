package com.echoless.bmi4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        float bmi = intent.getFloatExtra("BMI_EXTRA",0);
        TextView ans = findViewById(R.id.result);
        ans.setText("Your BMI is  "+bmi);
    }
}
