package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    public static final String EXTRA_NAME = "com.example.multiscreen.extra.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void openActivity(View view){
        Toast.makeText(this, "This is a Toast", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        Name = findViewById(R.id.Name);
        String nameText = Name.getText().toString();
        intent.putExtra(EXTRA_NAME, nameText);
        startActivity(intent);
    }
}