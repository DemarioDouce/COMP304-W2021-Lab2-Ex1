package com.demariodouce.demariodouce_comp304sec003_lab2_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int icon = extras.getInt("icon");
            String title = extras.getString("title");
            String subtitle = extras.getString("subtitle");
            String price = extras.getString("price");
            boolean radioBoolean = extras.getBoolean("boolean");
            ImageView imageView = (ImageView) findViewById(R.id.icon);
            imageView.setImageResource(icon);
            TextView titleTextView = (TextView) findViewById(R.id.title);
            titleTextView.setText(title);
            TextView subtitleTextView = (TextView) findViewById(R.id.subtitle);
            subtitleTextView.setText(subtitle);
            TextView priceTextView = (TextView) findViewById(R.id.price);
            priceTextView.setText(price);
            RadioButton radioButton = (RadioButton) findViewById(R.id.radioBtn);
            radioButton.setChecked(radioBoolean);
        }
    }
}