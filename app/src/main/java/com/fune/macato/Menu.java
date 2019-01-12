package com.fune.macato;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button) {
            i = new Intent(this, HowToFish.class);
            startActivity(i);
        } else if (v.getId() == R.id.button3) {
            i = new Intent(this, Equipment.class);
            startActivity(i);
        } else if (v.getId() == R.id.button2) {
            i = new Intent(this, FishingEtiquette.class);
            startActivity(i);
        } else if (v.getId() == R.id.button5) {
            i = new Intent(this, AboutUs.class);
            startActivity(i);
        }
    }
}
