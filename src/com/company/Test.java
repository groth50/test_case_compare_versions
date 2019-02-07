package com.company;

/**
 * Test class for VersionCompare
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(VersionCompare.compare("8.1.13.41", "8.1.009.1254"));
        System.out.println(VersionCompare.compare("8.1.13.41", "8.1.013.41"));
        System.out.println(VersionCompare.compare("8.1.13.41", "8.1.13.411"));
        System.out.println(VersionCompare.compare("8.1.0103.41", "8.1.103.41"));
        System.out.println(VersionCompare.compare("8.1.0103.41", "8.1.1030.41"));
    }
}
