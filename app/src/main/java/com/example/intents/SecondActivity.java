package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle firstData = getIntent().getExtras();

        if (firstData == null){
            return;
        }
        String firstMessage = firstData.getString("userMessage");
        TextView secondText = findViewById(R.id.textview_second);
        secondText.setText(firstMessage);
    }

    public void onClickTwo(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}
