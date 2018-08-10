package kirill.kstaroverov.spy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        Intent intent = new Intent(this, ShowLocationActivity.class);
        startActivity(intent);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.numberOfPlayers);
        quantityTextView.setText("" + number);
    }

    public void increment(View view){
        quantity++;
        display(quantity);
    }
    public void decrement(View view){
        quantity--;
        display(quantity);
    }



}
