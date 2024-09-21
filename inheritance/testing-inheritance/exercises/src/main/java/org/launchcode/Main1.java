package org.launchcode;

public class Main1 {
    public static void main(String[] args) {

        //If you uncomment code it says that ...
        //"AbstractCat" is abstract; cannot be instantiated
//        AbstractCat abstractCat = new AbstractCat(8);


        /*
        Using abstract in the declaration makes it so you can't make any
        objects from that particular class.

        There is also something called "abstract method" It is a method that
        doesn't have a body, only a signature. It also must be marked as "abstract"

        In our AbstractCat Class it would make sense to have an abstract method for
        noise(), that way the subclasses are forced to provide their own implementation
        of the behavior

        In AbstractCat, the noise() method is now an abstract method... go look
         */

//        Tiger tony = new Tiger("Tony", 200);
//        System.out.println(tony.noise());
  }
}
