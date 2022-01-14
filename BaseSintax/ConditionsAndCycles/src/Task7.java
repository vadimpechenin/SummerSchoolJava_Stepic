/*
Сумма членов арифметической прогрессии
Программа получает на вход число N, необходимо вывести сумму всех чисел от 1 до N.

N не превосходит 10^910
9
*/

import java.util.Scanner;

public class Task7 implements AbstrctTask {

    public void calculate() {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long sum =(long)(((double)a/2)*(a+1));
        /*long sum = 0;
        for (long i = 1; i < a; i++) {
            sum += i;
        }*/
        System.out.println(sum);
    }
}
