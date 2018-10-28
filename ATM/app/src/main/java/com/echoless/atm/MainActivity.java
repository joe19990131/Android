package com.echoless.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
boolean logon = false;
public static final  int RC_LOGIN = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!logon){
            Intent intent = new Intent(this,LoginActivity.class);
            startActivityForResult(intent,RC_LOGIN);
        }
    }@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RC_LOGIN){
            if(resultCode == RESULT_OK){
                String uid = data.getStringExtra("LOGIN_USERID");
                String psw = data.getStringExtra("LOGIN_PASSWORD");
                Log.d("RESULT",uid + "/"+psw);
            }else{
                finish();
            }
        }
    }
}
