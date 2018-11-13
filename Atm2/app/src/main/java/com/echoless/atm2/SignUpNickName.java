package com.echoless.atm2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpNickName extends AppCompatActivity {
String name;
EditText ednickName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_nick_name);
    }
    public void findViews(){
    ednickName = findViewById(R.id.ed_nickname);
    }
    public void next(View view){
        findViews();
        name = ednickName.getText().toString();
        getSharedPreferences("atm",MODE_PRIVATE)
                .edit()
                .putString("USERNAME",name)
                .apply();
        Intent age = new Intent(this,SignUpAge.class);
        startActivity(age);
    }
}
