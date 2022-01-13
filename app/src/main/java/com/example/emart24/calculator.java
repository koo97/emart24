package com.example.emart24;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class calculator extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        final String[] country = {"-시간 선택-","0", "1", "2", "3", "4", "5" , "6" , "7" , "8" , "9" ,
                "10" , "11" , "12" , "13" , "14" , "15" , "16" , "17" , "18" , "19" , "20" , "21" , "22" ,
                "23" , "24" };

        Spinner spiner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner spiner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spiner3 = (Spinner) findViewById(R.id.spinner3);
        Spinner spiner4 = (Spinner) findViewById(R.id.spinner4);
        Spinner spiner5 = (Spinner) findViewById(R.id.spinner5);
        Spinner spiner6 = (Spinner) findViewById(R.id.spinner6);
        Spinner spiner7 = (Spinner) findViewById(R.id.spinner7);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner1.setAdapter(adapter);
        spiner2.setAdapter(adapter);
        spiner3.setAdapter(adapter);
        spiner4.setAdapter(adapter);
        spiner5.setAdapter(adapter);
        spiner6.setAdapter(adapter);
        spiner7.setAdapter(adapter);

        spiner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {



                Toast.makeText(getApplicationContext(), "Selected Country: " , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spiner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {



                Toast.makeText(getApplicationContext(), "Selected Country: " , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spiner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {



                Toast.makeText(getApplicationContext(), "Selected Country: " , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spiner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {



                Toast.makeText(getApplicationContext(), "Selected Country: " , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spiner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {



                Toast.makeText(getApplicationContext(), "Selected Country: " , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spiner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {



                Toast.makeText(getApplicationContext(), "Selected Country: " , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spiner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {



                Toast.makeText(getApplicationContext(), "Selected Country: " , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Button plusButton = (Button) findViewById(R.id.resultbutton);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text1 = (EditText) findViewById(R.id.editText1);
                 String name1 = text1.getText().toString();

                 Intent intent = new Intent(getBaseContext(),workerlist.class);
                 intent.putExtra("Name",name1);
                /*EditText text1 = (EditText) findViewById(R.id.editText1);
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
                        break; }*/
        }

        });

        Button button2 = (Button) findViewById(R.id.button2);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),workerlist.class);
                startActivity(intent);
    }


});
    }
}







