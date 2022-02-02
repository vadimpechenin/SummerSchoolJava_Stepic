/*
Перевод числа из десятичной системы счисления в двоичную
Вводится одно целое число в десятичной системе счисления, необходимо вывести данное число в двоичной системе счисления.

Sample Input 1:

5
Sample Output 1:

101
*/

import java.util.Scanner;

public class Task6 implements AbstrctTask {

    public void calculate() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int residue;
        String s="";
        while (a > 0){
            residue = a % 2;
            s += Integer.toString(residue);
            a/=2;
        }
        int stringLength = s.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = s.charAt(i) + result;
        }
        System.out.println(result);
    }
}
