package com.echoless.atm2;

import android.content.Context;
import android.content.SharedPreferences;
import android.se.omapi.SEService;

public class User {
    public Context context;
    String name;
    int age;
    String id;
    String gender;
    SharedPreferences settings;
    boolean vaild;
    public User(Context context){
        this.context = context;
        settings = context.getSharedPreferences("atm",Context.MODE_PRIVATE);
    }
    public String getName() {
        if(name == null) {
            name = settings.getString("USERNAME", null);
        }
        return name;
    }

    public void setName(String name) {
        settings.edit().putString("USERNAME",name).apply();
        this.name = name;
    }

    public int getAge() {
       if(age == 0) {
           age = settings.getInt("USERNAGE", 0);
       }return age;
    }

    public void setAge(int age) {
        settings.edit().putInt("USERAGE",age).apply();
        this.age = age;
    }

    public String getGender() {
        if(gender == null){
            gender = settings.getString("USERGENDER",null);
        }
        return gender;
    }

    public void setGender(String gender) {
        settings.edit().putString("USERGENDER",gender).apply();
        this.gender = gender;

    }
    public String getId() {
        if(id == null){
            id = settings.getString("USERID",null);
        }
        return id;
    }

    public void setId(String id) {
        settings.edit().putString("USERID",id).apply();
        this.id = id;
    }
    public boolean isVaild(){
        vaild = getName()!=null && age != 0 && getGender() != null;
        return vaild;
    }


}
