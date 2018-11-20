package com.echoless.atm2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpAge extends BaseActivity {
EditText edAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_age);
    }
    public void findViews(){
        edAge = findViewById(R.id.ed_age);
    }
    public void next(View view){
        findViews();
        int age = Integer.parseInt(edAge.getText().toString());
        user.setAge(age);
        Intent gender = new Intent(this,SignUpGender.class);
        startActivity(gender);
    }
}
