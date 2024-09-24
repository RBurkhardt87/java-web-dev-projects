package technology;

import java.sql.SQLOutput;

public class RunProgram {
    public static void main(String[] args) {

        //TODO: instantiate a SmartPhone object
        SmartPhone choPhone = new SmartPhone("Galaxy Note", 2019, "Harry Potter Theme", "T-Mobile");

        choPhone.powerOn();

        choPhone.sendText();


        System.out.println();
        System.out.println();

        //TODO: instantiate a Laptop object
        Laptop myLapTop = new Laptop("Lenovo", 2024, "Dark Mode");

        myLapTop.powerOn();
        System.out.println();
        System.out.println("CHECK BATTERY LEVEL: ");
        System.out.println(myLapTop.checkBatteryLevel());
        System.out.println();
        System.out.println("CHECK IF I USED IT TO DO HOMEWORK: ");
        System.out.println(myLapTop.doHomework());
        System.out.println();
        System.out.println("CHECK THE BATTERY LEVEL AFTER DOING HOMEWORK: ");
        System.out.println(myLapTop.checkBatteryLevel());


    }
}
