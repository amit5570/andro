package sycs38.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = (AutoCompleteTextView) findViewById(R.id.t1);
        String country_list[] = {"Andhapradesh", "Andherigali","Akola","Armanlake", "B", "Boisar", "Bandra","Borivali","Bangur nagar","Chembur"
        ,"Churchgate","Charkop","Dombivali","Dadar","Dahisar","Elphilston Road"};
        ArrayAdapter<String> ad = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, country_list);
        a1.setAdapter(ad);
        a1.setThreshold(1);
    }
}
