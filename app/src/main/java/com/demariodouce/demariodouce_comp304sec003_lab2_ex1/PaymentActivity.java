package com.demariodouce.demariodouce_comp304sec003_lab2_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        Button button = (Button) findViewById(R.id.buttonPay);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioGroup.getCheckedRadioButtonId() == -1)
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Please select an option.";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else
                {
                    openConfirmationActivity();
                }

            }
        });
    }
    public void openConfirmationActivity() {
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        if(radioButton3.isChecked()){
            Intent intent = new Intent(this, ConfirmationActivity.class);
            intent.putExtra("boolean",true);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, ConfirmationActivity.class);
            intent.putExtra("boolean",false);
            startActivity(intent);
        }

    }

}