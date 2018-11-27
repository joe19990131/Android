package com.echoless.atmv2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {
    EditText edAccount;
    EditText edPassward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      findViews();
       edAccount.setText(user.getId());
    }
    public void findViews(){
        edAccount = findViewById(R.id.ed_account);
         edPassward = findViewById(R.id.ed_passward);
    }
    public void login(View view){
        findViews();
        String uid = edAccount.getText().toString();
        String psw = edPassward.getText().toString();
        if(uid.equals("joe1999")&& psw.equals("123456")){
            Toast.makeText(this,"Login success",Toast.LENGTH_LONG).show();
            setResult(RESULT_OK);
            getSharedPreferences("user",MODE_PRIVATE)
                    .edit()
                    .putString("USERID",uid)
                    .apply();
            finish();
        }else{
            new AlertDialog.Builder(this)
                    .setTitle("Login Error")
                    .setMessage("Wrong account or passward")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            edPassward.setText("");
                        }
                    }).show();
        }
    }

    public void cancel(View view) {
        finish();
    }
}
