package org.launchcode;

public class Temperature {
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;


        if (aFahrenheit < absoluteZeroFahrenheit) {
            try {
                throw new TemperatureException("That temperature is too low!");
            } catch (TemperatureException e) {
                e.printStackTrace();
            }
        }

        /*
        Above you will see that in order to throw an exception, we must create a try catch block to deal with it.
        So, we want to TRY to throw the exception and is we CATCH the error, we want to print the stack trace
         */

        fahrenheit = aFahrenheit;
    }
}
