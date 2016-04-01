package com.example.dchen.assignment5;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    MyTextView textView1;
    MyTextView textView2;
    MyTextView textView3;
    MyTextView textView4;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        textView1 = (MyTextView) findViewById(R.id.myView001);
        textView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView1.incrementAndUpdate();
            }
        });

        textView2 = (MyTextView) findViewById(R.id.myView002);
        textView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView2.incrementAndUpdate();
            }
        });

        textView3 = (MyTextView) findViewById(R.id.myView003);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.incrementAndUpdate();
            }
        });

        textView4 = (MyTextView) findViewById(R.id.myView004);
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView4.incrementAndUpdate();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
