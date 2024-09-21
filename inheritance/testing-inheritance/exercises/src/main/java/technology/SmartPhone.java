package technology;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SmartPhone extends Computer {




    //TODO: DECLARE FIELDS
    private String provider;
    private boolean delivered = false;


    //TODO: CREATE THE CONSTRUCTOR
    public SmartPhone(String brand, int year, String screenMode, String provider){
        super(brand, year, screenMode);
        this.provider = provider;
    }


    //TODO: DECLARE GETTERS AND SETTERS
    public String getProvider(){
        return provider;
    }

    public void setProvider(){
        this.provider = provider;
    }

    public boolean getDelivered(){
        return delivered;
    }



    //TODO: CREATE METHOD THAT PROMPTS USER TO ENTER A TEXT



    //TODO: CREATE INSTANCE METHOD sendText(Scanner input)
    //I want to let the user input what they want to text and then print the message.
    //After message prints. I want to make delivered return true.

    public void sendText(){
        Scanner input = new Scanner(System.in);

        System.out.println(getBrand() + ": Enter the message you would like to send: \n");
        String message = input.nextLine();
        System.out.println(getBrand() + ": You would like to send: \n\n\t\t'" + message +
                "'\n\n" + getBrand() + ": Would you like to send? ENTER 'YES or NO'");
        String send = input.nextLine().toUpperCase();
        if (send.equals("YES")){
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
    public String powerOn(){
        return "\n" + getBrand() + "Powering On... \n5G network is available " +
                "\nReady to stay connected!\n";

    }


}
