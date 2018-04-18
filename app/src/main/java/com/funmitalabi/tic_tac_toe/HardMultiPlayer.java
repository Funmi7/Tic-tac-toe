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
 * This activity displays a 5 by 5, two player Tic Tac Toe game
 */
public class HardMultiPlayer extends AppCompatActivity implements View.OnClickListener {
    private final static String TAG = HardMultiPlayer.class.getSimpleName();
    boolean currentPlayer = true;

    int playerOne = 0;
    int playerTwo = 0;

    int countTurn = 0;

    Button bOne, bTwo, bThree, bFour, bFive;
    Button bSix, bSeven, bEight, bNine, bTen;
    Button bEleven, bTwelve, bThirteen, bFourteen, bFifteen;
    Button bSixteen, bSeventeen, bEighteen, bNineteen, bTwenty;
    Button bTwentyone, bTwentytwo, bTwentythree, bTwentyfour, bTwentyfive;

    Button bReset;

    TextView scoreBoard;

    int[][] boardStatus = new int[5][5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_multi_player);
        bOne = findViewById(R.id.button_1b);
        bTwo = findViewById(R.id.button_2b);
        bThree = findViewById(R.id.button_3b);
        bFour = findViewById(R.id.button_4b);
        bFive = findViewById(R.id.button_5b);

        bSix = findViewById(R.id.button_6b);
        bSeven = findViewById(R.id.button_7b);
        bEight = findViewById(R.id.button_8b);
        bNine = findViewById(R.id.button_9b);
        bTen = findViewById(R.id.button_10b);

        bEleven = findViewById(R.id.button_11b);
        bTwelve = findViewById(R.id.button_12b);
        bThirteen = findViewById(R.id.button_13b);
        bFourteen = findViewById(R.id.button_14b);
        bFifteen = findViewById(R.id.button_15b);

        bSixteen = findViewById(R.id.button_16b);
        bSeventeen = findViewById(R.id.button_17b);
        bEighteen = findViewById(R.id.button_18b);
        bNineteen = findViewById(R.id.button_19b);
        bTwenty = findViewById(R.id.button_20b);

        bTwentyone = findViewById(R.id.button_21b);
        bTwentytwo = findViewById(R.id.button_22b);
        bTwentythree = findViewById(R.id.button_23b);
        bTwentyfour = findViewById(R.id.button_24b);
        bTwentyfive = findViewById(R.id.button_25b);

        bReset = findViewById(R.id.resetButton);
        scoreBoard = findViewById(R.id.score_board_hard_text_view);

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
        bTen.setOnClickListener(this);

        bEleven.setOnClickListener(this);
        bTwelve.setOnClickListener(this);
        bThirteen.setOnClickListener(this);
        bFourteen.setOnClickListener(this);
        bFifteen.setOnClickListener(this);

        bSixteen.setOnClickListener(this);
        bSeventeen.setOnClickListener(this);
        bEighteen.setOnClickListener(this);
        bNineteen.setOnClickListener(this);
        bTwenty.setOnClickListener(this);

        bTwentyone.setOnClickListener(this);
        bTwentytwo.setOnClickListener(this);
        bTwentythree.setOnClickListener(this);
        bTwentyfour.setOnClickListener(this);
        bTwentyfive.setOnClickListener(this);

        initializeBoardStatus();

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
            case R.id.button_1b:
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

            case R.id.button_2b:
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

            case R.id.button_3b:
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

            case R.id.button_4b:
                if (currentPlayer) {
                    bFour.setText("X");
                    bFour.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[0][3] = 1;
                } else {
                    bFour.setText("O");
                    bFour.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[0][3] = 0;
                }
                bFour.setEnabled(false);
                break;

            case R.id.button_5b:
                if (currentPlayer) {
                    bFive.setText("X");
                    bFive.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[0][4] = 1;
                } else {
                    bFive.setText("O");
                    bFive.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[0][4] = 0;
                }
                bFive.setEnabled(false);
                break;

