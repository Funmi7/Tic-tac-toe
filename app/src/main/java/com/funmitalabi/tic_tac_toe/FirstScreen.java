/*
* Copyright 2018 TicTacToe Open Source Project
* Created by Funmilayo Talabi
 */

package com.funmitalabi.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


/**
 * This activity displays the easy or hard selection buttons.
 */
public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

    /**
     * This method creates an intent which goes from this activity to the MultiPlayer activity when
     *the easy button is clicked.
     */
    public void easyButtonClicked(View view) {
        Intent intentEasy = new Intent(FirstScreen.this, MultiPlayer.class);
        startActivity(intentEasy);
    }

    /**
     * This method creates an intent which goes from this activity to the HardMultiPlayer activity
     * when the easy button is clicked.
     */
    public void hardButtonClicked(View view) {
        Intent intentHard = new Intent(FirstScreen.this, HardMultiPlayer.class);
        startActivity(intentHard);
    }
}
