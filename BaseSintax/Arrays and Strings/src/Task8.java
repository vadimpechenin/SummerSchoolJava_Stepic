/*
Вычитание строк
Вычитанием строк назовем операцию при которой все буквы вычитаемого вычеркиваются из уменьшаемого,
а если в уменьшаемом таких букв не было они дописываются в конец уменьшаемого в порядке обхода вычитаемого от 0 индекса к последнему.

Например: abcdef - abcfonpq = deonpq или abcdef - fedcloj = abloj или abcdef - fealobjm = cdlojm

Sample Input 1:

abcdef abcfonpq
Sample Output 1:

deonpq
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task8 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strings = s.split(" ");// массив из двух элементов
//        String[] s2 = strings[0].split("");// первый массив из букв
//        String[] s3 = strings[1].split("");//второй массив из букв
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < strings[1].length();) {
            char c = strings[1].charAt(i);
            if(strings[0].indexOf(c) != -1) {
                strings[0] = strings[0].replaceFirst(""+c,"");
                strings[1] = strings[1].replaceFirst(""+c,"");
            } else {
                postfix.append(c);
                i++;
            }
        }
        strings[0] += postfix;
        System.out.println(strings[0]);
    }
}