            case R.id.button_6b:
                if (currentPlayer) {
                    bSix.setText("X");
                    bSix.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][0] = 1;
                } else {
                    bSix.setText("O");
                    bSix.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][0] = 0;
                }
                bSix.setEnabled(false);
                break;

            case R.id.button_7b:
                if (currentPlayer) {
                    bSeven.setText("X");
                    bSeven.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][1] = 1;
                } else {
                    bSeven.setText("O");
                    bSeven.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][1] = 0;
                }
                bSeven.setEnabled(false);
                break;

            case R.id.button_8b:
                if (currentPlayer) {
                    bEight.setText("X");
                    bEight.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][2] = 1;
                } else {
                    bEight.setText("O");
                    bEight.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][2] = 0;
                }
                bEight.setEnabled(false);
                break;

            case R.id.button_9b:
                if (currentPlayer) {
                    bNine.setText("X");
                    bNine.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][3] = 1;
                } else {
                    bNine.setText("O");
                    bNine.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][3] = 0;
                }
                bNine.setEnabled(false);
                break;

            case R.id.button_10b:
                if (currentPlayer) {
                    bTen.setText("X");
                    bTen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][4] = 1;
                } else {
                    bTen.setText("O");
                    bTen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[1][4] = 0;
                }
                bTen.setEnabled(false);
                break;

            case R.id.button_11b:
                if (currentPlayer) {
                    bEleven.setText("X");
                    bEleven.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][0] = 1;
                } else {
                    bEleven.setText("O");
                    bEleven.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][0] = 0;
                }
                bEleven.setEnabled(false);
                break;

            case R.id.button_12b:
                if (currentPlayer) {
                    bTwelve.setText("X");
                    bTwelve.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][1] = 1;
                } else {
                    bTwelve.setText("O");
                    bTwelve.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][1] = 0;
                }
                bTwelve.setEnabled(false);
                break;

            case R.id.button_13b:
                if (currentPlayer) {
                    bThirteen.setText("X");
                    bThirteen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][2] = 1;
                } else {
                    bThirteen.setText("O");
                    bThirteen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][2] = 0;
                }
                bThirteen.setEnabled(false);
                break;

            case R.id.button_14b:
                if (currentPlayer) {
                    bFourteen.setText("X");
                    bFourteen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][3] = 1;
                } else {
                    bFourteen.setText("O");
                    bFourteen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][3] = 0;
                }
                bFourteen.setEnabled(false);
                break;

            case R.id.button_15b:
                if (currentPlayer) {
                    bFifteen.setText("X");
                    bFifteen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][4] = 1;
                } else {
                    bFifteen.setText("O");
                    bFifteen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[2][4] = 0;
                }
                bFifteen.setEnabled(false);
                break;

            case R.id.button_16b:
                if (currentPlayer) {
                    bSixteen.setText("X");
                    bSixteen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[3][0] = 1;
                } else {
                    bSixteen.setText("O");
                    bSixteen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[3][0] = 0;
                }
                bSixteen.setEnabled(false);
                break;

            case R.id.button_17b:
                if (currentPlayer) {
                    bSeventeen.setText("X");
                    bSeventeen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[3][1] = 1;
                } else {
                    bSeventeen.setText("O");
                    bSeventeen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[3][1] = 0;
                }
                bSeventeen.setEnabled(false);
                break;

            case R.id.button_18b:
                if (currentPlayer) {
                    bEighteen.setText("X");
                    bEighteen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[3][2] = 1;
                } else {
                    bEighteen.setText("O");
                    bEighteen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[3][2] = 0;
                }
                bEighteen.setEnabled(false);
                break;

            case R.id.button_19b:
                if (currentPlayer) {
                    bNineteen.setText("X");
                    bNineteen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[3][3] = 1;
                } else {
                    bNineteen.setText("O");
                    bNineteen.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[3][3] = 0;
                }
                bNineteen.setEnabled(false);
                break;

            case R.id.button_20b:
                if (currentPlayer) {
                    bTwenty.setText("X");
                    bTwenty.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[3][4] = 1;
                } else {
                    bTwenty.setText("O");
                    bTwenty.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[3][4] = 0;
                }
                bTwenty.setEnabled(false);
                break;

            case R.id.button_21b:
                if (currentPlayer) {
                    bTwentyone.setText("X");
                    bTwentyone.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[4][0] = 1;
                } else {
                    bTwentyone.setText("O");
                    bTwentyone.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[4][0] = 0;
                }
                bTwentyone.setEnabled(false);
                break;

            case R.id.button_22b:
                if (currentPlayer) {
                    bTwentytwo.setText("X");
                    bTwentytwo.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[4][1] = 1;
                } else {
                    bTwentytwo.setText("O");
                    bTwentytwo.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[4][1] = 0;
                }
                bTwentytwo.setEnabled(false);
                break;

            case R.id.button_23b:
                if (currentPlayer) {
                    bTwentythree.setText("X");
                    bTwentythree.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[4][2] = 1;
                } else {
                    bTwentythree.setText("O");
                    bTwentythree.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[4][2] = 0;
                }
                bTwentythree.setEnabled(false);
                break;

            case R.id.button_24b:
                if (currentPlayer) {
                    bTwentyfour.setText("X");
                    bTwentyfour.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[4][3] = 1;
                } else {
                    bTwentyfour.setText("O");
                    bTwentyfour.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[4][3] = 0;
                }
                bTwentyfour.setEnabled(false);
                break;

            case R.id.button_25b:
                if (currentPlayer) {
                    bTwentyfive.setText("X");
                    bTwentyfive.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[4][4] = 1;
                } else {
                    bTwentyfive.setText("O");
                    bTwentyfive.setTextColor(Color.parseColor("#F50057"));
                    boardStatus[4][4] = 0;
                }
                bTwentyfive.setEnabled(false);
                break;

            case R.id.resetButton:
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
        for (int i = 0; i < 5; i++) {
            if (boardStatus[i][0] == boardStatus[i][1] && boardStatus[i][0] == boardStatus[i][2] &&
                    boardStatus[i][0] == boardStatus[i][3] && boardStatus[i][0] == boardStatus[i][4]) {
                if (boardStatus[i][0] == 1) {
                    result("Player X winner\n" + (i + 1) + " row");
                    playerOne++;
                    displayForPlayerOne(playerOne);
                    break;
                } else if (boardStatus[i][0] == 0) {
                    result("Player 0 winner\n" + (i + 1) + " row");
                    playerTwo++;
                    displayForPlayerTwo(playerTwo);
                    break;
                }
            }
        }

        //For the columns
        for (int i = 0; i < 5; i++) {
            if (boardStatus[0][i] == boardStatus[1][i] && boardStatus[0][i] == boardStatus[2][i] &&
                    boardStatus[0][i] == boardStatus[3][i] && boardStatus[0][i] == boardStatus[4][i]) {
                if (boardStatus[0][i] == 1) {
                    result("Player X winner\n" + (i + 1) + " column");
                    playerOne++;
                    displayForPlayerOne(playerOne);
                    break;
                } else if (boardStatus[0][i] == 0) {
                    result("Player 0 winner\n" + (i + 1) + " column");
                    playerTwo++;
                    displayForPlayerTwo(playerTwo);
                    break;
                }
            }
        }

        //For the first diagonal
        if (boardStatus[0][0] == boardStatus[1][1] && boardStatus[0][0] == boardStatus[2][2] &&
                boardStatus[0][0] == boardStatus[3][3] && boardStatus[0][0] == boardStatus[4][4]) {
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

        //For the second diagonal
        if (boardStatus[0][4] == boardStatus[1][3] && boardStatus[0][4] == boardStatus[2][2] &&
                boardStatus[0][4] == boardStatus[3][1] && boardStatus[0][4] == boardStatus[4][0]) {
            if (boardStatus[0][4] == 1) {
                result("Player X winner\nSecond Diagonal");
                playerOne++;
                displayForPlayerOne(playerOne);

            } else if (boardStatus[0][4] == 0) {
                result("Player 0 winner\nSecond Diagonal");
                playerTwo++;
                displayForPlayerTwo(playerTwo);
            }
        }

        if (countTurn == 25) {
            result("Game Draw");
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
        bTen.setEnabled(value);

        bEleven.setEnabled(value);
        bTwelve.setEnabled(value);
        bThirteen.setEnabled(value);
        bFourteen.setEnabled(value);
        bFifteen.setEnabled(value);

        bSixteen.setEnabled(value);
        bSeventeen.setEnabled(value);
        bEighteen.setEnabled(value);
        bNineteen.setEnabled(value);
        bTwenty.setEnabled(value);

        bTwentyone.setEnabled(value);
        bTwentytwo.setEnabled(value);
        bTwentythree.setEnabled(value);
        bTwentyfour.setEnabled(value);
        bTwentyfive.setEnabled(value);
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
        bTen.setText("");

        bEleven.setText("");
        bTwelve.setText("");
        bThirteen.setText("");
        bFourteen.setText("");
        bFifteen.setText("");

        bSixteen.setText("");
        bSeventeen.setText("");
        bEighteen.setText("");
        bNineteen.setText("");
        bTwenty.setText("");

        bTwentyone.setText("");
        bTwentytwo.setText("");
        bTwentythree.setText("");
        bTwentyfour.setText("");
        bTwentyfive.setText("");

        enableAllBoxes(true);

        currentPlayer = true;
        countTurn = 0;

        initializeBoardStatus();

        setInfo("Start Again!!!");

        Toast.makeText(this, "Board Reset", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method updates the string in the scoreBoard TextView
     */
    private void setInfo(String text) {
        scoreBoard.setText(text);
        scoreBoard.setTextColor(Color.parseColor("#F50057"));
    }

    /**
     * This method which set the value of integer array to -1
     * which means no one has played on the board yet.
     */
    private void initializeBoardStatus() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                boardStatus[i][j] = -1;
            }
        }
    }

    /**
     * This method updates the value of the score for player X in the scoreView TextView.
     */
    public void displayForPlayerOne(int score) {
        TextView scoreView = findViewById(R.id.player_1_score_hard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method updates the value of the score for player O in the scoreView TextView.
     */
    public void displayForPlayerTwo(int score) {
        TextView scoreView = findViewById(R.id.player_2_score_hard);
        scoreView.setText(String.valueOf(score));
    }

}