package com.example.a311layouts_interface_calculator;

import androidx.annotation.StringDef;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewInputNumbers = (TextView) findViewById(R.id.textViewInputNumbers);
        textViewInputNumbers.setText("");

        final TextView textViewButton0 = (TextView) findViewById(R.id.textViewButton0);
        textViewButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText().toString() + getString(R.string.textViewButton0));

            }
        });

                
        final TextView textViewButton1 = (TextView) findViewById(R.id.textViewButton1);
        textViewButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText().toString() + getString(R.string.textViewButton1));

            }
        });
        
        final TextView textViewButton2 = (TextView) findViewById(R.id.textViewButton2);
        textViewButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText().toString() + getString(R.string.textViewButton2));

            }
        });
        
        final TextView textViewButton3 = (TextView) findViewById(R.id.textViewButton3);
        textViewButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText().toString() + getString(R.string.textViewButton3));

            }
        });
        
        final TextView textViewButton4 = (TextView) findViewById(R.id.textViewButton4);
        textViewButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText().toString() + getString(R.string.textViewButton4));

            }
        });
        
        final TextView textViewButton5 = (TextView) findViewById(R.id.textViewButton5);
        textViewButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText().toString() + getString(R.string.textViewButton5));

            }
        });
        
        final TextView textViewButton6 = (TextView) findViewById(R.id.textViewButton6);
        textViewButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText().toString() + getString(R.string.textViewButton6));

            }
        });
        
        final TextView textViewButton7 = (TextView) findViewById(R.id.textViewButton7);
        textViewButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText().toString() + getString(R.string.textViewButton7));

            }
        });
        
        final TextView textViewButton8 = (TextView) findViewById(R.id.textViewButton8);
        textViewButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText().toString() + getString(R.string.textViewButton8));

            }
        });
        
        final TextView textViewButton9 = (TextView) findViewById(R.id.textViewButton9);
        textViewButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText().toString() + getString(R.string.textViewButton9));

            }
        });

        final TextView textViewButtonDot = (TextView) findViewById(R.id.textViewButtonDot);
        textViewButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText(textViewInputNumbers.getText().toString() + getString(R.string.textViewButtonDot));

            }
        });

        TextView textViewExample = (TextView) findViewById(R.id.textViewExample);
        textViewExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText("");

            }
        });

    }
}
