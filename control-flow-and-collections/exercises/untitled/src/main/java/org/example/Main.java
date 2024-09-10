package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //PRACTICE WITH ARRAYS

        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int i : integerArray) {

            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
//
//        String[] sentenceArray = sentence.split(" ");
//
//        for (String word : sentenceArray) {
//            System.out.println(word);
//        }
//
//        System.out.println(Arrays.toString(sentenceArray));

        String[] newSentenceArray = sentence.split("\\.");
        System.out.println(Arrays.toString(newSentenceArray));

        //END OF ARRAY PRACTICE

        //PRACTICE WITH ARRAYLISTS

        ArrayList<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);


        System.out.println(integerList);

        int sum = sumEven.sumOfEven(integerList);
        System.out.println(sum);


        ArrayList<String> wordLengths = new ArrayList<>();

        wordLengths.add("blue");
        wordLengths.add("color");
        wordLengths.add("spice");
        wordLengths.add("hi");
        wordLengths.add("hello");
        wordLengths.add("star");
        wordLengths.add("soup");

        System.out.println(wordLengths);

        fiveLetterWords.printFiveLetterWords(wordLengths);






    }

}