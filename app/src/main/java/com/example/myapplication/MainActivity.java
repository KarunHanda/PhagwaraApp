package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    CardView milk,rent,items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // to remove action bar from top
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        // ends here

        // initialize classes

        milk=findViewById(R.id.milk);
        rent =findViewById(R.id.rent);
        items=findViewById(R.id.items);

        // end here

        // attaching to listeners
        milk.setOnClickListener(this);
        rent.setOnClickListener(this);
        items.setOnClickListener(this);
        // ends here




    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.milk:
            case R.id.rent:
            case R.id.items:
                            callIntentForActivity();
                            break;
        }

    }
    private void callIntentForActivity()
    {
        Intent cardItem = new Intent(this, CardViewContainer.class);
        startActivity(cardItem);
    }
}