package com.example.yadla.converter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InchToCent extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inches_to_centimeter);

        final EditText editCentimeter = (EditText)findViewById(R.id.editinch);
        final EditText editInches = (EditText) findViewById(R.id.editcent);
        Button buttonConvert =(Button)findViewById(R.id.buttonConvert);


        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inches = Double.valueOf(editInches.getText().toString());
                double centimeters = inches * 2.54;
                editCentimeter.setText(String.valueOf(inches));
            }
        });
    }
}
