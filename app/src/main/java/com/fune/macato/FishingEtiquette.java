package com.fune.macato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FishingEtiquette extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fishing_etiquette2);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button10) {
            i = new Intent(this,  fishing_etiquette_2.class);
            startActivity(i);
        } else if (v.getId() == R.id.button11) {
            i = new Intent(this,  fishing_etiquette_3.class);
            startActivity(i);
        } else if (v.getId() == R.id.button13) {
            i = new Intent(this,  fishing_etiquette_4.class);
            startActivity(i);
        } else if (v.getId() == R.id.button14) {
            i = new Intent(this,  fishing_etiquette_5.class);
            startActivity(i);
        } else if (v.getId() == R.id.button15) {
            i = new Intent(this,  fishing_etiquette_6.class);
            startActivity(i);
        } else if (v.getId() == R.id.button16) {
            i = new Intent(this,  fishing_etiquette_1.class);
            startActivity(i);
        } else if (v.getId() == R.id.button17) {
            i = new Intent(this,  Menu.class);
            startActivity(i);
        }
    }
}
