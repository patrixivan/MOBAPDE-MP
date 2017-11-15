package com.example.patrick.mp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnplay,btninv,btncase;
    CaseDB caseDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caseDB=new CaseDB(this);
        btnplay= (Button)findViewById(R.id.btnplay);
        btninv=(Button)findViewById(R.id.btninv);
        btncase=(Button)findViewById(R.id.btncase);

        btnplay.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent plyintent= new Intent(view.getContext(),Lobby.class);
                startActivity(plyintent);
            }
        });

        btninv.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent invintent=new Intent(view.getContext(),Inventory.class);
                startActivity(invintent);
            }
        });

        btncase.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent cseintent=new Intent(view.getContext(),Cases.class);
                startActivity(cseintent);
            }
        });

    }
}
