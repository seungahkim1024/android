package com.example.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        class Calc{
            int num, res;
            String op;
            public void execute(){
                switch(op){

                }
            }
            int getNum(){return num;}
            void setNum(){this.num = num;}
        }
        final EditText num = findViewById(R.id.num);
        //Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button division = findViewById(R.id.division);
        Button percent = findViewById(R.id.percent);
        Button mul = findViewById(R.id.mul);
        Button equls = findViewById(R.id.equls);
        //Log.d(tag:"입력값: ", 

        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num.getText().toString());
                //sum = int1 + int2;
            }
        });
        equls.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // result.setText("");
            }
        }));
    }
}
