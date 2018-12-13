package com.fune.macato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HowToFish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_fish);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button6) {
            i = new Intent(this, PreparingToFish.class);
            startActivity(i);
        } else if (v.getId() == R.id.button7) {
            i = new Intent(this, GoingFishing.class);
            startActivity(i);
        }
    }
}
