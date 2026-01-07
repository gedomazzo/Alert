package com.example.alert;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button mes;
    AlertDialog.Builder dmes;
    Button img;
    AlertDialog.Builder dimg;
    Button war;
    AlertDialog.Builder dwar;
    Button cho;
    AlertDialog.Builder dcho;
    Button col;
    AlertDialog.Builder dcol;



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

    public void messege(View view) {
        dmes.show();
        dmes = new AlertDialog.Builder(this);
        dmes.setTitle("Messege");
        dmes.setMessage("this is a messege");
    }



}