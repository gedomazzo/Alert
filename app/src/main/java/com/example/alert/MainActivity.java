package com.example.alert;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.util.Random;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Main activity for the Alert application, demonstrating various AlertDialogs.
 * @author        benjamin rogachevsky
 * @version       1.0
 * @since         1/7/26
 */
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


    /**
     * Binds the button views from the layout file to the class variables.
     * <p>
     *
     */
    public void merraige(){
        mes = (Button) findViewById(R.id.mess);
        img = (Button) findViewById(R.id.img);
        war = (Button) findViewById(R.id.war);
        cho = (Button) findViewById(R.id.cho);
        col = (Button) findViewById(R.id.col);
    }


    /**
     * Called when the activity is first created.
     * <p>
     *
     * @param savedInstanceState If the activity is being re-initialized after previously being shut down then this Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle).
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        merraige();
    }

    /**
     * Initialize the contents of the Activity's standard options menu.
     * <p>
     *
     * @param menu The options menu in which you place your items.
     * @return You must return true for the menu to be displayed; if you return false it will not be shown.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    /**
     * This hook is called whenever an item in your options menu is selected.
     * <p>
     *
     * @param item The menu item that was selected.
     * @return boolean Return false to allow normal menu processing to proceed, true to consume it here.
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String temp = item.getTitle().toString();
        if (temp.equals("Credints")) {
            Intent shaw = new Intent(this, MyActivityName.class);
            startActivity(shaw);
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Generates a random RGB color.
     * <p>
     *
     * @return An integer representing the random color.
     */
    public int random_color(){
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);

        return Color.rgb(r, g, b);
    }

    /**
     * Displays a simple message dialog.
     * <p>
     *
     * @param view The view that was clicked to trigger this method.
     */
    public void messege(View view) {
        dmes = new AlertDialog.Builder(this);
        dmes.setTitle("Messege");
        dmes.setMessage("this is a messege");

        dmes.show();
    }

    /**
     * Displays a message dialog with an image icon.
     * <p>
     *
     * @param view The view that was clicked to trigger this method.
     */
    public void img(View view) {
        dimg = new AlertDialog.Builder(this);
        dimg.setTitle("Image");
        dimg.setMessage("this is an image");
        dimg.setIcon(R.drawable.img);

        dimg.show();
    }

    /**
     * Displays a warning dialog with an image and an OK button.
     * <p>
     *
     * @param view The view that was clicked to trigger this method.
     */
    public void warning(View view) {
        dwar = new AlertDialog.Builder(this);
        dwar.setTitle("Warning");
        dwar.setMessage("this is a warning");
        dwar.setIcon(R.drawable.img);

        dwar.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });



        dwar.show();
    }

    /**
     * Displays a dialog with buttons to set a random background color or close the dialog.
     * <p>
     *
     * @param view The view that was clicked to trigger this method.
     */
    public void choice(View view) {
        dcho = new AlertDialog.Builder(this);
        dcho.setTitle("Choice");
        dcho.setMessage("this is a choice");
        dcho.setPositiveButton("set color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                getWindow().getDecorView().setBackgroundColor(random_color());
            }
        });

        dcho.setNegativeButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });


        dcho.show();
    }

    /**
     * Displays a dialog with buttons to set a random background color, reset it to white, or close the dialog.
     * <p>
     *
     * @param view The view that was clicked to trigger this method.
     */
    public void color(View view) {
        dcol = new AlertDialog.Builder(this);
        dcol.setTitle("Color");
        dcol.setMessage("this is a color");
        dcol.setPositiveButton("set color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                getWindow().getDecorView().setBackgroundColor(random_color());
            }
        });

        dcol.setNeutralButton("reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
            }
        });


        dcol.setNegativeButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });


        dcol.show();
    }
}
