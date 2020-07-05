package com.example.docapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText entertext;
    private TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendmessage();
    }

    public void sendmessage(){

        entertext = (EditText) findViewById(R.id.entertext);
        button = (Button) findViewById(R.id.button);
        display = (TextView) findViewById(R.id.display);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view)
            {
                String value1 = entertext.getText().toString();
                display.setText(value1);


            }

        });




    }


}