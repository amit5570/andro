package sycs38.appnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void onClick(View v){
        if (v.getId()==R.id.button1){
            Intent i=new Intent(this,Main2Activity.class);
            startActivity(i);

        }
        else if (v.getId()==R.id.button2){
            Intent i=new Intent(this,Main3Activity.class);
            startActivity(i);

        }
    }

    }

