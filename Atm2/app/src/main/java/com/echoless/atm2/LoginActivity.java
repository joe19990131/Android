package com.echoless.atm2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edAccount;
    EditText edPassward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void findViews() {
        edAccount = findViewById(R.id.ed_account);
        edPassward = findViewById(R.id.ed_passward);
    }
    public void login(View view) {
        findViews();
        String uid = edAccount.getText().toString();
        String psw = edPassward.getText().toString();
        if(uid.equals("joe123456") && psw.equals("12345678")) {
            Toast.makeText(this,"Login success",Toast.LENGTH_LONG)
                    .show();
            getIntent().putExtra("USERID",uid);
            getIntent().putExtra("PASSWARD",psw);
            setResult(RESULT_OK,getIntent());
            finish();
        }else if(!uid.equals("joe123456")){
            new AlertDialog.Builder(this)
                    .setTitle("Login Error")
                    .setMessage("User not found")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            edAccount.setText("");
                            edPassward.setText("");
                        }
                    })
                    .show();
        }else if(uid.equals("joe123456")&& !psw.equals("12345678")){
            new AlertDialog.Builder(this)
                    .setTitle("Login Error")
                    .setMessage("Round Passward")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            edPassward.setText("");
                        }
                    })
                    .show();
        }
    }
}
