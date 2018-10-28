package com.echoless.atm;

import android.app.AlertDialog;
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
        findView();
    String uid = edAccound.getText().toString();
    String psw = edPassword.getText().toString();
    if(uid.equals("joe19990131")&&psw.equals("joe12345678")){
        Toast.makeText(this,"Login finish",Toast.LENGTH_LONG)
                .show();
                getIntent().putExtra("LOGIN_USERID",uid);
                getIntent().putExtra("LOGIN_PASSWORD",psw);
                setResult(RESULT_OK,getIntent());
        finish();
    }else{
        new AlertDialog.Builder(this)
                .setTitle("ATM")
                .setMessage("Login false")
                .setPositiveButton("OK",null)
                .show();
    }
    }
    public void cancel(View view){

    }
}
