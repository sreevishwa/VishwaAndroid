package com.example.yadla.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editCentimeter = (EditText) findViewById(R.id.editinch);
        final EditText editInches = (EditText) findViewById(R.id.editcent);
        Button buttonConvert = (Button) findViewById(R.id.buttonConvert);


        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double centimeters = Double.valueOf(editCentimeter.getText().toString());
                double inches = centimeters * 0.393700787;
                editInches.setText(String.valueOf(inches));
            }
        });
        final Button buttoninch = (Button) findViewById(R.id.buttoninch);
        buttoninch.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        buttonclicked(v);
                    }
                });
    }


    public void buttonclicked(){

    }
}