/*
Сложный палиндром
Палиндро́м (от др.-греч. πάλιν — «назад, снова» и др.-греч. δρóμος — «бег, движение»), пе́ревертень[1] — число,
буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.

Дана строка. Из данной строки необходимо сделать палиндром следующим образом:

Необходимо сделать из данной строки палиндром минимально возможной длины.

Например: abcb -> abcba, aaa -> aaa, a -> a, abcded -> abcdedcba



Sample Input 1:

abcb
Sample Output 1:

abcba
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task7 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().trim(); // Уберет лишние пробелы
        StringBuffer sb = new StringBuffer(s);
        int i=0;
        while (!(sb.toString().equals(sb.reverse().toString()))){
            sb.reverse();
            if (i==0){
                sb.append(sb.charAt(i));
            }else{
                sb.insert(sb.length()-i, sb.charAt(i));
            }

            i++;
        }

        System.out.println(sb.toString());
    }

}