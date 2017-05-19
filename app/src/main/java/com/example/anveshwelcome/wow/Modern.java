package com.example.anveshwelcome.wow;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Modern extends AppCompatActivity {
    public Button g,h,rh,l,m,s,t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modern);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        g = (Button) findViewById(R.id.chichenitza);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Modern.this, chichenitza.class);
                startActivity(a);
            }
        });
        h=(Button) findViewById(R.id.christred);
        h.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Modern.this, christred.class);
                startActivity(a);
            }
        });
        rh=(Button) findViewById(R.id.colosseum);
        rh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Modern.this, colosseum.class);
                startActivity(a);
            }
        });
        l=(Button) findViewById(R.id.greatwall);
        l.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Modern.this, greatwall.class);
                startActivity(a);
            }
        });
        m=(Button) findViewById(R.id.tajmahal);
        m.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Modern.this, tajmahal.class);
                startActivity(a);
            }
        });
        s=(Button) findViewById(R.id.machu);
        s.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Modern.this, machu.class);
                startActivity(a);
            }
        });
        t=(Button) findViewById(R.id.petra);
        t.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Modern.this, petra.class);
                startActivity(a);
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            Modern.this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

