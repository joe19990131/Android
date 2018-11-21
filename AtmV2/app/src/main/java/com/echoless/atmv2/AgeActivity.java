package com.echoless.atmv2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends BaseActivity {
EditText edage;
String age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
    }
    public void findViews(){
        edage = findViewById(R.id.ed_age);
    }
    public void next(View view){
        findViews();
        age = edage.getText().toString();
        if("".equals(edage.getText().toString().trim())){
            new AlertDialog.Builder(this)
                    .setTitle("Age Error")
                    .setMessage("Please enter your age")
                    .setPositiveButton("got it", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            edage.setText("");
                        }
                    }).show();
        }else{
            user.setAge(age);
            Intent gender = new Intent(this,GenderActivity.class);
            startActivity(gender);
        }
    }
}
