/*
Процедуры, функции и рекурсия
В случае рекурсии может быть переполнение стэка - stackoverflow
заполнение идет сверху-вниз, слева-направо
*/


import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    static int c = 0;

    public static void main(String[] args){
        //1 Просто функция
//        int responce = TestClass.min(5,1,7);
        // 2 На входе массив
        /*int [] array = new int[]{17, 34, 35, 11, 35, 15, 13, 52, 36, 12, 6, 2457, 22, 22 };
        int responce = TestClass.minArray(array);*/

        // 3 Рекурсия с числами Фибоначчи
        /*int responce = TestClass.rec(7);
        System.out.println(c);*/
        //общий вывод в консоль
//        System.out.println(responce);
        //4 Работа рекурсии с вводом из консоли

        TestClass.f();

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

    static void f(){
//        2 3 1 2 4 5 0 - вводить с новой строки через enter
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) return;
        f();
        System.out.println(n);

    }

}
