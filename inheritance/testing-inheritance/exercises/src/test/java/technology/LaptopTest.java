package technology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LaptopTest {
    Laptop test_laptop1;
    Laptop test_laptop2;

    @BeforeEach
    public void initLaptop(){
        test_laptop1 = new Laptop("Lenovo", 2023, "Dark Mode");
        test_laptop2 = new Laptop("ASUS", 2016, "Light Mode");
    }


    //I think I still need some kind of empty test <--- Still not sure how I would write this yet.



    //TODO: constructor extends and sets the brand correctly
    @Test
    public void constructorSetsBrandToLenovo(){
        String msg = "object brand value should be what was passed in as arg.";
        String expected = "Lenovo";
        String actual = test_laptop1.getBrand();
        assertEquals(expected, actual, msg);
    }

    //TODO: constructor extends and sets the year correctly
    @Test
    public void constructorSetsYearTo2023(){
        String msg = "object year value should be what was passed in as arg.";
        int expected = 2023;
        int actual = test_laptop1.getYear();
        assertEquals(expected, actual, msg);
    }

    //TODO: constructor extends and sets the screenMode correctly
    @Test
    public void constructorSetsScreenModeToDarkMode(){
        String msg = "object screenMode value should be what was passed in as arg.";
        String expected = "Dark Mode";
        String actual = test_laptop1.getScreenMode();
        assertEquals(expected, actual, msg);
    }

    //TODO: checks if the isNew() method is running correctly on Laptop
    @Test
    public void isNewMethodRunningProperlyForLaptop(){
        String msg1 = "isNew should return false if object is more than 2 years old.";
        assertFalse(test_laptop2.isNew(), msg1);

        String msg2 = "isNew should return true if object is less than 2 years old.";
        assertTrue(test_laptop1.isNew());
    }

    //TODO: checks if the powerOn() method is printing correctly
    @Test
    public void isPowerOnMethodRunningProperly(){
        String msg = "powerOn should return true when method is called";
        assertTrue(test_laptop2.powerOn());
    }

    //TODO: checks if the doHomework() method works correctly
    @Test
    public void isDoHomeworkMethodRunningProperly() {
        String msg = "doHomework should return a string";
        String expected = "\\n\" + getBrand() + \": You did it! Great Job!! You finished your homework!";
        String actual = test_laptop1.doHomework();
    }

    //TODO: check if variable charged is returning false after doHomework() method is called
    @Test
    public void isChargedReturningFalse(){
        String msgIsCharged = "doHomework should change the variable charged to false";
        test_laptop1.doHomework();
        assertFalse(test_laptop1.isCharged());
        //How would I check about the boolean since it isn't what is actually returned? Can I check the value of it as a Test? (THAT SEEMED TO WORK)
        //And... why don't I need to use object name before getBrand() in the doHomework test above, but I do on the test below?
    }

    //TODO: checks if the checkBatteryLevel() method is working correctly
    @Test
    public void isCheckBatteryLevelMethodRunningProperly(){
        String msg = "if the homework method is called, the battery level should return a String telling user to charge it";
        String expected = "\n" + test_laptop2.getBrand() + ": Whew! I have been working hard, I need to charge up a bit. You can sit with me while I do.";
        test_laptop2.doHomework();
        String actual = test_laptop2.checkBatteryLevel();
        assertEquals(expected, actual, msg);

//        String msg1 = "if the homework method is not called, the battery level should return a string telling user it is charged";
//        String expected1 = "\\n\" + getBrand() + \": I got a lot of life left in me! Feel free to roam around with me.";
//        String actual1 = test_laptop2.checkBatteryLevel();
//        assertEquals(expected, actual, msg1);      <---- IT'S BECAUSE I DIDN'T CHANGE VARIABLE NAMES HERE THAT IT WAS HITTING FALSE 2X AND TRUE 0
    }
    //TODO: checking to see if separating the test above into 2 would be best since one is true and one is false. Makes more sense to do different tests
    @Test
    public void checkBatteryReturnsTrueIfDoHomeWorkIsNotCalled(){
    String msg1 = "if the homework method is not called, the battery level should return a string telling user it is charged";
    String expected1 = "\n" + test_laptop2.getBrand() + ": I got a lot of life left in me! Feel free to roam around with me.";
    String actual1 = test_laptop2.checkBatteryLevel();
    assertEquals(expected1, actual1, msg1);
    }
}

/*
Think it came out to about 77% code coverage. I still want to learn what it means by hits, What the blue block represents. I know red is untested
and green is tested successfully. Seemed like maybe it was just saying that it only was checking for false return and not a true return for check battery level

Got 88% now just by fixing the test above with the correct variable names.

Also, learn more about the coverage stats, not sure if I understand them all fully.
 */
