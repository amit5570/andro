package sycs38.option_menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v) {
        if (v.getId() == R.id.btnoptme1) {
            Intent i = new Intent(this, Option_menu1.class);
            startActivity(i);
        } else {
            if (v.getId() == R.id.btnoptme2) {
                Intent i = new Intent(this, Option_menu2.class);
                startActivity(i);
            }

        }
    }
}
