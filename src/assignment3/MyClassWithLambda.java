package assignment3;

import java.util.Scanner;

public class MyClassWithLambda {
    public static void main(String[] args) {
        //Input reader
        Scanner in = new Scanner(System.in);

        //Get input string
        System.out.println("Enter the String: ");
        String input = in.nextLine();

        //Count number of words
        WordCount wordCount = string -> {
            String[] words = input.split(" ");
            return words.length;
        };

        //Display number of words
        System.out.println("Word Count: " + wordCount.count(input));
    }
}
