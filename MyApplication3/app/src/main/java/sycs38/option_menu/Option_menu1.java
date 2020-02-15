package sycs38.option_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Option_menu1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option1, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem mitem) {
        if (mitem.getItemId() == R.id.item1) {
            Toast.makeText(getApplicationContext(), "Item 1 Selected", Toast.LENGTH_LONG).show();
            return true;

        } else if (mitem.getItemId() == R.id.item2) {

            Toast.makeText(getApplicationContext(), "Item 2 Selected", Toast.LENGTH_LONG).show();
            return true;
        } else if (mitem.getItemId() == R.id.item3) {

            Toast.makeText(getApplicationContext(), "Item 3 Selected", Toast.LENGTH_LONG).show();
            return true;
        }
        return true;
    }

}
