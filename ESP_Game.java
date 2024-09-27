/*

* Class: CMSC203

* Instructor: David Kujit

* Description: (This code creates a simple game where the computer randomly picks a color from a list of 16, and the user has to guess which one it is.)

* Due: 09/25/2024

* Platform/compiler:

* I pledge that I have completed the programming assignment

* independently. I have not copied the code from a student or * any source. I have not given my code to any student.

* Print your Name here: Santiago Ardila

*/

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Random;

import java.util.Scanner;

public class ESP_Game {

// Constants for colors

final static String COLOR_BLACK = "black";

final static String COLOR_WHITE = "white";

final static String COLOR_GRAY = "gray";

final static String COLOR_SILVER = "silver";

final static String COLOR_MAROON = "maroon";

final static String COLOR_RED = "red";

final static String COLOR_PURPLE = "purple";

final static String COLOR_FUCHSIA = "fuchsia";

final static String COLOR_GREEN = "green";

final static String COLOR_LIME = "lime";

final static String COLOR_OLIVE = "olive";

final static String COLOR_YELLOW = "yellow";

final static String COLOR_NAVY = "navy";

final static String COLOR_BLUE = "blue";

final static String COLOR_TEAL = "teal";

final static String COLOR_AQUA = "aqua";

@SuppressWarnings("resource")

public static void main ( String [] args) throws FileNotFoundException {

final String file_name = "colors.txt";

System.out.println("CMSC203 Assignment1: Test your ESP skills");

System.out.println("Enter the filename: "+file_name);

System.out.println("There are sixteen colors from a file");

File file = new File("C:\\Users\\santi\\Downloads\\colors.txt");

Scanner scan = new Scanner(file);

while(scan.hasNextLine()) {

System.out.println(scan.nextLine());

}

scan.close();// Close the scanner for the colors file

// Initialize variables for the game

int correctGuesses = 0;

Random random = new Random();

Scanner userInputScanner = new Scanner(System.in);

// Play 3 rounds of guessing

for (int round = 1; round <= 3; round++) {

System.out.println("\nRound " + round);

System.out.println("I am thinking of a color.");

System.out.println("Is it one of the list of colors above?");

System.out.print("Enter your guess: ");

Scanner scanner = new Scanner(System.in);

String user_guess = scanner.nextLine();

// Generate a random number from 1 to 16 (includes number 1)

int randomNumber = random.nextInt(16) + 1;

String color_chosen = "";

switch (randomNumber) {

case 1: color_chosen = COLOR_BLACK; break; // black

case 2: color_chosen = COLOR_WHITE; break; // white

case 3: color_chosen = COLOR_GRAY; break; // gray

case 4: color_chosen = COLOR_SILVER; break; // silver

case 5: color_chosen = COLOR_MAROON; break; // maroon

case 6: color_chosen = COLOR_RED; break; // red

case 7: color_chosen = COLOR_PURPLE; break; // purple

case 8: color_chosen = COLOR_FUCHSIA; break; // fuchsia

case 9: color_chosen = COLOR_GREEN; break; // green

case 10: color_chosen = COLOR_LIME; break; // lime

case 11: color_chosen = COLOR_OLIVE; break; // olive

case 12: color_chosen = COLOR_YELLOW; break; // yellow

case 13: color_chosen = COLOR_NAVY; break; // navy

case 14: color_chosen = COLOR_BLUE; break; // blue

case 15: color_chosen = COLOR_TEAL; break; // teal

case 16: color_chosen = COLOR_AQUA; break; // aqua

default: break;

}

System.out.println("I was thinking of " + color_chosen + ".");

if(user_guess.equals(color_chosen)) {

correctGuesses++;

}

}

System.out.println("Game Over");

System.out.println("You guessed "+ correctGuesses + " out of 3 times");

System.out.print("Enter your name: ");

String user_name = userInputScanner.nextLine();

System.out.print("Describe yourself: ");

String user_description = userInputScanner.nextLine();

System.out.print("Due Date (MM/DD): ");

String due_date = userInputScanner.nextLine();

System.out.println("User Name: " + user_name);

System.out.println("User Description: " + user_description);

System.out.println("Due Date: " + due_date);

}

}