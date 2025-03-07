package com.example.javacalculator;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
Integer userInput1;
Integer userInput2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText firstNumber = findViewById(R.id.firstNumber);
        EditText secondNumber = findViewById(R.id.secondNumber);
        Button plusButton = findViewById(R.id.plusButton);
        Button minusButton = findViewById(R.id.minusButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divideButton = findViewById(R.id.divideButton);
        TextView textView = findViewById(R.id.textView);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);






            return insets;




        });
        plusButton.setOnClickListener (new View.OnClickListener(){
            public void onClick (View v) {
                try {
                    Integer userInput1 = Integer.parseInt(firstNumber.getText().toString());
                    Integer userInput2 = Integer.parseInt(secondNumber.getText().toString());
                } catch (Exception e) {
                    textView.setText("Invalid Numbers");
                }
                Integer result = userInput1 + userInput2;
                textView.setText("Result of Calculation: " + result);
            }
        });

        minusButton.setOnClickListener (new View.OnClickListener(){
            public void onClick (View v) {

                try {
                    userInput1 = Integer.parseInt(firstNumber.getText().toString());
                    userInput2 = Integer.parseInt(secondNumber.getText().toString());
                } catch (Exception e) {
                    textView.setText("Invalid Numbers");
                }
                Integer result = userInput1 - userInput2;
                textView.setText("Result of Calculation: " + result);
            }
        });

        multiplyButton.setOnClickListener (new View.OnClickListener(){
            public void onClick (View v) {
                try {
                    userInput1 = Integer.parseInt(firstNumber.getText().toString());
                    userInput2 = Integer.parseInt(secondNumber.getText().toString());
                } catch (Exception e) {
                    textView.setText("Invalid Numbers");
                }
                Integer result = userInput1 * userInput2;
                textView.setText("Result of Calculation: " + result);
            }
        });

        divideButton.setOnClickListener (new View.OnClickListener(){
            public void onClick (View v) {

                try {
                    userInput1 = Integer.parseInt(firstNumber.getText().toString());
                    userInput2 = Integer.parseInt(secondNumber.getText().toString());
                } catch (Exception e) {
                    textView.setText("Invalid Numbers");
                }
                Float result = (float)userInput1 / userInput2;
                textView.setText("Result of Calculation: " + result);
            }
        });


    }

}