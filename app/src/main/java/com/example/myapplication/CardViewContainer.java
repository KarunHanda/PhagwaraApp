package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class CardViewContainer extends AppCompatActivity implements View.OnClickListener {
    FragmentTransaction ft;
    ImageView img_rent,img_milk,img_items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_container);

        // to remove action bar from top
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        // ends here

        // loading default fragment
        //ft = getFragmentTrans();
        //ft.add(R.id.frag_container,new com.example.myapplication.Rentfragment());
        //ft.commit();
        // ends here

        // initialization of image views
        img_rent=findViewById(R.id.rent);
        img_milk=findViewById(R.id.milk);
        img_items=findViewById(R.id.items);
        // ends here

        // attaching to click listener
        img_rent.setOnClickListener(this);
        img_milk.setOnClickListener(this);
        img_items.setOnClickListener(this);

        // ends here

    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.rent: ft = getFragmentTrans();
                            ft.replace(R.id.frag_container,new com.example.myapplication.Rentfragment());
                            ft.commit();
                           break;
            case R.id.milk: ft = getFragmentTrans();
                            ft.replace(R.id.frag_container,new com.example.myapplication.MilkFragment());
                            ft.commit();
                            break;
            case R.id.items:ft = getFragmentTrans();
                            ft.replace(R.id.frag_container,new com.example.myapplication.ItemsFragment());
                            ft.commit();
                            break;
        }
    }
    private FragmentTransaction  getFragmentTrans()
    {
        return getSupportFragmentManager().beginTransaction();
    }
}