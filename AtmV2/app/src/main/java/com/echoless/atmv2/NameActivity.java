package com.echoless.atmv2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NameActivity extends BaseActivity {
EditText edname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

    }
    public void findViews(){
        edname = findViewById(R.id.ed_name);
    }
    public void next(View view){
        findViews();
        String name = edname.getText().toString();
        if("".equals(edname.getText().toString().trim())){
            new AlertDialog.Builder(this)
                    .setTitle("Name Error")
                    .setMessage("Name couldn't be this one!!")
                    .setPositiveButton("got it", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            edname.setText("");
                        }
                    }).show();
        }else{
           user.setName(name);
            Intent age = new Intent(this,AgeActivity.class);
            startActivity(age);
        }
    }
}
