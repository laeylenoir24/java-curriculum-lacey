public class DataTypesExercise {

    public static void main(String[] args) {

        /* 1. Declare and assign variables related to a soccer player */
        // store the name of a soccer player.
        // store the player's jersey number.
        // store the player’s field position (e.g., "Goalkeeper")
        // store whether the player is a starter (true or false)
        // store the name of the player’s team
        // -- use all of these variables in print out statements to the console
        /* Example output:
            Soccer player: Birgit Prinz
            Jersey number: 9
            Starter: True
            Plays as a Forward for Germany.
        */

        String playerName = "Maddie Moreau";
        int jersNum = 24;
        boolean isStarter = true;
        String fieldPos = "Defender";
        String teamName = "Bay FC";

        System.out.println("Soccer player: " + playerName);
        System.out.println("Jersey number: " + jersNum);
        System.out.println("Starter: " + isStarter);
        System.out.println(playerName + " plays " + fieldPos + " for the " + teamName);


        // change the player's jersey number, if they are a starter, and their team's name
        // reprint the previous console output with the new values

        jersNum = 17;
        isStarter = false;
        teamName = "Soccer Kids";

        System.out.println(playerName + "'s jersey number: " + jersNum);
        System.out.println("Starter: " + isStarter);
        System.out.println(playerName + " plays for the" + teamName);

        /* 2. Declare and assign variables related to a movie */
        // store the title of a movie.
        // store the year the movie was released.
        // store the total number of reviews for a movie
        // store the average of all reviews (scores 1 out of 10)
        // store the name of the director of a film
        // -- use all of these variables in print out statements to the console
        /* Example output:
            The movie Seven Samurai directed by Akira Kurosawa was released in 1954.
            It has an IMDB score of 8.6/10 with 384819 reviews.
        */

        String movieName = "the Da Vinci Code";
        int releasYear = 2006;
        int revTotal = 230;
        int revAver = 6/10;
        String dirName = "Ron Howard";

        System.out.println("The movie " + movieName + " directed by " + dirName + " was released in " + releasYear + ".");
        System.out.println("It has an IMDB score of " + revAver + " with " + revTotal + " reviews.");

        // update the number of reviews and average review score with new values
        // reprint the previous console output with requested updates

        revTotal = 7000;
        revAver = 10/10;

        System.out.println("It has an IMDB score of " + revAver + " with " + revTotal + "reviews.");


        /* 3. Declare and assign the following variables for a weather forecast: */
        // store the name of a city.
        // store the temperature in Fahrenheit.
        // store the humidity percentage.
        // store a short description of the weather (e.g., "Cloudy").
        // -- use all of these variables in print out statements to the console
        /* Example output:
            Weather Report: Philadelphia
            It is currently raining with a temperature of 63°F and a humidity of 44%
        */

        String cityName = "Monroe, La";
        int cityTemp = 70;
        double cityHum = 80.3;
        String cityConds = "hot and sticky.";

        System.out.println("Weather Report: " + cityName);
        System.out.println("It is currently " + cityConds + " with a temperature of " + cityTemp + "°F and a humidity of " + cityHum + "%.");

        // change the temperature, humidity, and description of the weather
        // reprint the previous console output with requested updates

        cityTemp = 27;
        cityHum = 2;
        cityConds = "cold and dry.";

        System.out.println("It is currently " + cityConds + " with a temperature of " + cityTemp + "°F and a humidity of " + cityHum + "%.");



        /* 4.  Declare and assign the following variables for a flight at an airport: */
        // store the flight number (e.g., "AA256").
        // store the departure city (e.g., "New York").
        // store the arrival city (e.g., "Los Angeles").
        // store the seat number for the flight.
        // store the terminal number at the airport.
        // store whether the flight is delayed (true or false)
        // -- use all of these variables in print out statements to the console
        /* Example output:
            Flight: AF21084 London to New York (NYC)
            Gate: C
            Seat: 8F
            Delayed: False
        */

        String flightNum = "LL2156";
        String departCity = "Atlanta";
        String arrivCity = "Houston";
        char seatNumber = '6';
        char termNum = '4';
        boolean isDelayed = false;

        System.out.println("Flight: " + flightNum + departCity + " to" + arrivCity);
        System.out.println("Gate: " + termNum); System.out.println("Seat: " + seatNumber);
        System.out.println("Delayed: " + isDelayed);


        /* 5. Declare and assign three boolean variables related to school or work. */
        // whether you have homework (true or false).
        // whether today is the weekend (true or false).
        // whether you attended class today (true or false)
        // -- these variables in print out statements to the console
        /* Example output:
            Do I have homework? False
            Is it the weekend? False
            Did I attend class today? True
         */
        boolean isEnrolled = true;
        boolean isCurrent = false;
        boolean isInterested = true;

        System.out.println("Is the student currently enrolled? " + isEnrolled);
        System.out.println("Is the student current in assignments? " + isCurrent);
        System.out.println("Is the student interested in a tutor? " + isInterested);


        /* 6. primitive data types */
        // for each of the 8 primitive data types declare and
        // initialize a variable that would store a real world value fitting for each data type
        // byte, short, int, long, float, double, boolean, char

        int myAge = 31;
        boolean isParent = true;
        char mySex = 'F';
        byte  carsOwned = 2;
        short currentYear = 2025;
        long averageStudentDebt = 38375;
        double myHeight = 69.25;
        float hoursWorked = 40;


    }
}

//new push
