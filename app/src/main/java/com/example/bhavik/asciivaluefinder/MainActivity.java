package com.example.bhavik.asciivaluefinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
EditText input;
TextView converted;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
;

        input = (EditText) findViewById(R.id.inputchar);
        converted = (TextView) findViewById(R.id.ans);

    }

    public void get(View v){
        char s = input.getText().charAt(0);
    String g = String.valueOf((int)s);
    converted.setText(g);
    }
    public void clear(View v){
        input.setText(null);
        converted.setText(null);
    }
    public void exit(View v){
        finish();
    }

}
