package com.sycs38.pikeyalert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class Main3Activity extends AppCompatActivity {
    DatePicker dtPicker;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnSubmit=(Button)findViewById(R.id.btnSubmit);
        dtPicker=(DatePicker)findViewById(R.id.dtPicker);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                String date=dtPicker.getDayOfMonth()+"-"+(dtPicker.getMonth()+1)+"-"+dtPicker.getYear();

                final AlertDialog alertDialog=new AlertDialog.Builder(Main3Activity.this).create();
                alertDialog.setMessage("Date:"+date);
                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }

        });

    }
}
