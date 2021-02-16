package com.demariodouce.demariodouce_comp304sec003_lab2_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        EditText fullName = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText question1 = (EditText) findViewById(R.id.editTextTextRandomQuestion1);
        EditText question2 = (EditText) findViewById(R.id.editTextTextRandomQuestion2);
        EditText paymentMethod = (EditText) findViewById(R.id.paymentMethod);
        TextView paymentinfo = (TextView) findViewById(R.id.paymentInfo);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Boolean condition = extras.getBoolean("boolean");
if (condition == true){
    paymentMethod.setVisibility(View.INVISIBLE);
    paymentinfo.setVisibility(View.INVISIBLE);
} else {
    paymentMethod.setVisibility(View.VISIBLE);
    paymentinfo.setVisibility(View.VISIBLE);
}

        }

        Button button = (Button) findViewById(R.id.buttonFinish);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(fullName.getText().toString()) || TextUtils.isEmpty(question1.getText().toString()) ||TextUtils.isEmpty(question2.getText().toString())) {
                    Context context = getApplicationContext();
                    CharSequence text = "Please enter value.";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else {
                    openThankYouActivity();
                }

            }
        });
    }

    public void openThankYouActivity() {

        Intent intent = new Intent(this, ThankYouActivity.class);
        startActivity(intent);
    }
}