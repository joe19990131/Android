package com.echoless.atm2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpGender extends AppCompatActivity {
EditText edGender;
String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_gender);
    }
    public void findViews(){
        edGender = findViewById(R.id.ed_gender);
    }
    public void next(View view){
        findViews();
        gender = edGender.getText().toString();
        getSharedPreferences("atm",MODE_PRIVATE)
                .edit()
                .putString("USERGENDER",gender)
                .apply();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
