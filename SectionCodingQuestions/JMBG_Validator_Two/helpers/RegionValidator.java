package helpers;

public final class RegionValidator {
    public static boolean validate(int region) {
        if (region > 59 && region < 70) {
            System.out.println("Region number canot be between [60, 69]");
            return false;
        }
        return true;
    }
}

// *60-69 – (nije korišćeno iz neobjašnjenih razloga)
