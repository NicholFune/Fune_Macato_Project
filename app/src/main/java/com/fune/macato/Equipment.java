package com.fune.macato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Equipment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment2);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button9) {
            i = new Intent(this,  Menu.class);
            startActivity(i);
        } else if (v.getId() == R.id.textView1) {
            i = new Intent(this,  tacklebox1.class);
            startActivity(i);
        } else if (v.getId() == R.id.textView2) {
            i = new Intent(this,  tacklebox2.class);
            startActivity(i);
        } else if (v.getId() == R.id.textView3) {
            i = new Intent(this,  tacklebox3.class);
            startActivity(i);
        } else if (v.getId() == R.id.textView4) {
            i = new Intent(this,  tacklebox4.class);
            startActivity(i);
        } else if (v.getId() == R.id.textView5) {
            i = new Intent(this,  tacklebox5.class);
            startActivity(i);
        } else if (v.getId() == R.id.textView6) {
            i = new Intent(this,  tacklebox6.class);
            startActivity(i);
        } else if (v.getId() == R.id.textView7) {
            i = new Intent(this,  tacklebox7.class);
            startActivity(i);
        } else if (v.getId() == R.id.textView8) {
            i = new Intent(this,  tacklebox10.class);
            startActivity(i);
        } else if (v.getId() == R.id.textView9) {
            i = new Intent(this,  tacklebox9.class);
            startActivity(i);
        } else if (v.getId() == R.id.textView10) {
            i = new Intent(this,  tacklebox8.class);
            startActivity(i);
        }
    }
}
