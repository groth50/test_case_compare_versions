package com.company;

/**
 * Utility class to compare two versions of the program
 */
public class VersionCompare {
    /** Parts of number, to the condition of the problem */
    private static final int PARTS = 4;

    /** Compares two versions of the program */
    public static int compare(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int comp = 0;
        for (int i = 0; i < PARTS; i++) {
            comp = compareString(s1[i], s2[i]);
            if (comp != 0) break;
        }
        return comp;
    }

    /** Compares each part of four from versions */
    private static int compareString(String s1, String s2) {
        int firstVersion = Integer.parseInt(s1);
        int secondVersion = Integer.parseInt(s2);
        return firstVersion < secondVersion ? -1 : firstVersion > secondVersion ? 1 : 0;
    }
}
