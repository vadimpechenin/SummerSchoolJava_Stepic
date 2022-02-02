/*
Вводятся два числа с одинарной точностью.
Вывести результат их деления с точностью до 2 знака.

В Си это выглядело бы так - printf("%0.2f", val)

Sample Input:

1 2
Sample Output:

0.50
*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        double a = k.nextDouble();
        double b = k.nextDouble();
        double c = a/b;
        System.out.printf("%.2f", c);
    }
}
