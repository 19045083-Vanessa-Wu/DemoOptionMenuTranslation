package sg.edu.rp.c346.id19045083.demooptionmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;
    TextView tvTranslatedText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2 = findViewById(R.id.textViewTranslatedText2);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        // inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        // handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvTranslatedText.setText("Hello");
            tvTranslatedText2.setText("Bye");
        } else if (id == R.id.italianSelection) {
            tvTranslatedText.setText("Ciao");
            tvTranslatedText2.setText("Addio");
        } else {
            tvTranslatedText.setText("Error translation");
            tvTranslatedText2.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }
}