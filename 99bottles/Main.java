import java.util.Scanner;

public class Main {
    public static String[] lowarr = { "no more", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteeen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen" };
    public static String[] higharr = { "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
            "ninety" };

    // ^^^^^^^^^ Arrays of words ^^^^^^^^^^^^
    public static void print(Object toPrint) { // Fake print statement because Python > Java
        System.out.println(toPrint);
    }

    static String GetNum(String a) {
        int aIsNum = Integer.parseInt(a); // Create a number from the given string
        if (a.length() != 2) { // Append a 0 to single digit strings
            a = "0" + a;
        }
        char num1ch = a.charAt(0); // Create a Char of the first digit
        String num1 = "" + num1ch; // Turn that Char in to a string
        int firstNumber = Integer.parseInt(num1); // Also turn it in to a number
        char num2ch = a.charAt(1); // Create Char of the second digit
        String num2 = "" + num2ch; // Turn that one in to a string
        int secondNumber = Integer.parseInt(num2); // Turn it in to a number
        if (aIsNum > 19 && !num2.equals("0")) { // If block to now turn the numbers in to words
            return higharr[firstNumber - 1] + "-" + lowarr[secondNumber]; // Return a tens number + a digits number
        } else if (num2.equals("0") && firstNumber > 0) {
            return higharr[firstNumber - 1]; // Return a tens number only
        } else {
            return lowarr[aIsNum]; // Return a digits number only
        }
    }

    static String Bottle(int a) { // Method to decide if it should say "Bottle" or "Bottles"
        if (a != 1) {
            return "bottles";
        } else {
            return "bottle";
        }
    }

    public static void main(String[] args) {
        print("How many bottles of beer are on the wall?"); // Ask the question
        Scanner input = new Scanner(System.in); // Define Scanner
        int toPrint = input.nextInt(); // Get input as Integer
        input.close(); // Close Scanner to avoid memory leaks
        for (int x = toPrint; x > 0; x--) { // Start of loop
            String numberToUse = "" + x; // Turn the current value of x (the loop) in to a string to be passed to the
                                         // GetNum method
            String nextNumber = "" + (x - 1); // Do the same for x-1, for the second line of the song
            print(GetNum(numberToUse) + " " + Bottle(x) + " of beer on the wall, " + GetNum(numberToUse) + " "
                    + Bottle(x) + " of beer"); // Start the verse
            print("take one down, pass it around, " + GetNum(nextNumber) + " " + Bottle(x - 1)
                    + " of beer on the wall"); // Second line of verse
            print(""); // To create a space between verses
        }
        print("no more bottles of beer on the wall, no more bottles of beer"); // Loop is finished, end of song starts
        print("go to the store, buy some more, " + toPrint + " bottles of beer on the wall");
    }
}
