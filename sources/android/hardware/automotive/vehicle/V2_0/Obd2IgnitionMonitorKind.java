package android.hardware.automotive.vehicle.V2_0;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class Obd2IgnitionMonitorKind {
    public static final int COMPRESSION = 1;
    public static final int SPARK = 0;

    public static final String toString(int o) {
        if (o == 0) {
            return "SPARK";
        }
        if (o == 1) {
            return "COMPRESSION";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        ArrayList<String> list = new ArrayList<>();
        int flipped = 0;
        list.add("SPARK");
        if ((o & 1) == 1) {
            list.add("COMPRESSION");
            flipped = 0 | 1;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString((~flipped) & o));
        }
        return String.join(" | ", list);
    }
}
