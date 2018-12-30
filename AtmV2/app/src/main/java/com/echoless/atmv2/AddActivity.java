package com.echoless.atmv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;

public class AddActivity extends AppCompatActivity {
    EditText cdate;
    EditText amount;
    EditText info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }
    private void findViews() {
        cdate = findViewById(R.id.ed_cdate);
        amount = findViewById(R.id.ed_amount);
        info = findViewById(R.id.ed_info);
    }
    public void add(View view) {
        findViews();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String dt = sdf.format(cdate);
    }
}
