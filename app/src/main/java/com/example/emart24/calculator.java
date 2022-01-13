package com.example.emart24;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class calculator extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        Button plusButton = (Button) findViewById(R.id.resultbutton);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text1 = (EditText) findViewById(R.id.editText1);
                EditText text2 = (EditText) findViewById(R.id.editText2);
                TextView resultText = (TextView) findViewById(R.id.textView);

                int input1 = Integer.parseInt(text1.getText().toString());
                int input2 = Integer.parseInt(text2.getText().toString());
                int result;
                switch (view.getId()) {
                    case R.id.resultbutton:
                        if (input1==5) {
                            result = input1 + input2;
                            resultText.setText("" + result);
                            break;
                        }
                        else result = input1 * input2;
                        resultText.setText("" + result);
                        break;
            }
        }

        });
    }
}








