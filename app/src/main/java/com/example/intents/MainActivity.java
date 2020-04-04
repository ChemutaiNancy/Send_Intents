package com.example.intents;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText firstInput = findViewById(R.id.etFirstInput);
        String userMessage = String.valueOf(firstInput.getText());
        intent.putExtra("firstMessage", userMessage);
        startActivity(intent);
    }
}
