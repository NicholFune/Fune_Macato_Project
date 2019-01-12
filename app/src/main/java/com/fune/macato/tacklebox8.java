package com.fune.macato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tacklebox8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tacklebox8);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button8) {
            i = new Intent(this, Equipment.class);
            startActivity(i);
        }
    }
}
