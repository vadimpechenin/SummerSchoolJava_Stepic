/*
Палиндром
﻿Палиндромом называется такая строка, которая читается в обе стороны одинаково. Пробелы, регистр и знаки препинания не влияют на палиндромность.

Например А роза,,,,упала На ЛАПУ А з о р а - палиндром,   а роза упала на лапу азору - не палиндром

Sample Input 1:

aaaaaAAa
Sample Output 1:

true
 */


public class Task5 {

    static boolean isPalindrome(String s){
        StringBuilder withLetterOnly = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            if (Character.isLetter(s.charAt(i))) {
                withLetterOnly.append(s.charAt(i));
            }
        }
        String lowercase = withLetterOnly.toString().toLowerCase();
        String lowercase1 = withLetterOnly.reverse().toString().toLowerCase();
        if (lowercase.equals(lowercase1)){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }


    }
}