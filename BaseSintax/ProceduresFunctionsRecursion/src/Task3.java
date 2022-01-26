/*
Сортировка
Реализуйте функцию сортировки массива по возрастанию.

Sample Input 1:

5
5 1 2 4 3
Sample Output 1:

1 2 3 4 5
 */


public class Task3 {

    static void sort(int [] a){
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i:a) {
            System.out.print(i + " ");
        }
    }
}