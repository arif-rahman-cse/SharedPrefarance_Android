package com.example.sharedprefarance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText username, password, age;
    private Button save, go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.editText);
        password = findViewById(R.id.editText2);
        age = findViewById(R.id.editText3);

        save = findViewById(R.id.button);
        go = findViewById(R.id.button2);

        save.setOnClickListener(this);
        go.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button: {
                String name = username.getText().toString();
                String pass = password.getText().toString();
                String mAge = age.getText().toString();

                //Set vale in SharedPrefarance
                MySharedPrefarance mySharedPrefarance = MySharedPrefarance.getPrefarences(MainActivity.this);
                mySharedPrefarance.setUserName(name);
                mySharedPrefarance.setPassword(pass);
                mySharedPrefarance.setAge(Integer.parseInt(mAge));
                Toast.makeText(MainActivity.this, "Value set", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button2: {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                break;
            }

            default: {
                break;
            }
        }

    }
}
