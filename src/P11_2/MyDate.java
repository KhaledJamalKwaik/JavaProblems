package P11_2;

import java.util.GregorianCalendar;

public class MyDate {

    private int year;
    private int month;
    private int day;

    // A no-arg constructor that creates a MyDate object for the current date
    public MyDate() {
    }

    /* A constructor that constructs a MyDate object with a specified
    elapsed time since midnight, January 1, 1970, in milliseconds. */
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // A constructor that constructs a MyDate object with the specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // A method that sets a new date for the object using the elapsed time
    public void setDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();

        cal.setTimeInMillis(elapsedTime);
        day = cal.get(cal.DAY_OF_MONTH);
        month = cal.get(cal.MONTH);
        year = cal.get(cal.YEAR);
    }

    @Override
    public String toString() {
        return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
    }

}