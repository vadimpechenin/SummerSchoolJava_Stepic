/*
Счетчик запусков 2
Существует функция:

static int foo(int n){
return n < 2 ? 1 : foo(n-1) + foo(n-2);
}
Напишите программу, которая в зависимости от переданного параметра N будет считать количество запусков данной функции на стеке.

Необходимо написать всю программу целиком, включая функцию.

На вход программа получает одно натуральное число N  и должна выдать ответ - одно натуральное число.

N не превосходит 30.

Sample Input 1:

5
Sample Output 1:

15
*/

import java.util.Scanner;

public class Task2 {
    static int counter;
    static void count(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        foo(n);
        System.out.println(counter);
    }

    static int foo(int n){
        counter++;
        return n < 2 ? 1 : foo(n-1) + foo(n-2);
    }

}