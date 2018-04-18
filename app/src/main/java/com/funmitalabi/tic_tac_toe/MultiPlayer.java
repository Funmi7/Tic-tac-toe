/*
* Copyright 2018 TicTacToe Open Source Project
* Created by Funmilayo Talabi
 */

package com.funmitalabi.tic_tac_toe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * This activity displays a 3 by 3, two player Tic Tac Toe game
 */
public class MultiPlayer extends AppCompatActivity implements View.OnClickListener {

    private final static String TAG = MultiPlayer.class.getSimpleName();
    boolean currentPlayer = true;

    int countTurn = 0;

    int playerOne = 0;
    int playerTwo = 0;

    Button bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine;

    Button bReset;

    TextView scoreBoard;

    int[][] boardStatus = new int[3][3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_player);

        bOne = findViewById(R.id.button_one);
        bTwo = findViewById(R.id.button_two);
        bThree = findViewById(R.id.button_three);

        bFour = findViewById(R.id.button_four);
        bFive = findViewById(R.id.button_five);
        bSix = findViewById(R.id.button_six);

        bSeven = findViewById(R.id.button_seven);
        bEight = findViewById(R.id.button_eight);
        bNine = findViewById(R.id.button_nine);

        bReset = findViewById(R.id.reset_button);
        scoreBoard = findViewById(R.id.scoreBoard_text_view);

        bReset.setOnClickListener(this);

        bOne.setOnClickListener(this);
        bTwo.setOnClickListener(this);
        bThree.setOnClickListener(this);

        bFour.setOnClickListener(this);
        bFive.setOnClickListener(this);
        bSix.setOnClickListener(this);

        bSeven.setOnClickListener(this);
        bEight.setOnClickListener(this);
        bNine.setOnClickListener(this);

