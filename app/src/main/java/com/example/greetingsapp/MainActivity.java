package com.example.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button myBtn;
    TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText= findViewById(R.id.editTextTextPersonName);
        myBtn= findViewById(R.id.button);
        title= findViewById(R.id.textView);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input= editText.getText().toString();

                Toast.makeText(MainActivity.this,
                        "Welcome "+input+" to our App",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}