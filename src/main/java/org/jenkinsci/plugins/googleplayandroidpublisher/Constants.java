package org.jenkinsci.plugins.googleplayandroidpublisher;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Constants {

    /** Deobfuscation file type: proguard */
    public static final String DEOBFUSCATION_FILE_TYPE_PROGUARD = "proguard";

    /** File name pattern which expansion files must match. */
    static final Pattern OBB_FILE_REGEX =
            Pattern.compile("^(main|patch)\\.([0-9]+)\\.([._a-z0-9]+)\\.obb$", Pattern.CASE_INSENSITIVE);

    /** Expansion file type: main */
    static final String OBB_FILE_TYPE_MAIN = "main";

    /** Expansion file type: patch */
    static final String OBB_FILE_TYPE_PATCH = "patch";

    /** Formatter that only displays decimal places when necessary. */
    static final DecimalFormat PERCENTAGE_FORMATTER = new DecimalFormat("#.#");

    /** Allowed percentage values when doing a staged rollout to production. */
    static final double[] ROLLOUT_PERCENTAGES = { 0.5, 1, 5, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    static final double DEFAULT_PERCENTAGE = 100;

}
