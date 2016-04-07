package com.example.toshiba.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.setFinishOnTouchOutside(false); //quand on touche la premiere activité il va pas fermer la deuxieme activité

    }

    public void fermer(View v)
    {
        finish();
    }
}
