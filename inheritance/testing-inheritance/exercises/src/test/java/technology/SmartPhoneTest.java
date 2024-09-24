package technology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartPhoneTest {


    //TODO: DECLARE OBJECTS TO TEST
    SmartPhone test_phone1;
    SmartPhone test_phone2;

    //TODO: WRITE THE @BeforeEach AND INITIALIZE THE OBJECTS
    @BeforeEach
    public void initSmartPhone(){
        test_phone1 = new SmartPhone("iphone", 2024, "Star Wars Theme", "At&T");
        test_phone2 = new SmartPhone("Galaxy", 2020, "LOTR Theme", "Verizon");
    }


    //TODO: constructor extends and sets the brand correctly
    @Test
    public void constructorSetsBrandToIPhone(){
        String msg = "object brand value should be what was passed in as arg.";
        String expected = "iphone";
        String actual = test_phone1.getBrand();
        assertEquals(expected, actual, msg);
    }

    //TODO: constructor extends and sets the year correctly
    @Test
    public void constructorSetsYearTo2024(){
        String msg = "object year value should be what was passed in as arg.";
        int expected = 2024;
        int actual = test_phone1.getYear();
        assertEquals(expected, actual, msg);
    }

    //TODO: constructor extends and sets the screenMode correctly
    @Test
    public void constructorSetsScreenModeStarWarsTheme(){
        String msg = "object screenMode value should be what was passed in as arg.";
        String expected = "Star Wars Theme";
        String actual = test_phone1.getScreenMode();
        assertEquals(expected, actual, msg);
    }

    //TODO: checks if the isNew() method is running correctly on smartphone
    //I checked using this test, and I can actually check for true and false in same unit test fine. Is it the best practice though?
    @Test
    public void isNewMethodRunningProperlyForLaptop(){
        String msg1 = "isNew should return false if object is more than 2 years old.";
        assertFalse(test_phone2.isNew(), msg1);

        String msg2 = "isNew should return true if object is less than 2 years old.";
        assertTrue(test_phone1.isNew());
    }

    //TODO: checks if the powerOn() method is printing correctly
    //I had made this method in Computer class return a boolean, which is fine, but I feel like since I used @override for the SmartPhone class
    //checking what is being printed is pretty important here... I am going to assign the String I wanted to print to a variable and then I should
    //be able to check the value of the variable <--- This might be something to think about in the future when writing code. Use variables more in print
    // lines for these situations and do I want to add that test in here? Or is it better to do individual check for this? For now, I will create it's own
    // since one is boolean and one is String
    @Test
    public void isPowerOnMethodRunningProperly(){
        String msg = "powerOn should return true when method is called";
        assertTrue(test_phone1.powerOn());
    }

    //TODO: CHECK TO MAKE SURE THE OVERRIDE FOR powerOn PRINTED A DIFFERENT MESSAGE FOR SMARTPHONE
    //had to add it to fields and make a getter for it. I guess in this situation, I might want to do a setter method-- may want to change message displayed
    @Test
    public void smartPhoneOverrideMethodShouldPrintDifferentMessage(){
        String msg = "smartphone should have a different message displayed due to override";
        String expected = "\"\\n\" + getBrand() + \": Powering On... \\n5G network is available \" +\n" +
                "                \"\\nReady to stay connected!\\n\"";
        test_phone2.powerOn();
        String actual = test_phone2.getPowerMessage();
        assertEquals(expected, actual, msg);
    }

    //TODO: WRITE TEST FOR THE sendText() method:
    /*
    This one seems complicated. There is no return type to flat out test. I feel like there are a lot of different stages that need to be tested within
    this one method.I would need to test values of print lines, so they all need to go in variables...Hmmm...

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


    1. first print line (enterMessage) value
    2. value of (message) to make sure input was captured
    3. second print line (displayMessage) value
    4. value of (send) to make sure input was captured correctly
    5. boolean of (delivered) during the if/else statement
    6. value of (deliveredDisplay) when delivered returns true
    7. value of (notDeliveredDisplay) when delivered returns false

    I GUESS I MIGHT NOT NEED TO CHECK USER INPUT VALUES IF THE OTHER TESTS ARE IN PLAY. IF THEY DIDN'T WORK, THE OTHER TESTS WOULD FAIL

    *** TAKE A BREAK, COME BACK AND CHANGE THOSE PRINTS TO VARIABLES TO BE TESTED.
     */


}
