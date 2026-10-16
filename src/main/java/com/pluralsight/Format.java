package com.pluralsight;

public class Format {

    public static void main(String[] args) {
        String formattedName = formatName("Sama", "Durani");
        System.out.println(formattedName);
    }

    public static String formatName(String first, String last) {
        String fullName = last + ", " + first;
        return fullName;
    }

}
