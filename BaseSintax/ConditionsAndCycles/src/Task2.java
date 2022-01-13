/*
Числа от 1 до N

Программа получает на вход натуральное число N, при чем N не превосходит 1000

Программа должна вывести все числа от 1 до N через пробел, включая границы.

Если N = 1, необходимо вывести одну 1!

Sample Input 1:

1
Sample Output 1:

1
*/

import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i<a+1; i++) {
            System.out.print(Integer.toString(i) + " ");
        }
    }
}
