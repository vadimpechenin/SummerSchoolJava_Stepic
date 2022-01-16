/*
Нарушенный порядок
Дано целое число N, не превосходящее 1000. Далее следуют N целых чисел.

Порядок нарушен тогда, когда среди двух соседних элементов массива левый элемент больше правого.

Программа должна считать количество нарушенных порядков в массиве и выводить это количество на экран.

Sample Input 1:

5
2 4 1 9 7
Sample Output 1:

2
*/

import java.util.Scanner;

public class Task5 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n-1; i++){

            if (arr[i] > arr[i+1]){
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}