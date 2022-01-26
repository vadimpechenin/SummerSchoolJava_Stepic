/*
Процедуры, функции и рекурсия
*/


import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    static int c = 0;

    public static void main(String[] args){
//        int responce = TestClass.min(5,1,7);
        /*int [] array = new int[]{17, 34, 35, 11, 35, 15, 13, 52, 36, 12, 6, 2457, 22, 22 };
        int responce = TestClass.minArray(array);*/

        int responce = TestClass.rec(7);
        System.out.println(c);
//        TestClass.stringWorkAndBuilder(); // начало работы соStringBuilder
//        TestClass.splitForString(); // Метод split для строки
        System.out.println(responce);
    }

    static int min(int a, int b, int c){
        int n = a < b? a:b;

        return n < c ? n : c;
    }
    static int minArray(int [] a){
//        Функция нахождения минимума в массиве
        int min = a[0];
        for (int i : a) {
            if (i < min)
                min = i;
        }
        return min;
    }
    static int rec(int n){
//        Рекурсивная фукнция. Числа Фибоначчи
        System.out.print("*");
        c++;
        return n < 2 ? 1 : rec(n-1) + rec(n-2);
    }

}
