package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        //This is just telling the user what they will need to do
        System.out.println("Enter your students name (or ENTER to finish : ");

        //Get student names and ID numbers
        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                System.out.println("ID Number: ");
                Integer idNum = input.nextInt();
                students.put(newStudent, idNum);

                //Read in the newline before looping back since they next input is a string
                input.nextLine();
            }

        } while (!newStudent.equals(""));

        //Print the student and ID numbers
        System.out.println("Student and ID numbers:");

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println((student.getKey() + ": " + student.getValue()));
        }
    }
}
