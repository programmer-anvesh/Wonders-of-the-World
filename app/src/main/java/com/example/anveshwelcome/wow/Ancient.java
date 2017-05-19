package com.example.anveshwelcome.wow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Ancient extends AppCompatActivity {
public Button g,h,rh,l,m,s,t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ancient);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        g = (Button) findViewById(R.id.giza);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v) {
                Intent a = new Intent(Ancient.this, giza.class);
                startActivity(a);
            }
            });
        h=(Button) findViewById(R.id.hanging);
        h.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Ancient.this, hanging.class);
                startActivity(a);
            }
        });
        rh=(Button) findViewById(R.id.rhodes);
        rh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Ancient.this, rhodes.class);
                startActivity(a);
            }
        });
        l=(Button) findViewById(R.id.lighthouse);
        l.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Ancient.this, lighthouse.class);
                startActivity(a);
            }
        });
        m=(Button) findViewById(R.id.mausoleum);
        m.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Ancient.this, mausoleum.class);
                startActivity(a);
            }
        });
        s=(Button) findViewById(R.id.zeus);
        s.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Ancient.this, zeus.class);
                startActivity(a);
            }
        });
        t=(Button) findViewById(R.id.artemis);
        t.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Ancient.this, artemis.class);
                startActivity(a);
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Ancient.this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

