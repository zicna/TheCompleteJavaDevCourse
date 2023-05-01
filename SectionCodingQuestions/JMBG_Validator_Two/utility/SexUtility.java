package utility;

import enums.Sex;

public final class SexUtility {
    public static Enum getSex(int sex) {
        if (sex < 500)
            return Sex.MALE;
        return Sex.FEMALE;
    }
}
