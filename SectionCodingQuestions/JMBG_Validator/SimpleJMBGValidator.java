import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleJMBGValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // * Welcome note
        System.out.println("Welcome to JMBG validator");
        System.out.println("please enter your JMBG");

        // * assign new value to jmbg through scanner
        String jmbg = scanner.nextLine();

        // * first validation JMBG MUST have 13 digits
        if (jmbg.length() != 13) {
            System.out.println("JMBG you entered is NOT valid. JMBG must be 13 digits long.");
            System.exit(0);
        }

        System.out.println("Thank you \n");
        System.out.println("Your JMBG is " + jmbg);

        // * day variable value set in one set, the rest in one step
        String dayString = jmbg.substring(0, 2);
        int day = Integer.parseInt(dayString);

        int month = Integer.parseInt(jmbg.substring(2, 4));
        int year = Integer.parseInt(jmbg.substring(4, 7));
        int region = Integer.parseInt(jmbg.substring(7, 9));
        int sex = Integer.parseInt(jmbg.substring(9, 12));
        int control = Integer.parseInt(jmbg.substring(12));

        // * pring all variable as a control
        // System.out.println(
        // "day: " + day + "\n"
        // + "month: " + month + "\n"
        // + "year: " + year + "\n"
        // + "region: " + region + "\n"
        // + "sex: " + sex + "\n"
        // + "control: " + control + "\n");

        // * day must be 1 to 31
        if (day < 1 || day > 31) {
            System.out.println("Day part of your JMBG is not valid. ");
            System.out.println("JMBG is INVALID");
            System.exit(0);
        }
        // * only "long months" can have 31 days
        if (day > 30 && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("month " + month + " does NOT have 31 days");
            System.out.println("JMBG is INVALID");
            System.exit(0);
        }
        // * February can have only 28 or 29 days
        if (month == 2 && day > 29) {
            System.out.println("February can NOT have more then 29 days");
            System.out.println("JMBG is INVALID");
            System.exit(0);
        }

        // * February can have only 29 days if the year is leap
        if (day > 28 && month == 2 && year % 4 != 0) {
            System.out.println("February in non-leap NOT year can NOT have more than 28 days!");
            System.out.println("JMBG is INVALID");
            System.exit(0);
        }

        // * month validation
        if (month < 1 || month > 12) {
            System.out.println("mont part of JMBG is not valid");
            System.out.println("JMBG is INVALID");
            System.exit(0);
        }
        // * region validation, region should NOT be between 60 and 69 - numbers never
        // used
        if (region > 59 && region < 70) {
            System.out.println("wrong region numbers");
            System.out.println("JMBG is INVALID");
            System.exit(0);

        }

        // ! ********************************************
        // ! OPTIONAL

        ArrayList<String> monthsNames = new ArrayList<>(Arrays.asList("January", "February", "March", "April", "May",
                "Jun", "July", "August", "September", "October", "November", "December"));
        ArrayList<String> regions = new ArrayList<>(Arrays.asList("stranci", "Bosna i Hercegovina", "Crna Gora",
                "Hrvatska", "Makedonija", "Slovenija", "no region", "Centralna Srbija", "AP Vojvodina", "AP Kosmet"));
        // * ****************************************
        // * assigning region name by region number
        String regionName = "";
        if (region < 10)
            regionName = regions.get(0);
        if (region >= 10 && region < 30)
            regionName = regions.get(1);
        if (region >= 20 && region < 30)
            regionName = regions.get(2);
        if (region >= 30 && region < 40)
            regionName = regions.get(3);
        if (region >= 40 && region < 50)
            regionName = regions.get(4);
        if (region >= 50 && region < 60)
            regionName = regions.get(5);
        if (region >= 60 && region < 70)
            regionName = regions.get(6);
        if (region >= 70 && region < 80)
            regionName = regions.get(7);
        if (region >= 80 && region < 90)
            regionName = regions.get(8);
        if (region >= 90 && region < 100)
            regionName = regions.get(9);

        System.out.println(
                "day: " + day + "\n"
                        + "month: " + monthsNames.get(month - 1) + "\n"
                        + "year: " + year + "\n"
                        + "region: " + regionName + "\n"
                        + "sex: " + (sex < 500 ? "male" : "female") + "\n"
                        + "control: " + control + "\n");

        // ! ********************************************

        System.out.println("JMBG is valid!");
        // * Zatvaramo scaner
        scanner.close();
    }
}
