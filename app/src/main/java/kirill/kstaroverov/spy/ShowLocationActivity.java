package kirill.kstaroverov.spy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ShowLocationActivity extends AppCompatActivity {
    final Random random = new Random();
    String location;

    ArrayList<String> locations = new ArrayList<String>(){{
        add("Школа");
        add("Вокзал");
        add("Мойка");
        add("Библиотека");
        add("Стрипклуб");
        add("Марс");
        add("Дно океана");
        add("Анус Толика");
        add("Квартира");
        add("Белый трон");
    }};

    private SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_location);
    }

    public void start(View view) {
        location = locations.get(random.nextInt(locations.size()));
        displayLocation(location);

    }

    private void displayLocation(String location){
        TextView locationTextView = (TextView) findViewById(R.id.showLocation);
        locationTextView.setText("" + location);
    }
}
