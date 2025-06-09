public class OperatorsExercise {

    public static void main(String[] args) {

        /* 1. Arithmetic Operations  */
        // declare and initialize variables for each of the following
        // number of hours in a day
        // number of minutes in an hour
        // number of seconds in a minute
        // number of inches in a foot
        // number of feet in a mile (5280)
        // length of the movie Titanic in minutes (195 minutes)

        int hoursDay = 24;
        int daysWeek = 7;
        int minsHour = 60;
        int secsMin = 60;
        int inchFoot = 12;
        int feetMile = 5280;
        int titanMins = 195;

        // using the above variables and arithmetic operators (+ - / * %)
        // print to the console solutions to the following prompts:
        // number of hours in a week
        // number of minutes in a week
        // if a car is moving 77 miles per hour, how many feet per second is it traveling? (~112.933 seconds)
        // how many hours and minutes long is the movie Titanic?
        // a mile and 900 feet is how many inches?

        System.out.println(hoursDay * daysWeek);
        System.out.println(minsHour * hoursDay * daysWeek);
        System.out.println(77 * feetMile / 3600);
        System.out.println(titanMins / 60 + " hours and " + titanMins % 60 + " minutes.");
        System.out.println(feetMile + 90 / 12);

        /* 2. Compound assignment operators */
        // demonstrate the use of all 5 compound assignment numbers with the variable x to print out the correct value
        int x = 10;
        // Same as x = x + 7; // print "x is 17"
        // Same as x = x - 5; // print "x is 12"
        // Same as x = x * 7; // print "x is 84"
        // Same as x = x / 3; // print "x is 28"
        // Same as x = x % 9; // print "x is 2"

        x += 7;
        x -= 5;
        x *= 7;
        x /= 3;
        x %= 9;
        System.out.println(x);


        /* 3. Complete the Conversion formulas  */
        // complete the following formulas using temperature_conversion.jpg as a guide

        double celsius = 32.0;
        double kelvin = 350;
        double fahrenheit = 212;

        double celsiusToKelvin = 0; // ~305.15°K
        System.out.println(celsius + "° Celsius = " + celsiusToKelvin + "° Kelvin");

        double kelvinToCelsius = 0; // ~76.85°C
        System.out.println(kelvin + "° Kelvin = " + kelvinToCelsius + "° Celsius");

        double fahrenheitToCelsius = 0; // ~100°C
        System.out.println(fahrenheit + "° Fahrenheit = " + fahrenheitToCelsius + "° Celsius");

        double celsiusToFahrenheit = 0; // ~ 89.6°K
        System.out.println(celsius + "° Celsius = " + celsiusToFahrenheit + "° Kelvin");

        double fahrenheitToKelvin = 0; // ~373.15°K
        System.out.println(fahrenheit + "° Fahrenheit = " + fahrenheitToKelvin + "° Kelvin");

        double kelvinToFahrenheit = 0; // ~170.33°F
        System.out.println(kelvin + "° Kelvin = " + kelvinToFahrenheit + "° Fahrenheit");




    }







}


