package com.sycs38.form;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;

    EditText txtName;
    EditText txtContact;
    EditText txtEmail;
    EditText txtHeight;
    EditText txtPassword;
    EditText txtNoPassword;

    RadioGroup rdnGroup;
    RadioButton rdnMale,rdnFemale,rdnOthers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       btnSubmit=(Button)findViewById(R.id.btnSubmit);
        txtName=(EditText)findViewById(R.id.txtName);
        txtContact=()

    }
}
