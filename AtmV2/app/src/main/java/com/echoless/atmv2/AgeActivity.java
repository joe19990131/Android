package com.echoless.atmv2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class AgeActivity extends BaseActivity {
EditText edage;
String age;
int[] num = {18,19,20,21};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
       RecyclerView recyclerView =findViewById(R.id.ageList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(new AgeAdapter());
    }
    public void findViews(){
        edage = findViewById(R.id.ed_age);
    }



    class AgeAdapter extends RecyclerView.Adapter<AgeAdapter.AgeHolder>{
        @NonNull
        @Override
        public AgeHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
           View view = getLayoutInflater().inflate(R.layout.age_row,parent,false);
            AgeHolder AgeHolder = new AgeHolder(view);
            return new AgeHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull AgeHolder viewHolder, int i) {
            viewHolder.ageText.setText(num[i]+" ");
        }

        @Override
        public int getItemCount() {
            return num.length;
        }
        class AgeHolder extends RecyclerView.ViewHolder{
            TextView ageText;
            public AgeHolder( View itemView) {
                super(itemView);
                ageText = itemView.findViewById(R.id.age);
            }
        }
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
