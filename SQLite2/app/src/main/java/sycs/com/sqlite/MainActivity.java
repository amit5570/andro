package sycs.com.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSave;
    EditText txtName;
    EditText txtMobile;

    Button btnGD;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave=(Button)findViewById(R.id.btnSave);
        txtName=(EditText)findViewById(R.id.txtName);
        txtMobile=(EditText)findViewById(R.id.txtMobile);

        btnGD=(Button)findViewById(R.id.btnGD);
        dbHandler=new DBHandler(this);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=txtName.getText().toString();
                String mobile=txtMobile.getText().toString();
                long r=dbHandler.saveDetails(name,mobile);
                if (r==-1){
                    Toast.makeText(MainActivity.this,"Details Not Saved",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Data saves Successfully ",Toast.LENGTH_SHORT).show();

                }
            }

        });
        btnGD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){}

        });


    }
}
