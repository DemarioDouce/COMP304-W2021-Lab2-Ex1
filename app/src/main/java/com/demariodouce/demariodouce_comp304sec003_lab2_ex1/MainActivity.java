package com.demariodouce.demariodouce_comp304sec003_lab2_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Open home styles activity.*/
    public void openHomeStyles(View view) {
        Intent intent = new Intent(this, HomeStylesActivity.class);
        startActivity(intent);
    }
}