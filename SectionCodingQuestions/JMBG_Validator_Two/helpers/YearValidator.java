package helpers;

import java.time.Year;

public final class YearValidator {
    public static boolean validate(int year) {
        int currentYear = Year.now().getValue();
        return (year > currentYear) ? false : true;
    }

    public static boolean leapYear(int year) {
        return year % 4 == 0 ? true : false;
    }
}
