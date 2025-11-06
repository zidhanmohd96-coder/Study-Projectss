#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main(){

    // Seed the random number generator
    srand(time(0)); // Use current time as seed for random generator
    int num = (rand() % 30) + 1;
    int guess = 0;
    int tries = 0;

    cout<<"Welcome to the Number Guesser!\n";
    cout<<"\nI have selected a number between 1 and 30. Can you guess it?\n";

    do{
        cout<<"Enter your guess: \n";
        cin>>guess;

        tries++;
        if(guess < num){
            cout<<"Your guess is too low. Try again.\n";
        }else if(guess > num){
            cout<<"Your guess is too high. Try again.\n";
        }else{
            cout<<"Congratulations! You guessed the number in "<<tries<<" tries.\n";
            cout<<"The number was "<<num<<".\n";
        }
    }while(guess != num);

    return 0;
};