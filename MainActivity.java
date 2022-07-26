package com.jah.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText et_Number1, ed_Number2;
    private Button buttonSum;
    private TextView Results, mydate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Number1 = findViewById(R.id.et_Number1);
        ed_Number2 = findViewById(R.id.ed_Number2);

        Results = findViewById(R.id.tv_Results);
        mydate = findViewById(R.id.tv_date);
        Calendar cal = Calendar.getInstance();
        mydate.setText(cal.getTime().toString());

        buttonSum = findViewById(R.id.buttonSum);
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
                String num1 = et_Number1.getText().toString();
                String num2 = ed_Number2.getText().toString();
                if(num1.equals("") || num2.equals("")){
                    Toast.makeText(MainActivity.this, "Number can't be empty!", Toast.LENGTH_SHORT).show();
                }else{
                    int result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    String r = String.valueOf(result);
                    Results.setText(r);
                }

            }
        });
    }
}
