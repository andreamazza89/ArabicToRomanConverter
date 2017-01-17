package com.andreamazzarella.roman_numerals_gui;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToArabicConverterTest {

    @Test
    public void convertsZero() {
        int result = RomanToArabicConverter.convert("");
        assertEquals(0, result);
    }

    @Test
    public void convertsOne() {
        int result = RomanToArabicConverter.convert("I");
        assertEquals(1, result);
    }

    @Test
    public void convertsTwo() {
        int result = RomanToArabicConverter.convert("II");
        assertEquals(2, result);
    }

    @Test
    public void convertsThree() {
        int result = RomanToArabicConverter.convert("III");
        assertEquals(3, result);
    }

    @Test
    public void convertsFour() {
        int result = RomanToArabicConverter.convert("IV");
        assertEquals(4, result);
    }

    @Test
    public void convertsFive() {
        int result = RomanToArabicConverter.convert("V");
        assertEquals(5, result);
    }

    @Test
    public void convertsSix() {
        int result = RomanToArabicConverter.convert("VI");
        assertEquals(6, result);
    }

    @Test
    public void convertsNine() {
        int result = RomanToArabicConverter.convert("IX");
        assertEquals(9, result);
    }

    @Test
    public void convertsTen() {
        int result = RomanToArabicConverter.convert("X");
        assertEquals(10, result);
    }

    @Test
    public void convertsFourteen() {
        int result = RomanToArabicConverter.convert("XIV");
        assertEquals(14, result);
    }

    @Test
    public void convertsForty() {
        int result = RomanToArabicConverter.convert("XL");
        assertEquals(40, result);
    }

    @Test
    public void convertsFifty() {
        int result = RomanToArabicConverter.convert("L");
        assertEquals(50, result);
    }

    @Test
    public void convertsNinenty() {
        int result = RomanToArabicConverter.convert("XC");
        assertEquals(90, result);
    }

    @Test
    public void convertsHundred() {
        int result = RomanToArabicConverter.convert("C");
        assertEquals(100, result);
    }

    @Test
    public void convertsFourHundred() {
        int result = RomanToArabicConverter.convert("CD");
        assertEquals(400, result);
    }

    @Test
    public void convertsFiveHundred() {
        int result = RomanToArabicConverter.convert("D");
        assertEquals(500, result);
    }

    @Test
    public void convertsNineundred() {
        int result = RomanToArabicConverter.convert("CM");
        assertEquals(900, result);
    }

    @Test
    public void convertsThousand() {
        int result = RomanToArabicConverter.convert("M");
        assertEquals(1000, result);
    }

    @Test
    public void convertsComplexNumber() {
        int result = RomanToArabicConverter.convert("MMCMLXIV");
        assertEquals(2964, result);
    }

}