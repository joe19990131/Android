package com.echoless.atmv2;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends BaseActivity {

    boolean login = false;
    public static final int RC_LOGIN = 1;
    List<String> funList = Arrays.asList("function1","function2","function3");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!login){
            Intent intent =  new Intent(this,LoginActivity.class);
            startActivityForResult(intent,RC_LOGIN);
        }
        RecyclerView recyclerView = findViewById(R.id.recyler);
    }



    class FuncAdapter extends RecyclerView.Adapter{
        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        }

        @Override
        public int getItemCount() {
            return funList.size();
        }
        class FuncHolder extends RecyclerView.ViewHolder{
            TextView funcText;
            public FuncHolder(@NonNull View itemView) {
                super(itemView);
                funcText = itemView.findViewById(R.id.func);
            }
        }
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RC_LOGIN){
            if(resultCode != RESULT_OK){
                finish();
            }else{
                Intent nickName = new Intent(this,NameActivity.class);
                if(!user.isVaild())
                {startActivity(nickName);
                }else{

                }
                login = true;

            }
        }
    }
}