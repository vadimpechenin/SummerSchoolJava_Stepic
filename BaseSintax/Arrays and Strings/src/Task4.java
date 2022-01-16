/*
Наибольший возрастающий срез массива
Срезом будем считать последовательность подряд идущих элементов массива, где каждый следующий элемент больше предыдущего.

Для последовательности 1 2 3 1 2 5 7 1 2 1 2, существуют возрастающие срезы: 1 2 3, 1 2 5 7, 1 2, 1 2 вывести нужно срез 1 2 5 7

Для последовательности 1 2 3 1 2 5 1 2 7, существуют срезы 1 2 3, 1 2 5, 1 2 7 вывести нужно все срезы, так как они равной длины

Формат входных данных:

Дано натуральное число N, далее следуют N целых чисел.

Формат выходных данных:

В первой строке выведите длину максимального среза

Далее выведите содержание среза/срезов, разделяя элементы одним пробелом, каждый срез с новой строки

Sample Input 1:

7
2 1 2 3 1 5 7
Sample Output 1:

3
1 2 3
1 5 7
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task4 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int a = 0;
        int k = 0;
        //срезы
        int [][] slices = new int[n][n];
        //Массив длин
        int [] lenght = new int[n];
        slices[a][k] = arr[0];
        k += 1;
        for(int i = 1; i < n; i++){

            if (arr[i] > arr[i-1]){
                slices[a][k] = arr[i];
                k += 1;
                if (i==n-1){
                    lenght[a] = k;
                }
            }
            else{
                lenght[a] = k;
                k = 0;
                a += 1;
                slices[a][k] = arr[i];
                k += 1;
                if (i==n-1){
                    lenght[a] = k;
                }
            }

            }
        a+=1;
        //Вывод результатов. Поиск максимума
        int max = lenght[0];
        int maxIndex = 0;
        for (int index = 0; index < a; index++) {
            if (lenght[index] > max) {
                max = lenght[index];
                maxIndex = index;
            }
        }
        System.out.print(lenght[maxIndex]);
        System.out.println();
        for (int j=0; j<max; j++){
            System.out.print(slices[maxIndex][j] + " ");
        }

        //System.out.print(Arrays.toString(slices[maxIndex]));
        //Остальные срезы
        lenght[maxIndex] = 0;
        for (int index = 0; index < a; index++) {
            if (lenght[index] == max) {
                System.out.println();
                for (int j=0; j<max; j++){
                    System.out.print(slices[index][j] + " ");
                }

            }
        }
    }
}