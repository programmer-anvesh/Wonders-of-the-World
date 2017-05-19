package com.example.anveshwelcome.wow;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                getSupportActionBar().setHomeButtonEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);


                a=(Button) findViewById(R.id.ancient);
                b=(Button) findViewById(R.id.modern);

             a.setOnClickListener(new View.OnClickListener(){
             @Override

                 public void onClick(View v)
             {
                 Toast.makeText(getApplicationContext(),"Ancient Wonders",Toast.LENGTH_SHORT).show();
                 Intent intent =new Intent(MainActivity.this,Ancient.class);
                 startActivity(intent);
             }

             });
                b.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v)
                    {
                        Toast.makeText(getApplicationContext(),"Modern Wonders",Toast.LENGTH_SHORT).show();
                        Intent intent =new Intent(MainActivity.this,Modern.class);
                        startActivity(intent);
                    }
                });
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
           onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder =new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Do you really want to quit?");
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                MainActivity.this.finish();

            }
        });
        builder.setPositiveButton("No", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.cancel();

            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }
}
