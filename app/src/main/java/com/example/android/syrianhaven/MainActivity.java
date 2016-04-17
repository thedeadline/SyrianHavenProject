package com.example.android.syrianhaven;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String USA = "usa";
    public static final String AUS = "aus";
    public static final String DEU = "deu";
    public static final String NORW = "nor"; // NOR is a reserved Java keyword
    public static final String CDN = "cdn";
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
                Intent intent = new Intent(MainActivity.this, UsaActivity.class);

                startActivity(intent);
            }
        });
        AusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start next activity
                Bundle bundle = new Bundle();
                bundle.putString("Country Code", "AUS");
                Intent intent = new Intent(MainActivity.this, AusActivity.class);
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
                Intent intent = new Intent(MainActivity.this, AusActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
    /*
private void assignListener(Button button){
    button.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            //Start next activity
            if(button.getId() == "Cdn_button"){
            Intent intent = new Intent(MainActivity.this, AusActivity.class);
            }
            startActivity(intent);
        }
    });
}*/
}
