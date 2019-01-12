package com.fune.macato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class preparing_to_fish_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparing_to_fish_3);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button8) {
            i = new Intent(this, preparing_to_fish_2.class);
            startActivity(i);
        } else if (v.getId() == R.id.button9) {
            i = new Intent(this, preparing_to_fish_4.class);
            startActivity(i);
        }
    }
}
