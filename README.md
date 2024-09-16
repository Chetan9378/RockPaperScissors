Rock Paper Scissors Game in Java
Description
This is a simple command-line-based Rock Paper Scissors game implemented in Java. The player competes against the computer by choosing between Rock (R), Paper (P), and Scissors (S). The computer randomly selects its move, and the winner is decided based on standard game rules.

The game keeps running in a loop, allowing the player to play multiple rounds, and it ends when the player chooses to stop.

Game Rules
Rock (R) beats Scissors (S)
Scissors (S) beats Paper (P)
Paper (P) beats Rock (R)
If both the player and the computer choose the same move, the round is a tie.
How to Play
Clone or download the project to your local machine.
Compile and run the RockPaperScissors class.
The program will prompt you to enter your move:
Enter R for Rock
Enter P for Paper
Enter S for Scissors
The computer will randomly choose its move.
The result will be displayed (win, lose, or tie).
You can choose to play again by entering Y, or stop by entering N when prompted.
Setup Instructions
Install Java: Ensure that you have Java Development Kit (JDK) installed on your system.

Clone this repository:
Copy code :
git clone https://github.com/your-username/RockPaperScissors.git

Navigate to the project directory:
Copy code :
cd RockPaperScissors

Compile the Java program:
Copy code :
javac RockPaperScissors.java

Run the program:
Copy code :
java RockPaperScissors

Example Output :
Copy code
Please enter your move: (R, P, or S)
R
Computer played: P
You lose!
Do you want to play again? (Y/N)
Y
Please enter your move: (R, P, or S)
P
Computer played: R
You win!
Do you want to play again? (Y/N)
N
Game Ends Here

Project Structure :
Css format
Copy code :

RockPaperScissors/
├── src/
│   └── RockPaperScissors.java
└── README.md
