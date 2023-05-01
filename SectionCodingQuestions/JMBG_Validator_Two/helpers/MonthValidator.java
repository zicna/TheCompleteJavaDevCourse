package helpers;

public final class MonthValidator {
    public static boolean validate(int month){
        if(month < 1 || month > 12) return false;
        return true;
    }
}
