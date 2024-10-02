package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        System.out.println(Divide(3, 1));

        //I DON'T KNOW WHAT I AM DOING WRONG FOR THE DIVIDE METHOD.....I don't understand the debugging yet
        //I think it was because I needed to use double instead of int, but debugging did not help me with that
        System.out.println(Divide(10, 0));


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

        /*
        We need to loop over the values of each of the hashmap objects in the studentFiles hashmap.
        We then will print the file and call the CheckFileExtension() method on the file to calculate score
        for the files.

        The program will run all the way through and pop up the exception message for Brad's missing file.
         */

        for (String file : studentFiles.values()){
            System.out.println(file + " : "  + CheckFileExtension(file));
        }
    }

    public static double Divide(double x, double y) {

        try {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by 0!");
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return x/y;
    }


    public static int CheckFileExtension(String fileName) {

        int points = 0;

        try {
            if (fileName == null || fileName.isEmpty()) {
                points += -1;
                throw new CheckFileExtensionException("Student did not submit a file");

            } else if (fileName.contains(".java")) {
                points += 1;
            } else {
                points += 0;
            }
        } catch (CheckFileExtensionException e) {
            e.printStackTrace();
        }
        return points;
    }

    /*
    Whatever needs to be carried out, must go before the exception is thrown. If not, it won't work. So in this case,
    -1 points must be handles before the exception error is thrown.
     */
}

