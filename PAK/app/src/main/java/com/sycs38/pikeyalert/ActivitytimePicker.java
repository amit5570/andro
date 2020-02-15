package com.sycs38.pikeyalert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class ActivitytimePicker extends AppCompatActivity {
    Button btnSubmit;
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytime_picker);

        btnSubmit=(Button)findViewById(R.id.btnSubmit);
        timePicker=(TimePicker)findViewById(R.id.timePicker);
        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String time=timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute()+"";
                final AlertDialog alertDialog=new AlertDialog.Builder(ActivitytimePicker.this).create();
                alertDialog.setMessage("Time:"+time);
                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE,"OK",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog,int which){
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });
    }
}
