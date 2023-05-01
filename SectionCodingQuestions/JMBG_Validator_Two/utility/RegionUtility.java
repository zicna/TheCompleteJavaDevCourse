package utility;

import enums.Regions;

public final class RegionUtility {
    public static Enum getRegion(int region) {
        if (region < 10)
            return Regions.FOREIGNERS;
        if (region < 20)
            return Regions.BiH;
        if (region < 30)
            return Regions.CG;
        if (region < 40)
            return Regions.HR;
        if (region < 50)
            return Regions.MK;
        if (region < 60)
            return Regions.SLO;
        if (region < 80)
            return Regions.SRB;
        if (region < 90)
            return Regions.APVOJVODINA;
        return Regions.APKOSMET;

    }

}
