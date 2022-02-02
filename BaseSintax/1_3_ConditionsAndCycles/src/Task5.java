/*
Минимум бесконечной последовательности
Дана некоторая последовательность целых чисел. Необходимо вывести минимум этой последовательности.

Sample Input 1:

1 2 3 4 5 6 7 8 9 10 11 12 13 14
Sample Output 1:

1
*/

import java.util.Scanner;

public class Task5 implements AbstrctTask {

    public void calculate() {
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner("5 5 5 5 5 5 2 3 6 8 7 4 5 6 9 8 5 1 2 5 564 564 564 654 564 564 684 56 54 864 864 8 486");
        int a;
        int min = Integer.MAX_VALUE;
        while (in.hasNext()) {
            a = in.nextInt();
            if (a < min) {
                min = a;

                //
            }

        }
        System.out.println(min);
    }
}
