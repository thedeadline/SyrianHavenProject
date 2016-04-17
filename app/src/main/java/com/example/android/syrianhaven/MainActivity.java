package com.example.android.syrianhaven;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //Define views
    private Button AusButton;
    private Button UsaButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find views
        AusButton = (Button) findViewById(R.id.Aus_button);
        UsaButton = (Button) findViewById(R.id.Usa_button);

        //Assign a listener to button
        AusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start next activity
                Intent intent = new Intent(MainActivity.this, AusActivity.class);
                startActivity(intent);

            }
        });
        UsaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start next activity
                Intent intent = new Intent(MainActivity.this, UsaActivity.class);
                startActivity(intent);

            }
        });

    }
}
