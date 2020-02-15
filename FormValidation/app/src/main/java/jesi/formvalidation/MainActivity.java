package jesi.formvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;

    EditText txtName;
    EditText txtContact;
    EditText txtEmail;

    EditText txtPassword;
    EditText txtNoPassword;

    RadioGroup rdnGroup;
    RadioButton rdnMale,rdnFemale,rdnOthers;
    int selectedId=rdnGroup.getCheckedRadioButtonId();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);
        txtName=(EditText)findViewById(R.id.txtName);
        txtContact=(EditText)findViewById(R.id.txtContact);
        txtEmail=(EditText)findViewById(R.id.txtEmail);
        txtPassword=(EditText)findViewById(R.id.txtPassword);
        rdnGroup=(RadioGroup) findViewById(R.id.rdnGroup);
        rdnMale=(RadioButton)findViewById(R.id.rdnMale);
        rdnFemale=(RadioButton)findViewById(R.id.rdnFemale);
        rdnOthers=(RadioButton)findViewById(R.id.rdnOthers);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(txtName.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Please Enter Your Name",Toast.LENGTH_SHORT).show();
                }
                else if (txtContact.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Please Enter your Contact",Toast.LENGTH_SHORT).show();
                }
                else if (txtEmail.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Please Enter your Email",Toast.LENGTH_SHORT).show();
                }
                else if (txtPassword.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Please Enter your password",Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}
