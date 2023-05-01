import java.util.Scanner;

import helpers.DayValidator;
import helpers.MonthValidator;
import helpers.RegionValidator;
import helpers.YearValidator;
import utility.DateUtility;
import utility.RegionUtility;
import utility.SexUtility;

public class JMBGValidator {
    public static void main(String[] args) {
        boolean validJMBG = false;
        String jmbg = "";
        Scanner scanner = new Scanner(System.in);

        while (!validJMBG) {
            System.out.println("Please enter your JMBG. Thank you!\n");
            jmbg = scanner.nextLine();

            if (jmbg.length() == 14) {

                int day = Integer.parseInt(jmbg.substring(0, 2));
                int month = Integer.parseInt(jmbg.substring(2, 4));
                int year = Integer.parseInt(jmbg.substring(4, 8));
                int region = Integer.parseInt(jmbg.substring(8, 10));
                int sex = Integer.parseInt(jmbg.substring(10, 13));
                int controlNum = Integer.parseInt(jmbg.substring(13));

                if (YearValidator.validate(year)) {
                    if (MonthValidator.validate(month)) {
                        if (DayValidator.validate(year, month, day)) {
                            if (RegionValidator.validate(region)) {
                                validJMBG = true;
                                System.out.println("thank you your JMBG is \t\t\t" + jmbg + "\n");

                                System.out.println(
                                        "date of birth is: \t\t\t" + month + "/" + day + "/" + year + "(mm/DD/YYYY)"
                                                + "\n"
                                                + "day of the week: \t\t\t" + DateUtility.dayOfWeek(day, month, year) + "\n"
                                                + "month: \t\t\t\t\t" + DateUtility.getMonthName(month) + "\n"
                                                + "region: \t\t\t\t" + RegionUtility.getRegion(region) + "\n"
                                                + "sex: \t\t\t\t\t" + SexUtility.getSex(sex) + "\n"
                                                + "control: \t\t\t\t" + controlNum + "\n");
                                System.exit(0);

                            }
                        }
                    }
                }

            }

            System.out.println("Entered JMBG is NOT valid. Please try again. Thank you.");
        }
        scanner.close();
    }
}