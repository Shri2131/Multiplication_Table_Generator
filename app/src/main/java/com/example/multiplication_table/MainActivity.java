package com.example.multiplication_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private  Button submit;
    private EditText input;
    private TextView output;
    private TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit= findViewById(R.id.submit);
        input= findViewById(R.id.input);
        output= findViewById(R.id.output);
        show= findViewById(R.id.View1);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("");
                show.setText("Multiplication Table:");
                String S=input.getText().toString();
                int a=Integer.parseInt(S);
                for (int i = 1; i <= 10; i++) {
                    output.setText(output.getText()+""+a+" * "+i+" = "+(a*i)+"\n");
                }
            }
        });
    }
}