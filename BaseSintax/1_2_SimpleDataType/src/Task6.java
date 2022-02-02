/*
Дано N пицц. Пиццу резать нельзя! Если распределить пиццы поровну среди М друзей, то по скольку пицц получит каждый друг и сколько пицц окажутся не распределенными?

Программа получает на вход два натуральных числа N и M, при чем N > M.

N не превосходит 10^9

Программа должна вывести два числа - сколько пицц достанется каждому другу и сколько пицц останется не распределенными через пробел.

Sample Input 1:

30 5
Sample Output 1:

6 0

 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        int c = a / b;
        int d = a % b;
        System.out.printf("%d %d", c, d);
    }
}
