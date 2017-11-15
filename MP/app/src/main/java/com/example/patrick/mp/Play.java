package com.example.patrick.mp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Patrick on 11/14/2017.
 */

public class Play extends AppCompatActivity {

    Button btnend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        btnend=(Button)findViewById(R.id.btnend);

        btnend.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent endintent= new Intent(view.getContext(),MainActivity.class);
                startActivity(endintent);
            }
        });
    }
}
