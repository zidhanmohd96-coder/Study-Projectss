#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
    srand(time(0)); // Seed random number generator

    string choices[] = {"Rock", "Paper", "Scissors"};
    char playAgain;

    do {
        int playerScore = 0, computerScore = 0, round = 1;

        cout << "🔥 Welcome to Rock, Paper, Scissors! 🔥\n";
        cout << "First to win 3 out of 5 rounds is the Champion!\n\n";

        while (round <= 5) {
            int playerChoice, computerChoice;

            cout << "Round " << round << ": Choose `0` for Rock, `1` for Paper, `2` for Scissors: ";
            cin >> playerChoice;

            if (playerChoice < 0 || playerChoice > 2) {
                cout << "Invalid choice! Please enter 0, 1, or 2.\n" << endl;
                continue;  // Invalid input, retry this round.
            }

            computerChoice = rand() % 3; // Computer's random choice

            cout << "You chose: " << choices[playerChoice] << endl;
            cout << "Computer chose: " << choices[computerChoice] << endl;

            if (playerChoice == computerChoice) {
                cout << "It's a tie! 😐\n";
            }
            else if ((playerChoice == 0 && computerChoice == 2) || 
                     (playerChoice == 1 && computerChoice == 0) || 
                     (playerChoice == 2 && computerChoice == 1)) {
                cout << "You Win this round! 🎉\n";
                playerScore++;
            } else {
                cout << "Computer Wins this round! 💻\n";
                computerScore++;
            }

            cout << "Score — You: " << playerScore << " | Computer: " << computerScore << "\n" << endl;

            // Check if someone reached 3 wins early
            if (playerScore == 3 || computerScore == 3) {
                break;
            }

            round++; // Move to next round
        }

        // 🏆 Final Winner Announcement
        cout << "========================\n";
        if (playerScore > computerScore) {
            cout << "🎉 Congratulations! You are the Champion! 🏆\n";
        } else if (computerScore > playerScore) {
            cout << "💻 Computer takes the trophy this time! Better luck next time.\n";
        } else {
            cout << "It's a Draw Match! Well Played!\n";
        }
        cout << "========================\n";

        // Ask if player wants to play again
        cout << "Do you want to play again? (Y/N): ";
        cin >> playAgain;

        cout << "\n---------------------------------\n";

    } while (playAgain == 'Y' || playAgain == 'y');

    cout << "Thanks for playing! 🎮 See you next time.\n";
    return 0;
}
