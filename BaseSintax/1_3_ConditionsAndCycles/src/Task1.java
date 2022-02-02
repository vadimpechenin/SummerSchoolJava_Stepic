/*
Скобки
Вводится число N, N не превосходит 10.000.

Необходимо вывести N открытых квадратных скобок [, после чего столько же закрытых.

Sample Input 1:

5
Sample Output 1:

[[[[[]]]]]

 */

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i<a; i++) {
            System.out.print("[");
        }
        for (int i = 0; i<a; i++) {
            System.out.print("]");
        }
    }

}
