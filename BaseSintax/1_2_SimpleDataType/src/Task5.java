/*
Вычитание
Сколько раз из первого числа можно вычесть второе число?

Sample Input:

5 1
Sample Output:

5
*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        int c = a / b;
        System.out.println(c);
    }
}
