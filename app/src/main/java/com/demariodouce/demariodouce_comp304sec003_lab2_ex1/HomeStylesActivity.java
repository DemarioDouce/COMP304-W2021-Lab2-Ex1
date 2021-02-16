package com.demariodouce.demariodouce_comp304sec003_lab2_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class HomeStylesActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_styles);
        //Palettes
        Spinner spinner = (Spinner) findViewById(R.id.homeTypeSnr);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.home_types_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        // Interface implementation
        spinner.setOnItemSelectedListener(this);
    }

    //Reusable intent
    public void createIntent(Class name){
        Intent intent = new Intent(this, name);
        startActivity(intent);
    }
    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {

        // An item was selected. You can retrieve the selected item using
       if (pos == 1){
createIntent(ApartmentActivity.class);
       } else if (pos == 2 ){
           createIntent(DetachedHomeActivity.class);
       } else if (pos ==3){
           createIntent(SemiDetachedHomeActivity.class);
       } else if (pos == 4){
           createIntent(CondominiumActivity.class);
       } else if (pos == 5) {
           createIntent(TownhouseActivity.class);
       } else {
           pos=0;
       }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}