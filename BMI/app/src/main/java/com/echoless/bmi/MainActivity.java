package com.echoless.bmi;

import android.content.DialogInterface;
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
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);

    }
    public void bmi(View view){
        //Log.d("MainActivity","bmi");
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height);
        //Log.d("MainActivity",height+"/"+weight+"/"+bmi);
        //Toast.makeText(this,String.valueOf(bmi),Toast.LENGTH_LONG).show();
            new AlertDialog.Builder(this)
                    .setMessage(bmi+"")
                    .setTitle("console")
                    .setNegativeButton("CLEAR", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            edHeight.setText("");
                            edWeight.setText("");
                        }
                    })
                    .setPositiveButton("OK",null)
                    .show();
    }


}






