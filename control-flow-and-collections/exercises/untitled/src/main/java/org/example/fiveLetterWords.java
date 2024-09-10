package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class fiveLetterWords {
    public static void printFiveLetterWords(ArrayList<String> words){

        //PROMPT THE USER FOR A WORD
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the word length we should look for: ");
        int numChars = input.nextInt();

        for (String word : words) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }

    }
}
