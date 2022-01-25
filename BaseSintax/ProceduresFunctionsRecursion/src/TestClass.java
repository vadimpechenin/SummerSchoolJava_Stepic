/*
Процедуры, функции и рекурсия
*/


import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args){
        int responce = TestClass.min(5,1,7);
//        TestClass.stringWork(); // Начало работы со String
//        TestClass.stringWorkAndBuilder(); // начало работы соStringBuilder
//        TestClass.splitForString(); // Метод split для строки
    System.out.println(responce);
    }

    static int min(int a, int b, int c){
        int n = a < b? a:b;

        return n < c ? n : c;
    }

}
