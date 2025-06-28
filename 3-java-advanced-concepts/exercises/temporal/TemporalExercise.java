package temporal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class TemporalExercise {

    // 1. return today's date
    public LocalDate getToday() {
        return LocalDate.now();
    }


    // 2. return the current time as a LocalTime
    public LocalTime getNow() {
        LocalTime now = LocalTime.of(16, 13);
        return now;
    }


    // 3. return December 17, 1903 as a LocalDate
    public LocalDate getFirstFlightDate() {
        LocalDate firstFlight = LocalDate.of(1903, 12, 17);
        return firstFlight;
    }

    // 4. if parameter is in the future, return null.
    // Otherwise, add 5 days to the parameter and return the result.
    public LocalDate makeFutureNullShiftThePast(LocalDate date) {
        LocalDate thisDay = LocalDate.now();
        if (date.isAfter(thisDay)) {
            return null;
        }
        else {
            return thisDay.plusDays(5);
        }
    }

    // 5. return 4PM (tea time!) as a LocalTime.
    public LocalTime getTeaTime() {
        LocalTime teaTime = LocalTime.of(16, 00);
        return teaTime;
    }

    // 6. add 12 hours to the time parameter and return the value
    public LocalTime add12Hours(LocalTime time) {
        return time.plusHours(12);
    }

    // 7. return the fifth Friday from the parameter date.
    // if the date is Friday, don't count it.
    public LocalDate fiveFridaysFromDate(LocalDate date) {
        LocalDate tonight = date.plusDays(1);

        return null;
    }

    // 8. given a date and a count,
    // return a list of the next `fridayCount` Fridays after the date.
    // if the date is Friday, don't include it.
    public List<LocalDate> getNextFridays(LocalDate date, int fridayCount) {
        return null;
    }

    //I don't understand what this question is asking for.

    // 9. return the absolute value of the days between two dates.
    // one may be before two, two may be before one, but neither will be null
    public int getDaysBetween(LocalDate one, LocalDate two) {
        return 0;
    }

    // given a time parameter, return a list of the next 4
    // quarter-hour appointments available after the time.
    // appointment times should not include seconds even if the time parameter does.
    // ignore seconds.
    // Examples:
    // time == 16:07:32
    // appointments == 16:15, 16:30, 16:45, 17:00
    //
    // time == 03:00:01
    // appointments == 03:00, 03:15, 03:30, 03:45
    //
    // time == 04:30:00
    // appointments == 04:30, 04:45, 05:00, 05:15
    public List<LocalTime> getQuarterHourAppointments(LocalTime time) {
        return null;
    }


    /** BONUS practice after this line **/

    // THE GODMOTHER
    // ========================
    // Complete the numbered tasks below.
    // Open and execute the accompanying tests to confirm your solution is correct.

    // Your Godmother gives you $10 every other Friday throughout the year.
    // Payments start on the first Friday of the year.
    // Given a date, calculate payments expected from that date until the end of the year.
    BigDecimal calculateGiftsTilEndOfYear(LocalDate date) {
        return null;
    }

    // Your Godmother is getting quirky. She adjusted her payment schedule.
    // She still pays every other Friday throughout the year, starting on the first Friday of the year.
    // But now, she pays a number of dollars equal to the day of the month.
    // Examples
    // Jan 31 == $31
    // Mar 1 == $1
    // July 12 == $12
    // Given a date, calculate payments expected from that date until the end of the year.
    BigDecimal calculateQuirkyGiftsTilEndOfYear(LocalDate date) {
        return null;
    }
}
