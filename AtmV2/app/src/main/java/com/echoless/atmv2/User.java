package com.echoless.atmv2;

import android.content.Context;
import android.content.SharedPreferences;

public class User {
    public Context context;
    String id;
   String name;
    String age;
    String gender;
    SharedPreferences settings;
    boolean vaild;

    public User(Context context) {
        this.context = context;
        settings = context.getSharedPreferences("user",Context.MODE_PRIVATE);
    }

    public String getName() {
        if(name == null){
            name = settings.getString("USERNAME",null);
        }
        return name;
    }

    public void setName(String name) {
        settings.edit().putString("USERNAME",name).apply();
        this.name = name;
    }

    public String getAge() {
        if(age == null){
            age = settings.getString("USERAGE",null);
        }
        return age;
    }

    public void setAge(String age) {
       settings.edit().putString("USERAGE",age).apply();
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
            id = settings.getString("USERID",id);
        }
        return id;
    }

    public void setId(String id) {
        settings.edit().putString("USERID",id).apply();
        this.id = id;
    }
}
