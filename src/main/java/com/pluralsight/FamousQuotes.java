package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        //Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //Create an array of 10 quotes (Strings)
        String[] quotes = {
                "Be yourself; everyone else is already taken. - Oscar Wilde",
                "Two things are infinite: the universe and human stupidity. - Albert Einstein",
                "So many books, so little time. - Frank Zappa",
                "A room without books is like a body without a soul. - Marcus Tullius Cicero",
                "Be the change that you wish to see in the world. - Mahatma Gandhi",
                "If you tell the truth, you don't have to remember anything. - Mark Twain",
                "Without music, life would be a mistake. - Friedrich Nietzsche",
                "We accept the love we think we deserve. - Stephen Chbosky",
                "It is never too late to be what you might have been. - George Eliot",
                "Do what you can, with what you have, where you are. - Theodore Roosevelt"
        };
        // Bonus: loop so the user can keep requesting quotes
        while (true) {

            //Ask the user to enter a number between 1 and 10
            System.out.print("Enter a number (1-10) to see a quote: ");

            int choice = scanner.nextInt();

            //Convert user input (1-10)to array index (0-9)
            int index = choice - 1;

            //Display the selected quote
            //NOTE: This will crash if the user enters an invalid number
            System.out.println(quotes[index]);

            //Ask the user if they want another quote
            System.out.print("Would you like another quote? (Yes or No)");
            String answer = scanner.next();

            //If user says "No", exit the loop
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
        //Close the scanner
        scanner.close();

        //Program ends here
        System.out.println("Goodbye!");
    }
}
