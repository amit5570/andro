package com.myapp.student.myapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button btnFrame;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFrame=(Button) findViewById(R.id.btnRel);
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button click", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void clickButton(View w){
        if (w.getId() ==R.id.btnFrame){
            Intent i=new Intent(this,RelativeActivity.class);
            startActivity(i);
        }
        else{
            Intent i=new Intent(this, LinearActivity.class);
            startActivity(i);
        }
    }
}
