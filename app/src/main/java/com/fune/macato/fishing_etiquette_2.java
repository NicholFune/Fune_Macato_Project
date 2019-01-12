package com.fune.macato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fishing_etiquette_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fishing_etiquette_2);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button8) {
            i = new Intent(this, fishing_etiquette_1.class);
            startActivity(i);
        } else if (v.getId() == R.id.button9) {
            i = new Intent(this, fishing_etiquette_3.class);
            startActivity(i);
        } else if (v.getId() == R.id.button12) {
            i = new Intent(this, FishingEtiquette.class);
            startActivity(i);
        }
    }
}
