package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String quote = "If the product of two terms is zero " +
//                "then common sense says at" + " least one of the two terms has to be" + " zero to start with. " +
//                "So if you move all the" + " terms over to one side, you can put the quadratics into a form that can" +
//                " be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty " +
//                "straightforward from there.";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a quote: ");
        String quote = input.nextLine();


        //Making sure that there are no non-alpha letters in our HashMap
        //First, declare a variable with String type and assign it to the alphabet.
        String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] charactersInString = quote.toUpperCase().toCharArray();

        HashMap<Character, Integer> charactersMap = new HashMap<>();

        for (char letter : charactersInString) {


            if (charactersMap.containsKey(letter)) {
                charactersMap.put(letter, charactersMap.get(letter) + 1);
            } else {
                charactersMap.put(letter, 1);
            }

        }

        for (Map.Entry<Character, Integer> letter : charactersMap.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());

            input.close();
        }
    }
}


