package technology;

import java.util.Scanner;

public class SmartPhone extends Computer {


    //TODO: DECLARE FIELDS
    private String provider;
    private boolean delivered = false;
    private String powerMessage;



    //TODO: CREATE THE CONSTRUCTOR
    public SmartPhone(String brand, int year, String screenMode, String provider) {
        super(brand, year, screenMode);
        this.provider = provider;

    }

    //I might want to make other constructors that don't require a screenMode or even provider. Just year and brand/model


    //TODO: DECLARE GETTERS AND SETTERS
    public String getProvider() {
        return provider;
    }

    public void setProvider() {
        this.provider = provider;
    }

    //I might not want there to be a setter for this because it could mess up my app if someone changes the value outside of calling the methods
    public boolean getDelivered() {
        return delivered;
    }

    public String getPowerMessage() {
        return powerMessage;
    }

    public void setPowerMessage() {
        this.powerMessage = powerMessage;
    }


    //TODO: CREATE INSTANCE METHOD sendText(Scanner input)
    //I want to let the user input what they want to text and then print the message.
    //After message prints. I want to make delivered return true.

    public void sendText() {
        Scanner input = new Scanner(System.in);

        System.out.println(getBrand() + ": Enter the message you would like to send: \n");
        String message = input.nextLine();
        System.out.println(getBrand() + ": You would like to send: \n\n\t\t'" + message +
                "'\n\n" + getBrand() + ": Would you like to send? ENTER 'YES or NO'");
        String send = input.nextLine().toUpperCase();
        if (send.equals("YES")) {
            delivered = true;
            System.out.println("\n" + getBrand() + ": Perfect! Message sent!");
        } else {
            delivered = false;
            System.out.println("\n" + getBrand() + ": Message NOT sent! PHEW!!");
        }
        input.close();


    }

    //TODO: TRY TO WRITE AN OVERRIDE FOR COMPUTER CLASS powerOn() method
    //The greeting says "computer" which works for the laptop, but not the phone. Instead of revising the original
    //method, I want to try to do an override...

    @Override
    public boolean powerOn() {
        String border = "**********************************";
        System.out.println(border);
        powerMessage = "\n" + getBrand() + ": Powering On... \n5G network is available \nReady to stay connected!\n";
        System.out.println(powerMessage);
        System.out.println(border);
        return true;

        //If I override the method, what happens to the poweredOn variable I added?
        //How should I use that here... Do I even need it since I changed the return
        //type to boolean instead of String for testing purposes
    }


    //TODO:
    //If I write a powerOff() for Computer Class I could override it like this one.

    //I'm sure there is more I could build off sendText, but I'll let it sit for now

    //Maybe I could store the user's messages in an arrayList. So they could look through their sent messaged
    //Or if they don't send, I could have an arrayList of draft messages they could see.
    //Maybe instead of an ArrayList of strings, I would do ArrayList of hashmaps, that way I could incorporate
    //a contact name as the key and the message as its value.

    //Could also make a contact list, I would make another class called contacts-- it couldn't be the abstract class tho
    //because I would actually want to make contact objects to group into an arrayList of hashmaps.

    //Or, I could take an already written data file of contacts (setup as hashmaps) and use it similarly to the techJobs
    //Job positions, and be able to access them that way in the program.

    //---> I could maybe have a method that links the phone to a Computer/Laptop object, and then you could sendText from there
    // Or maybe....
    //The Abstract class could be more of a communication class. It could have methods for
    //sending and receiving text (smartphone), emails (computer/laptop)
    //Or computer could have been abstract and containing basic methods like powerON/Off,
    //Could create another subclass (Desktop/PC) that would be similar to how my computer class acts now instead


//----> Maybe add a Desktop and Contact Class. Turn Computer Class into an abstract class. Extend it to all currently subs of Computer and add extension to Desktop
    //Contact Class-- create contact objects so we have some data to work with

    //TODO: Create a toString() method to list product info, super in from Abstract Class and and in Computer fields
    public String toString(){
        String newline = System.lineSeparator();
        return super.toString() +
                "Provider: " + provider + newline;
    }
}