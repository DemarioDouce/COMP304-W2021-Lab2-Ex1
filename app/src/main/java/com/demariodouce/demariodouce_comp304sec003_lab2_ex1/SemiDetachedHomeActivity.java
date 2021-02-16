package com.demariodouce.demariodouce_comp304sec003_lab2_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class SemiDetachedHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi_detached_home);

        Button button = (Button) findViewById(R.id.button);
        CheckBox checkBox = (CheckBox) findViewById(R.id.physically);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked() == false){

                    Context context = getApplicationContext();
                    CharSequence text = "Please select an option.";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                } else {
                    openCheckoutActivity();
                }
            }
        });
    }
    public void openCheckoutActivity() {
        TextView title = (TextView) findViewById(R.id.title);
        TextView subtitle = (TextView) findViewById(R.id.subtitle);
        TextView price = (TextView) findViewById(R.id.price);
        Intent intent = new Intent(this, CheckoutActivity.class);
        intent.putExtra("icon",R.drawable.semi_detached_home1);
        intent.putExtra("title",title.getText().toString());
        intent.putExtra("subtitle",subtitle.getText().toString());
        intent.putExtra("price",price.getText().toString());
        intent.putExtra("boolean",true);
        startActivity(intent);
    }
}