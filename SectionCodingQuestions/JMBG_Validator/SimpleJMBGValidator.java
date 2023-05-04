import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SimpleJMBGValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean validJMBG = true;

        // * Welcome note
        System.out.println("Welcome to JMBG validator");
        System.out.println("please enter your JMBG");

        // * assign new value to jmbg through scanner
        String jmbg = scanner.nextLine();

        // * first validation JMBG MUST have 13 digits
        if (jmbg.length() != 13)
            validJMBG = false;

        System.out.println("Thank you \n");
        System.out.println("Your JMBG is " + jmbg);

        // * day variable value set in one set, the rest in one step
        int day = Integer.parseInt(jmbg.substring(0, 2));
        int month = Integer.parseInt(jmbg.substring(2, 4));
        int year = Integer.parseInt(jmbg.substring(4, 7));
        int region = Integer.parseInt(jmbg.substring(7, 9));
        int sex = Integer.parseInt(jmbg.substring(9, 12));
        int control = Integer.parseInt(jmbg.substring(12));

        // * day must be 1 to 31
        if (day < 1 || day > 31) {
            validJMBG = false;
        }
        // * only "long months" can have 31 days
        if (day > 30 && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)) {
            validJMBG = false;
        }
        // * February can have only 28 or 29 days
        if (month == 2 && day > 29) {
            validJMBG = false;
        }

        // * February can have only 29 days if the year is leap
        if (day > 28 && month == 2 && year % 4 != 0) {
            validJMBG = false;
        }

        // * month validation
        if (month < 1 || month > 12) {
            validJMBG = false;
        }
        // * region validation, region should NOT be between 60 and 69 - numbers never
        // used
        if (region > 59 && region < 70) {
            validJMBG = false;
        }

        // * control number validation
        Map<String, Integer> singleDigit = new HashMap<>();
        List<String> letters = new ArrayList<>(
                Arrays.asList("A", "B", "V", "G", "D", "Q", "E", "W", "Z", "I", "J", "K"));

        for (int i = 0; i < jmbg.length(); i++) {
            singleDigit.put(letters.get(i), Integer.parseInt(jmbg.substring(i, i + 1)));
        }

        int L;
        int temp = (11 - ((7 * (singleDigit.get("A") + singleDigit.get("E"))
                + 6 * (singleDigit.get("B") + singleDigit.get("W"))
                + 5 * (singleDigit.get("V") + singleDigit.get("Z") + 4 * (singleDigit.get("G") + singleDigit.get("I"))
                        + 3 * (singleDigit.get("D") + singleDigit.get("J"))
                        + 2 * (singleDigit.get("Q") + singleDigit.get("K"))) % 11)));

        if (temp > 9) {
            L = 0;
        } else {
            L = temp;
        }

        if (control != L) {
            validJMBG = false;
        }
        // ! Final validation
        if (!validJMBG) {
            System.out.println("JMBG is NOT valid!");
            System.exit(0);
        } else {
            System.out.println("JMBG is VALID!");

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

        // * Zatvaramo scaner
        scanner.close();
    }
}
