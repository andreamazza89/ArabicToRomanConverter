package com.andreamazzarella.roman_numerals_gui;

import java.util.HashMap;

public class RomanToArabicConverter {

    public static int convert(String roman) {
        int result = 0;
        for (String token : tokens ) {
            result += RomanToArabicConverter.countToken(token, roman);
            roman = roman.replaceAll(token, "");
        }
        return result;
    }

    private static HashMap<String, Integer> romanToArabicMap = new HashMap<>();

    private static final String[] tokens = new String[] {"CM", "M", "CD", "D", "XC", "C", "XL", "L", "IX", "X", "IV", "V", "I"};

    private static void lazyPopulateConversionMap() {
        if (romanToArabicMap.isEmpty()) {
            romanToArabicMap.put("I", 1);
            romanToArabicMap.put("IV", 4);
            romanToArabicMap.put("V", 5);
            romanToArabicMap.put("IX", 9);
            romanToArabicMap.put("X", 10);
            romanToArabicMap.put("XL", 40);
            romanToArabicMap.put("L", 50);
            romanToArabicMap.put("XC", 90);
            romanToArabicMap.put("C", 100);
            romanToArabicMap.put("CD", 400);
            romanToArabicMap.put("D", 500);
            romanToArabicMap.put("CM", 900);
            romanToArabicMap.put("M", 1000);
        }
    }

    private static int countToken(String token, String roman) {
        int tokenTotal = 0;
        while (true) {
            if (roman.contains(token)) {
                tokenTotal += RomanToArabicConverter.romanToArabic(token);
                roman = roman.replaceFirst(token, "");
            } else {
                break;
            }
        }
        return tokenTotal;
    }

    private static int romanToArabic(String roman) {
        RomanToArabicConverter.lazyPopulateConversionMap();
        return romanToArabicMap.get(roman);
    }
}
