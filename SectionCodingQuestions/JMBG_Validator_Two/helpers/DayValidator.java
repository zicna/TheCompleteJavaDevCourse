package helpers;

import java.util.ArrayList;
import java.util.Arrays;

public final class DayValidator {

    public static ArrayList<Integer> longMonths = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));

    public static boolean validate(int year, int month, int day) {
        if (day < 1 || day > 31)
            return false;
        if (day == 31 && !longMonths.contains(day))
            return false;
        if (month == 2 && !YearValidator.leapYear(year) && day > 28)
            return false;
        return true;
    }

}
