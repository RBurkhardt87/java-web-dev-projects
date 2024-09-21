package org.launchcode;

public class Main {
    public static void main(String[] args) {


        //Create an instance of HouseCat
        //Pass in the correct parameters per the constructor that's set in HouseCat
        //Because... HouseCat inherits all "non-constructor" methods from its base
        //class. SO CONSTRUCTORS ARE NOT INHERITED FROM THE PARENT CLASS:
        HouseCat garfield = new HouseCat("Garfield", 12);

        /*
                **** As you should recall, constructor do NOT have return types
        CAT CLASS CONSTRUCTOR:
        public Cat(double aWeight) {
           weight = aWeight;
        }

        HOUSECAT CLASS CONSTRUCTOR:
      public HouseCat(String aName, double aWeight) {
           super(aWeight);
           name = aName;
        }


        As you can see, there is the word 'super' used in the first line of
        HouseCat's constructor. The word super EXTENDS the HouseCat Class
        constructor to include the original constructor (the Cat Class) by setting
        and additional property name.
        *
        *
        *
        So, what if we had to constructors in the Cat class. Our current constructor
        and also a no-arg constructor

        public Cat() {
           weight = 13;
        }

        In this case, when we write our HouseCat constructor like this...

        public HouseCat(String aName) {
           name = aName;
        }

        Even tho we don't say 'super' the Cat no-arg constructor will still be
        applied. Go past the methods to the end to see examples....
        */




        //Use an instance method from the Cat class on the new HouseCat object
        garfield.eat();

        //Print the results of the method:
        System.out.println(garfield.isTired());  //Prints True

        //The HouseCat object inherited the eat() method from the Cat Class
        /*
        So, in the Cat class these variables were initiated with these values
        private boolean tired = false;
        private boolean hungry = false;

        When calling the eat() method on garfield...

        public void eat() {

            // eating when not hungry makes a cat sleepy
            if (!hungry) {
                tired = true;
            }

            hungry = false;
        }

        So... hungry is currently false, therefore the if statement is true
        and tired becomes "true" which was what we got.

        If we were to call another method on garfield, say the sleep() method

        public void sleep() {
            tired = false;
            hungry = true;
        }

        Now, garfield is hungry, so the if statement returns false and hungry
        is set to false instead, which is what we got when we called the isTired()
        method again.

         */

        garfield.sleep();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());      //13
        System.out.println(garfield.getWeight());   //12

/*
In order for the constructors to work properly...

First, Cat Class had to have 2 constructors:
    -->The first one, required a weight arg. This could be extended to the
    HouseCat constructor by using the keyword "super"
    -->The second was a no-arg constructor, but had a set weight inside the
    constructor of 13.

Second, HouseCat Class has to have 2 constructors:
    -->The first one had 2 parameters (name, weight). Weight was extended
    from the Cat Class and name was created in its own constructor
    -->The second, was a constructor that took in one arg (name) and by
    default, it inherited/extended the set weight of 13 from the Cat Class.

As a consequence of this constructor syntax, we can easily expose any
constructor from the base class by providing a subclass constructor with
the same signature and a body that only calls the base class constructor.


****** WHAT THAT REALLY MEANS IS THIS....

    When you define a constructor in a subclass, if you do not explicitly
    call a constructor from the superclass using super(), Java automatically
    calls the no-argument constructor of the superclass (if it exists).

 */


        //TODO: Explore Method OVERRIDING:
        //Create instance of Cat using 1 arg constructor
        Cat plainCat = new Cat(8.6);

        //Create instance of HouseCat using 2 arg constructor
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        //Call and print noise() method on Cat Object:
        System.out.println(plainCat.noise()); //Meeeeeeooooowww!

        //Call and print noise() method on HouseCat Object:
        System.out.println(cheshireCat.noise()); //Hello, my name is Cheshire!

        //Because of the @Override we were able to write over the noise() method for HouseCat
        //Annotation is not required, but could practice just to use to avoid errors
        //When @overriding, the method signatures must be exactly the same (method name, access
        //level, return type and type and number of input parameters).

        /*
        If you add 'super' followed by "." and the method name, you can call the
        base class method from the override method in subclass.

        Example:

    NOISE() METHOD FROM CAT CLASS:
    public String noise () {
        return "Meeeeeeooooowww!";
    }

    NOISE() METHOD FROM HOUSECAT CLASS
    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    CALLING FROM MAIN:
    public class Main {
        public static void main(String[] args) {
            HouseCat cheshireCat = new HouseCat("Cheshire", 12);
            cheshireCat.noise();
        }
    }
    //OUTPUT::: Meeeeeeooooowww! Hello, my name is Cheshire!




    EXTRA REMINDERS/NOTE:
        --> a subclass inherits the methods and variables of a Parent class
        as long as those variables/methods aren't private. However, you can use
        getters and setters to access/modify those private fields in the subclass
        (Make sure you want to give the subclass access to modify a variable in the
        superclass tho. Sometimes this isn't desirable)

        -->All methods, except for constructors are inherited by the subclass. However,
        you can extend the superclass constructor by using the word "super" in the first
        line of the constructor, remember, to do so you must list those parameters as well

        --> If you want to override a method (of the same structure) you use the annotation
        @Override followed by the customize code.
         */


        /*

        -----> CASTING: means that a superclass can hold a subclass object.

        So...  Cat suki = new HouseCat("Suki", 8);
        This is acceptable because HouseCat is a Cat
        And if we call a method, like noise(), the compiler will know that
        it should be using the HouseCat override version of it.

        That only works with a method inside the base class (Cat). If you
        try and call a method from HouseCat, it will cause an error since
        'Cat' is holding the object and the Cat class doesn't contain the method


         */

        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());

        //This causes an error because that method is inside HouseCat, not Cat
//        suki.isSatisfied();

        //Same method is called here, but it works because the object lolo is store in HouseCat
        HouseCat lolo = new HouseCat("Lolo", 6);
        System.out.println(lolo.isSatisfied());

        //This one works because isHungry() is a method inside Cat, which is holding suki object
        System.out.println(suki.isHungry());

        //Again, it works because HouseCat inherited the methods of Cat
        System.out.println(lolo.isHungry());


        /*
        Now, if we really knew that Suki was a HouseCat (which she was declared
        as just a Cat), we could case the object to HouseCat to run the method we tried above.

        EXAMPLE: As long as suki really is a HouseCat, this works
            ((HouseCat) suki).isSatisfied();

            Now that worked below, and I am guessing because the HouseCat extends Cat.
            However, the book said this can be dangerous to use because it won't get caught
            by the compiler beforehand and can actually cause runtime exception-- occurs when the program
            is running.

            So only cast objects to another type when you are sure it's safe to do so.

            *** Storing objects of one type (HouseCat) in a variable or field of another
            compatible type (Cat) is an example of polymorphism-- which is another pillar of OOP.
         */
        System.out.println(((HouseCat) suki).isSatisfied());
    }
}