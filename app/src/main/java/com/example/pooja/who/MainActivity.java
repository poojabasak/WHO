package com.example.pooja.who;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   Button btn;
    EditText et;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        et = (EditText) findViewById(R.id.editText3);
         tv=(TextView)findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et.getText().toString();
                int age = Integer.parseInt(name);
                if((age >= 1) && (age < 5)) {
                    tv.setText("Go to Room no :1 ,child needs Polio drops");
                }else if((age >= 5 )&& (age < 10)) {
                    tv.setText("Go to Room no :2 ,child needs Injection");
                }else if ((age >= 10) && (age <15) ) {
                    tv.setText("Go to Room no :3 ,child needs Tablets");
                } else
                    tv.setText("Go Back Home");

            }
        });
    }}