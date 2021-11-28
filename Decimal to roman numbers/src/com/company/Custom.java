package com.company;

import java.util.Scanner;

public class Custom {

    String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};    // a posição "" é no caso do dígito ser 0
    String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] thousands = {"", "M", "MM", "MMM"};

    public String convertToRoman() {

        System.out.println("write a number between 1 and 3999, please! I'm begging you!!");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number < 1 || number > 3999) {
            return "This is an invalid number";
        }

        return thousands[number / 1000] +
                hundreds[(number % 1000) / 100] +
                tens[(number % 100) / 10] +
                units[number % 10];
    }
}


// the  first number = 1
// the last number  is  3999






