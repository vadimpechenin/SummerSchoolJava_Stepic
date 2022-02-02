/*
Правильное округление.
Знаменатель дроби всегда равен 3. Все числа кроме кратных 3 образуют бесконечные периодические дроби.
Вам необходимо написать программу, которая будет округлять в большую сторону результат деления числа N на 3.

На вход программа получает натуральное число N, при чем N не превосходит 10^{18}10
18


Вывести результат деления на 3, округленный в большую сторону.

Например 1,1112 = 2

Sample Input 1:

1
Sample Output 1:

1
*/

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        long a = k.nextLong();
        double d = a / 3.0;
        System.out.println((long)Math.ceil(d));
    }
}
