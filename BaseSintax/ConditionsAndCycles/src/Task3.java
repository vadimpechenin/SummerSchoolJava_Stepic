/*Кратности числа

Дано число, необходимо вывести все кратности данного числа через пробел, включая единицу и само число.

Sample Input 1:

8
Sample Output 1:

1 2 4 8*/

import java.util.Scanner;

public class Task3 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i<a+1; i++) {
            if (a % i == 0){
                System.out.print(Integer.toString(i) + " ");
            }

        }
    }
}
