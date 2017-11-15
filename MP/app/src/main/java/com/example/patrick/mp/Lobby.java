package com.example.patrick.mp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Patrick on 11/14/2017.
 */

public class Lobby extends AppCompatActivity {

    Button btncancel,btnfound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

        btncancel=(Button)findViewById(R.id.btncancel);
        btnfound=(Button)findViewById(R.id.btnfound);
        btncancel.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent cnlintent= new Intent(view.getContext(),MainActivity.class);
                startActivity(cnlintent);
            }
        });

        btnfound.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent fndintent=new Intent(view.getContext(),Play.class);
                startActivity(fndintent);
            }
        });
    }
}
