package com.example.android.syrianhaven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UsaActivity extends AppCompatActivity {

    Boolean saved = false;
    String star = "☆";
    String starButtonText = "Star";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa);
        updateStarDisplay(star, starButtonText);
    }

    /**
     * This method toggles the variables for the button text (between 'star' and 'unstar') and star alt
     * character (located on the top right) between a filled and hollow star. It then calls
     * the method updateStar to update the display.
     */
    public void toggleStar(View view) {
        if (saved) {
            saved = false;
            star = "☆";
            starButtonText = "Star";
            updateStarDisplay(star, starButtonText);
        }
        else{
            saved = true;
            star = "★";
            starButtonText = "Unstar";
            updateStarDisplay(star, starButtonText);
        }
    }
    public void updateStarDisplay(String textViewText, String buttonText){
        TextView starTextView = (TextView) findViewById(R.id.starTextView);
        TextView starButton = (TextView) findViewById(R.id.starButton);
        starTextView.setText(textViewText);
        starButton.setText(buttonText);
    }

}
