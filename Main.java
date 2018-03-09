package com.example.girlswhocode.csfair;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Girls Who Code on 4/18/2017.
 */



public class Main extends AppCompatActivity {
    ImageButton route;
    ImageButton info;
    ImageButton com;
    ImageButton about;
    ImageButton contact;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        addListenerOnButton();

    }
    public void addListenerOnButton() {

        route = (ImageButton) findViewById(R.id.imageButton17);
        info=(ImageButton) findViewById(R.id.imageButton15);
        com = (ImageButton) findViewById(R.id.imageButton14);
        about=(ImageButton) findViewById(R.id.imageButton12);
        contact = (ImageButton) findViewById(R.id.imageButton16);

        route.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //Intent Intentm = new Intent(getApplicationContext(), Route.class); // <----- goes to onCreate(second) activity if checked
                //startActivityForResult(Intentm, 0); //starts intent
                Intent r= new Intent(arg0.getContext(), MapsActivity.class);

                startActivity(r);

            }

        });
        info.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i= new Intent(arg0.getContext(), Info.class);

                startActivity(i);


            }

        });
        com.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent c= new Intent(arg0.getContext(), Community.class);

                startActivity(c);


            }

        });
        about.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent a= new Intent(arg0.getContext(), About.class);

                startActivity(a);

            }

        });
        contact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent c= new Intent(arg0.getContext(), Contact.class);

                startActivity(c);


            }

        });
    }

}



