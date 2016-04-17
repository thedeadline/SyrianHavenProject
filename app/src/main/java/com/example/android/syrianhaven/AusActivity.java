package com.example.android.syrianhaven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AusActivity extends AppCompatActivity {
    Boolean saved = false;
    String star = "☆";
    String starButtonText = "Star";
    String countryCode = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aus);
        getCountryCode();
        setViews();
        updateStarDisplay(star, starButtonText);
    }
    private void getCountryCode(){
        Bundle getData = getIntent().getExtras();
        countryCode = getData.getString("Country Code");
    }
    private void setViews(){
        ImageView banner = (ImageView) findViewById(R.id.bannerView);
        TextView countryTextView = (TextView) findViewById(R.id.countryNameView);
        TextView acceptingNum = (TextView) findViewById(R.id.acceptingNumView);
        TextView resettledNum = (TextView) findViewById(R.id.resettledNumView);
        TextView aidNum = (TextView) findViewById(R.id.finAidNumView);
        try{
            switch(countryCode){
                case "USA":
                    banner.setImageResource(R.drawable.usa_banner);
                    countryTextView.setText(R.string.usa_country_name);
                    acceptingNum.setText(R.string.usa_accepting_num);
                    resettledNum.setText(R.string.usa_resettled_num);
                    aidNum.setText(R.string.usa_aid_num);
                    break;
                case "AUS":
                    banner.setImageResource(R.drawable.aus_banner);
                    countryTextView.setText(R.string.aus_country_name);
                    acceptingNum.setText(R.string.aus_accepting_num);
                    resettledNum.setText(R.string.aus_resettled_num);
                    aidNum.setText(R.string.aus_aid_num);
                    break;
                case "CDN":
                    banner.setImageResource(R.drawable.cdn_banner);
                    countryTextView.setText(R.string.cdn_country_name);
                    acceptingNum.setText(R.string.cdn_accepting_num);
                    resettledNum.setText(R.string.cdn_resettled_num);
                    aidNum.setText(R.string.cdn_aid_num);
                    break;
                case "DEU":
                    banner.setImageResource(R.drawable.deu_banner);
                    countryTextView.setText(R.string.deu_country_name);
                    acceptingNum.setText(R.string.deu_accepting_num);
                    resettledNum.setText(R.string.deu_resettled_num);
                    aidNum.setText(R.string.deu_aid_num);
                    break;
                case "NOR":
                    banner.setImageResource(R.drawable.nor_banner);
                    countryTextView.setText(R.string.nor_country_name);
                    acceptingNum.setText(R.string.nor_accepting_num);
                    resettledNum.setText(R.string.nor_resettled_num);
                    aidNum.setText(R.string.nor_aid_num);
                    break;
            }
        }
        catch(NullPointerException e){
            System.out.print("Null Pointer Exception Caught: ");
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.print("Exception Caught: ");
            System.out.println(e.getMessage());
        }
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
