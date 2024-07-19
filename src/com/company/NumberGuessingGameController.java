package com.company;



import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class NumberGuessingGameController {

    @FXML
    private Label messageLabel;

    @FXML
    private TextField guessInput;

    @FXML
    private Label attemptsLabel;

    @FXML
    private Label timeLabel;

    private int targetNumber;
    private int attemptsLeft = 5;
    private int timeRemaining = 30;
    private Timer timer;
    private int Range=100 ;
    @FXML
    public void initialize() {
        Random rand = new Random();
        targetNumber = rand.nextInt(Range) + 1;
        startTimer();
    }

    @FXML
    private void handleGuess() {
        try {
            int guess = Integer.parseInt(guessInput.getText());
            if (guess < 1 || guess > Range) {
                showAlert("Invalid Input", "Please enter a number between 1 and 100.");
                return;
            }

            attemptsLeft--;
            attemptsLabel.setText("Attempts left: " + attemptsLeft);

            if (guess == targetNumber) {
                showAlert("Congratulations!", "You guessed the number!");
                resetGame();
            } else if (guess < targetNumber) {
                messageLabel.setText("Too Low!");
            } else {
                messageLabel.setText("Too High!");
            }

            if (attemptsLeft == 0) {
                showAlert("Game Over", "You've used all attempts! The number was " + targetNumber);
                resetGame();
            }
        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Please enter a valid number.");
        }
    }

    private void startTimer() {
        timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    timeRemaining--;
                    timeLabel.setText("Time remaining: " + timeRemaining + "s");
                    if (timeRemaining <= 0) {
                        showAlert("Time Up", "Time is up! The number was " + targetNumber);
                        resetGame();
                    }
                });
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    private void resetGame() {
        timer.cancel();
        guessInput.setDisable(true);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

