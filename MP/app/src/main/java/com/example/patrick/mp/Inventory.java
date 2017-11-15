package com.example.patrick.mp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Patrick on 11/14/2017.
 */

public class Inventory extends AppCompatActivity{

    Button btninvback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        btninvback=(Button)findViewById(R.id.btninvback);

        btninvback.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent invbckintent= new Intent(view.getContext(),MainActivity.class);
                startActivity(invbckintent);
            }
        });
    }
}
