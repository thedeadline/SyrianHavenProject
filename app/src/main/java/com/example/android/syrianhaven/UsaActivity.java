package com.example.android.syrianhaven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UsaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa);
        calculateHearts(5);
    }

    /**
     * This method calculates how many hearts to show according to how friendly the countries are
     * out of 5. The friendlier they are, the more hearts there are.
     */
    private void calculateHearts(int friendlylevel) {
        if (friendlylevel == 5) {
            displayHearts("♥");
        }
    }
    public void displayHearts(String message){
        TextView priceTextView = (TextView) findViewById(R.id.friendlinessNumView);
        priceTextView.setText(message);
    }
}
