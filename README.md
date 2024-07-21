# Number Guessing Game

This JavaFX application is designed for users to guess a randomly generated number within a specified range. The game includes features like limited attempts, time constraints, and feedback on whether the guessed number is too high or too low. It provides an engaging and interactive experience, making it an ideal project for beginners looking to enhance their JavaFX skills.

## Features

1. **Number Range**: The game allows the user to guess a number between 1 and 100 or 1 and 1000.
2. **Limited Attempts**: Players have a limited number of attempts (default is 5) to guess the correct number.
3. **Time Limit**: Players have a limited amount of time (default is 30 seconds) to guess the number.
4. **Feedback Messages**:
    - **Too High**: Indicates the guessed number is higher than the target.
    - **Too Low**: Indicates the guessed number is lower than the target.
5. **Win/Lose Alerts**:
    - **Win**: Displays an alert when the player guesses the number correctly.
    - **Lose**: Displays an alert when the player runs out of attempts or time.
6. **Automatic Reset**: The game resets after a win or loss, allowing for a new game to start.

## Project Structure

- src
  - com
    - example
      - Main.java
      - NumberGuessingGameController.java
  - resources
    - number_guessing_game.fxml

## How to Run

1. **Clone the repository**:

```bash
git clone https://github.com/Salah1098/Number-Guessing-Game.git
cd number-guessing-game
```

2. **Compile and run the application**:
    - If you are using an IDE like IntelliJ IDEA or Eclipse, open the project and run `Main.java`.
    - If you prefer to use the command line, navigate to the src directory and run:

```bash
javac com/example/Main.java
java com.example.Main
```

## Usage

1. **Start the Game**:
    - Run the application to open the game interface.
2. **Enter a Guess**:
    - Input your guess in the text field and click the "Guess" button.
3. **Receive Feedback**:
    - The game will inform you if your guess is too high or too low.
4. **Win/Lose**:
    - You win if you guess the number correctly within the limited attempts and time.
    - You lose if you run out of attempts or time.
5. **Reset**:
    - The game will automatically reset for a new round after a win or loss.

## Dependencies

This project requires JavaFX. If you are using a JDK that includes JavaFX, you should be able to run the application without any additional setup. If not, ensure that JavaFX is properly installed and configured in your development environment.

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request. We welcome all contributions, including bug fixes, feature additions, and documentation improvements.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.