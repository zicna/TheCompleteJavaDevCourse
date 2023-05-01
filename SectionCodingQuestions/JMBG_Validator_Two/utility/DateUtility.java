package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import enums.Months;

public final class DateUtility {
    public static String dayOfWeek(int day, int month, int year) {
        Date date = null;
        try {

            String dateString = String.format("%d-%d-%d", year, month, day);
            date = new SimpleDateFormat("YYYY-MM-DD").parse(dateString);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
    }

    public static Enum getMonthName(int month) {
        ArrayList<Enum> monthNames = new ArrayList<>(
                Arrays.asList(Months.JANUARY, Months.FEBRUARY, Months.MARCH, Months.APRIL, Months.MAY, Months.JUN, Months.JULY,
                        Months.AUGUST, Months.SEPTEMBER, Months.OCTOBER, Months.NOVEMBER, Months.DECEMBER));
        return monthNames.get(month-1);

    }

}