        initialBoardState();
    }

    /**
     * This method is called when any of the buttons are clicked.
     * This method places either X or 0 according to whose turn it is to play.
     * the boardStatus is a 2d array to know the board status
     * 1 means player X has played on the box.
     * 0 means player O has played on the box.
     */
    @Override

    public void onClick(View view) {
        Log.d(TAG, "Inside onClick");

        boolean resetButtonClicked = false;

        switch (view.getId()) {
            // 1 means player X has played
            // 0 means player 0 has played
            case R.id.button_one:
                if (currentPlayer) {
                    bOne.setText("X");
                    bOne.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[0][0] = 1;
                } else {
                    bOne.setText("O");
                    bOne.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[0][0] = 0;
                }
                bOne.setEnabled(false);
                break;

            case R.id.button_two:
                if (currentPlayer) {
                    bTwo.setText("X");
                    bTwo.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[0][1] = 1;
                } else {
                    bTwo.setText("O");
                    bTwo.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[0][1] = 0;
                }
                bTwo.setEnabled(false);
                break;


            case R.id.button_three:
                if (currentPlayer) {
                    bThree.setText("X");
                    bThree.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[0][2] = 1;
                } else {
                    bThree.setText("O");
                    bThree.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[0][2] = 0;
                }
                bThree.setEnabled(false);
                break;

            case R.id.button_four:
                if (currentPlayer) {
                    bFour.setText("X");
                    bFour.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][0] = 1;
                } else {
                    bFour.setText("O");
                    bFour.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][0] = 0;
                }
                bFour.setEnabled(false);
                break;

            case R.id.button_five:
                if (currentPlayer) {
                    bFive.setText("X");
                    bFive.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][1] = 1;
                } else {
                    bFive.setText("O");
                    bFive.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][1] = 0;
                }
                bFive.setEnabled(false);
                break;

            case R.id.button_six:
                if (currentPlayer) {
                    bSix.setText("X");
                    bSix.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][2] = 1;
                } else {
                    bSix.setText("O");
                    bSix.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][2] = 0;
                }
                bSix.setEnabled(false);
                break;

            case R.id.button_seven:
                if (currentPlayer) {
                    bSeven.setText("X");
                    bSeven.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][0] = 1;
                } else {
                    bSeven.setText("O");
                    bSeven.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][0] = 0;
                }
                bSeven.setEnabled(false);
                break;

            case R.id.button_eight:
                if (currentPlayer) {
                    bEight.setText("X");
                    bEight.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][1] = 1;
                } else {
                    bEight.setText("O");
                    bEight.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][1] = 0;
                }
                bEight.setEnabled(false);
                break;

            case R.id.button_nine:
                if (currentPlayer) {
                    bNine.setText("X");
                    bNine.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][2] = 1;
                } else {
                    bNine.setText("O");
                    bNine.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][2] = 0;
                }
                bNine.setEnabled(false);
                break;

            case R.id.reset_button:
                resetButtonClicked = true;
                break;


            default:
                break;
        }

        if (resetButtonClicked) {
            resetBoard();
        } else {
            countTurn++;
            currentPlayer = !currentPlayer;

            if (currentPlayer) {
                setInfo("Player X turn");
            } else {
                setInfo("Player 0 turn");
            }

            checkWinner();
        }
    }

    /**
     * This method is called to check the board status and identify the winner.
     * It checks for the three rows, three columns and two diagonals.
     * It updates the score for player X and player 0.
     */
    private void checkWinner() {

        Log.d(TAG, "Inside checkWinner");

        //For the rows
        for (int i = 0; i < 3; i++) {
            if (boardStatus[i][0] == boardStatus[i][1] && boardStatus[i][0] == boardStatus[i][2]) {
                if (boardStatus[i][0] == 1) {
                    result("Player X winner\n" + " row" + (i + 1));
                    playerOne++;
                    displayForPlayerOne(playerOne);
                    break;
                } else if (boardStatus[i][0] == 0) {
                    result("Player 0 winner\n" + " row" + (i + 1));
                    playerTwo++;
                    displayForPlayerTwo(playerTwo);
                    break;
                }
            }
        }

        //For the columns
        for (int i = 0; i < 3; i++) {
            if (boardStatus[0][i] == boardStatus[1][i] && boardStatus[0][i] == boardStatus[2][i]) {
                if (boardStatus[0][i] == 1) {
                    result("Player X winner\n" + " column" + (i + 1));
                    playerOne++;
                    displayForPlayerOne(playerOne);
                    break;
                } else if (boardStatus[0][i] == 0) {
                    result("Player 0 winner\n" + " column" + (i + 1));
                    playerTwo++;
                    displayForPlayerTwo(playerTwo);
                    break;
                }
            }
        }

        // For the first diagonal
        if (boardStatus[0][0] == boardStatus[1][1] && boardStatus[0][0] == boardStatus[2][2]) {
            if (boardStatus[0][0] == 1) {
                result("Player X winner\nFirst Diagonal");
                playerOne++;
                displayForPlayerOne(playerOne);
            } else if (boardStatus[0][0] == 0) {
                result("Player 0 winner\nFirst Diagonal");
                playerTwo++;
                displayForPlayerTwo(playerTwo);
            }
        }

        //For the Second diagonal
        if (boardStatus[0][2] == boardStatus[1][1] && boardStatus[0][2] == boardStatus[2][0]) {
            if (boardStatus[0][2] == 1) {
                result("Player X winner\nSecond Diagonal");
                playerOne++;
                displayForPlayerOne(playerOne);
            } else if (boardStatus[0][2] == 0) {
                result("Player 0 winner\nSecond Diagonal");
                playerTwo++;
                displayForPlayerTwo(playerTwo);
            }
        }

        if (countTurn == 9) {
            result("Game is a draw");
        }

    }

    /**
     * This method can either enable or disable all boxes
     */
    private void enableAllBoxes(boolean value) {
        Log.d(TAG, "Inside enableAllBoxes");
        bOne.setEnabled(value);
        bTwo.setEnabled(value);
        bThree.setEnabled(value);

        bFour.setEnabled(value);
        bFive.setEnabled(value);
        bSix.setEnabled(value);

        bSeven.setEnabled(value);
        bEight.setEnabled(value);
        bNine.setEnabled(value);
    }

    private void result(String winner) {
        Log.d(TAG, "Inside result");

        setInfo(winner);
        enableAllBoxes(false);
    }

    /**
     * This method is called whenever reset button is pressed and
     * resets everything to initial values of game.
     */
    private void resetBoard() {
        Log.d(TAG, "Inside resetBoard");
        bOne.setText("");
        bTwo.setText("");
        bThree.setText("");

        bFour.setText("");
        bFive.setText("");
        bSix.setText("");

        bSeven.setText("");
        bEight.setText("");
        bNine.setText("");

        enableAllBoxes(true);

        currentPlayer = true;
        countTurn = 0;

        initialBoardState();

        setInfo("Start Again!!!");

        Toast.makeText(this, "Board Reset", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method updates the string in the scoreBoard TextView
     */
    public void setInfo(String text) {
        scoreBoard.setText(text);
        scoreBoard.setTextColor(Color.parseColor("#F50057"));
    }


    /**
     * This method which set the value of integer array to -1
     * which means no one has played on the board yet.
     */
    public void initialBoardState() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardStatus[i][j] = -1;
            }
        }
    }

    /**
     * This method updates the value of the score for player X in the scoreView TextView.
     */
    public void displayForPlayerOne(int score) {
        TextView scoreView = findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method updates the value of the score for player O in the scoreView TextView.
     */
    public void displayForPlayerTwo(int score) {
        TextView scoreView = findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

}