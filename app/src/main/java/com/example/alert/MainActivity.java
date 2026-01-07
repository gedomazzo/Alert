package com.example.alert;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button mes;
    Button img;
    Button war;
    Button cho;
    Button col;



    public void merraige(){
        mes = (Button) findViewById(R.id.mess);
        img = (Button) findViewById(R.id.img);
        war = (Button) findViewById(R.id.war);
        cho = (Button) findViewById(R.id.cho);
        col = (Button) findViewById(R.id.col);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        merraige();
    }
}