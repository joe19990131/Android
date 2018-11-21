package com.echoless.atmv2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GenderActivity extends BaseActivity {
EditText edgender;
String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }
    public void findViews() {
        edgender = findViewById(R.id.ed_gender);
    }
    public void next(View view) {
        findViews();
        gender = edgender.getText().toString();
        if ("".equals(edgender.getText().toString().trim())){
            new AlertDialog.Builder(this)
                    .setTitle("Gender Error")
                    .setMessage("Please enter your gender code")
                    .setPositiveButton("got it", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            edgender.setText("");
                        }
                    }).show();
        }else {
            user.setGender(gender);
            Intent home = new Intent(this,MainActivity.class);
            home.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(home);
        }
    }
}
