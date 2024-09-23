package technology;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {

    //NOTE: when making test data, declare the test object first...
    Computer test_computer;
    Computer test_comp;

    //NOTE: Then you write your @BeforeEach-- remember you already declare
    //the test object, so just initialize it here, otherwise an error will be thrown
    @BeforeEach
    public void initComputer() {
        test_computer = new Computer("Dell", 2021, "Light Mode");
        test_comp = new Computer("Acer", 2024, "Dark Mode");
    }

    //TODO: add emptyTest so we can configure our runtime environment
    //IDK how to write this...
//    @Test
//    public void emptyTest() {
//
//        assertEquals();
//    }


    //TODO: constructor sets the brand correctly
    @Test
    public void constructorSetsBrand(){
        String msg = "object brand value should be what was passed in as arg.";
        String expected = "Dell";
        String actual = test_computer.getBrand();
        assertEquals(expected, actual, msg);
    }

    //TODO: constructor sets the year correctly
    @Test
    public void constructorSetsYear(){
        String msg = "object year value should be what was passed in as arg.";
        int expected = 2021;
        int actual = test_computer.getYear();
        assertEquals(expected, actual, msg);
    }

    //TODO: constructor sets the screenMode correctly
    @Test
    public void constructorSetsScreenMode(){
        String msg = "object screenMode value should be what was passed in as arg.";
        String expected = "Light Mode";
        String actual = test_computer.getScreenMode();
        assertEquals(expected, actual, msg);
    }

    //TODO: checks if the isNew() method is running correctly
    @Test
    public void isNewMethodRunningProperly(){
        String msg1 = "isNew should return false if object is more than 2 years old.";
        assertFalse(test_computer.isNew(), msg1);

        String msg2 = "isNew should return true if object is less than 2 years old.";
        assertTrue(test_comp.isNew());
    }

    //TODO: checks if the powerOn() method is printing correctly
    @Test
    public void isPowerOnMethodRunningProperly(){
        String msg = "powerOn should return true when method is called";
        assertTrue(test_computer.powerOn());
    }
}

/*
Coverage said it was 73% (14/19 lines) Some of the code is print lines, so I think it is looking decent to start.
It will round more out after I write the "empty" test as well. 

 */
