package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    
    public void onClickMe(View view) {
        TextView name = findViewById(R.id.textViewName);
        TextView lastName = findViewById(R.id.textViewLastName);
        TextView email = findViewById(R.id.textViewEmail);

        EditText editName = findViewById(R.id.editTextTextPersonName);
        EditText editLastName = findViewById(R.id.editTextTextPersonLastName);
        EditText editEmail = findViewById(R.id.editTextTextEmailAddress);

        name.setText(String.format("First Name: %s", editName.getText().toString()));
        lastName.setText(String.format("Last Name: %s", editLastName.getText().toString()));
        email.setText(String.format("Email: %s", editEmail.getText().toString()));

    }
}