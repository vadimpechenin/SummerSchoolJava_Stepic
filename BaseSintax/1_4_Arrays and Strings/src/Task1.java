/*
Обработка данных массива
Дано целое число N, не превосходящее 1000. Далее следуют N целых чисел.

Среди всех чисел массива, необходимо вывести на экран двузначные, четные и положительные через пробел.

А если таких чисел в массиве нет, необходимо вывести -1.

Sample Input 1:

5
100 96 -2 96 1
Sample Output 1:

96 96
*/

import java.util.Scanner;

public class Task1 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }

        boolean flag = false;
        for(int i = 0; i < n; i++){
            if (arr[i] %2 == 0 && arr[i]>9 && arr[i]<100){
                System.out.print(arr[i]+ " ");
                flag = true;
            }
        }
        if (!flag){
            System.out.print("-1");
        }
    }
}