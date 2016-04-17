package com.example.android.syrianhaven;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    //Define views
    private Button AusButton, UsaButton, CdnButton, DeuButton, NorButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find views
        UsaButton = (Button) findViewById(R.id.Usa_button);
        AusButton = (Button) findViewById(R.id.Aus_button);
        CdnButton = (Button) findViewById(R.id.Cdn_button);
        DeuButton = (Button) findViewById(R.id.Deu_button);
        NorButton = (Button) findViewById(R.id.Nor_button);
        //Assign listener to buttons
        UsaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start next activity
                Bundle bundle = new Bundle();
                bundle.putString("Country Code", "USA");
                Intent intent = new Intent(MainActivity.this, CountryActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        AusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start next activity
                Bundle bundle = new Bundle();
                bundle.putString("Country Code", "AUS");
                Intent intent = new Intent(MainActivity.this, CountryActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        CdnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("Country Code", "CDN");
                //Start next activity
                Intent intent = new Intent(MainActivity.this, CountryActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        DeuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("Country Code", "DEU");
                //Start next activity
                Intent intent = new Intent(MainActivity.this, CountryActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        NorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("Country Code", "NOR");
                //Start next activity
                Intent intent = new Intent(MainActivity.this, CountryActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
