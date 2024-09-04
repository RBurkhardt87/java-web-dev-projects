package org.launchcode;


import java.util.Scanner;

public class AliceStrings {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the " +
                "book her sister was reading, but it had no pictures " +
                "or conversations in it, ‘and what is the use of a " +
                "book,’ thought Alice ‘without pictures or " +
                "conversation?’";


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search for: ");
        String word = input.next();
        input.close();

        if (sentence.toLowerCase().contains(word.toLowerCase())){
            System.out.println("true");
            System.out.println("The length of the word is: " + word.length());
            System.out.println("The word starts at index: " + sentence.indexOf(word));
            System.out.println(sentence.replace(word, "---"));
        }



    }
}
