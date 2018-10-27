package com.echoless.bmi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    float weight;
    float height;
    private EditText edWeight;
    private EditText edHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
        Button help = findViewById(R.id.btn_help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(R.string.bmi_discription)
                        .setMessage(R.string.info)
                        .setPositiveButton(R.string.ok_click,null)
                        .show();
            }
        });
    }

    public void bmi(View view){
        //Log.d("MainActivity","bmi");
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height);
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("BMI_EXTRA",bmi);
        startActivity(intent);




        //Log.d("MainActivity",height+"/"+weight+"/"+bmi);
        //Toast.makeText(this,String.valueOf(bmi),Toast.LENGTH_LONG).show();
            new AlertDialog.Builder(this)
                    .setMessage(bmi+"")
                    .setTitle(R.string.console)
                    .setNegativeButton(R.string.clear_click, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            edHeight.setText("");
                            edWeight.setText("");
                        }
                    })
                    .setPositiveButton(R.string.ok_click,null)
                    .show();
    }


}






