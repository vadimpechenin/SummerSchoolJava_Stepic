/*
Счетчик запусков
Доработайте программу таким образом, чтобы она работала корректно.

Переменная counter должна считать количество запусков функции, которая скрыта.

Суть задачи - корректно создать переменную counter.
*/

import java.util.Scanner;

public class Task1{
    static int counter;
    static void count(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        foo(n);
        System.out.println(counter);
    }

    static void foo(int n){
        for(int i = 0; i < n; i++) counter++;;
    }

}