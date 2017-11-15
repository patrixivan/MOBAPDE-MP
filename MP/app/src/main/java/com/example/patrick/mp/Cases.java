package com.example.patrick.mp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Patrick on 11/14/2017.
 */

public class Cases extends AppCompatActivity {

    Button btncseback,btnOpen;
    CaseDB caseDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cases);

        btncseback=(Button)findViewById(R.id.btncaseback);
        btnOpen=(Button)findViewById(R.id.btnopen);
        caseDB=new CaseDB(this);
        btncseback.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent bckintent=new Intent(view.getContext(),MainActivity.class);
                startActivity(bckintent);
            }
        });

        btnOpen.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Random rand=new Random();
                String rngname="";
                int rng=rand.nextInt(5);
                if(rng==0)
                    rng++;
                Cursor res=caseDB.getAllData();
                if (res != null) {
                    while(res.moveToNext()) { // if Cursor is not empty
                        int id = res.getInt(0);
                        String name = res.getString(1);
                        if(id==rng){
                            rngname=name;
                        }
                    }
                }
                else {
                    // Cursor is null
                }


                final AlertDialog.Builder builder=new AlertDialog.Builder(Cases.this);
                builder.setTitle("OPENED")
                        .setMessage("You Received "+rngname)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }//end of open button onclick
        });
    }
}
