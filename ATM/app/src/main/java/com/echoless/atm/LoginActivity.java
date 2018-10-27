package com.echoless.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText edAccound;
    private EditText edPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    private void findView(){
        edAccound = findViewById(R.id.ed_account);
        edPassword = findViewById(R.id.ed_password);
    }
    public void login(View view){
    String uid = edAccound.getText().toString();
    String psw = edPassword.getText().toString();
    if(uid.equals("joe19990131")&&psw.equals("joe12345678")){
        Toast.makeText(this,"Login finish",Toast.LENGTH_LONG).show();
    }else{
        Toast.makeText(this,"Login false",Toast.LENGTH_LONG).show();

    }
    }
    public void cancel(View view){

    }
}
