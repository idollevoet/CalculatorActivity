package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Toast;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickMultiply(View view){
        Log.i("INFO", "Button Pressed");
        EditText number1 = (EditText) findViewById(R.id.editTextText);
        EditText number2= (EditText) findViewById(R.id.editTextSecondNumber);

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        int result = num1 * num2;

        String resultText = String.valueOf(result);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(resultText);
    }

    public void clickSubtract(View view){
        Log.i("INFO", "Button Pressed");
        EditText number1 = (EditText) findViewById(R.id.editTextText);
        EditText number2= (EditText) findViewById(R.id.editTextSecondNumber);

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        int result = num1 - num2;

        String resultText = String.valueOf(result);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(resultText);
    }

    public void clickAddition(View view){
        Log.i("INFO", "Button Pressed");
        EditText number1 = (EditText) findViewById(R.id.editTextText);
        EditText number2= (EditText) findViewById(R.id.editTextSecondNumber);

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        int result = num1 + num2;

        String resultText = String.valueOf(result);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(resultText);
    }

    public void clickDivide(View view){
        Log.i("INFO", "Button Pressed");
        EditText number1 = (EditText) findViewById(R.id.editTextText);
        EditText number2= (EditText) findViewById(R.id.editTextSecondNumber);

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        int result = num1 / num2;

        String resultText = String.valueOf(result);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(resultText);
    }


    public void goToActivity(String s){
        Intent intent=new Intent(this, CalculatorActivity.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}