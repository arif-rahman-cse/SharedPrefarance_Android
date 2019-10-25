package com.example.sharedprefarance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button3);
        textView = findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySharedPrefarance mySharedPrefarance = MySharedPrefarance.getPrefarences(Main2Activity.this);
                textView.setText(mySharedPrefarance.getUserName()
                        +"\n"+ mySharedPrefarance.getPassword()
                        +"\n"+ mySharedPrefarance.getAge());
            }
        });
    }
}
