package com.example.sharedprefarance;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPrefarance {

    private static MySharedPrefarance mySharedPrefarance;
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    private MySharedPrefarance(Context context) {
        sharedPreferences = context.getSharedPreferences(Config.SHARED_PREFARANCE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.apply();

    }

    //Creating object of private constructor for SharedPrefarance ready to data stored!
    public static MySharedPrefarance getPrefarences(Context context) {
        if (mySharedPrefarance == null) {
            mySharedPrefarance = new MySharedPrefarance(context);
        }
        return mySharedPrefarance;
    }

    /*
    -----------------------------Set value and get value form sharedPrefarance------------------------------
     */
    public void setUserName(String userName) {
        editor.putString(Config.USER_NAME, userName);
        editor.apply();
    }

    public String getUserName() {
        return sharedPreferences.getString(Config.USER_NAME, "UserName Not Found!");
    }

    public void setPassword(String password){
        editor.putString(Config.PASSWORD, password);
        editor.apply();
    }

    public String getPassword(){
        return sharedPreferences.getString(Config.PASSWORD, "password not found");
    }

    public void setIstudent(boolean istudent){
        editor.putBoolean(Config.IS_STUDENT, istudent);
        editor.apply();
    }

    public boolean getIsStudent(){
        return sharedPreferences.getBoolean(Config.IS_STUDENT, false);
    }

    public void setAge(int age){
        editor.putInt(Config.AGE, age);
        editor.apply();
    }

    public int getAge(){
        return sharedPreferences.getInt(Config.AGE, -1);
    }

}
