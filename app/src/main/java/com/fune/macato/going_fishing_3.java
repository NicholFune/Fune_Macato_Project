package com.fune.macato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class going_fishing_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_going_fishing_3);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button8) {
            i = new Intent(this, going_fishing_2.class);
            startActivity(i);
        } else if (v.getId() == R.id.button9) {
            i = new Intent(this, going_fishing_4.class);
            startActivity(i);
        }
    }
}
