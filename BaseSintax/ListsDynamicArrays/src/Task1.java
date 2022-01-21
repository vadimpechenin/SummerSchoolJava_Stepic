/*
Легкий палиндром
Палиндро́м (от др.-греч. πάλιν — «назад, снова» и др.-греч. δρóμος — «бег, движение»), пе́ревертень[1] — число, буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.

Дана строка. Из данной строки необходимо сделать палиндром следующим образом:

Берем исходную строку и к ней добавляем ее же, но в обратном порядке.

Например дано abcde, тогда ответ abcdeedcba

Sample Input 1:

abcde
Sample Output 1:

abcdeedcba
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task1 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strings = s.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));
        Task1.printListSpecial(list);
        Collections.reverse(list);
        Task1.printListSpecial(list);
    }

    private static void printListSpecial(ArrayList<String> list) {
        for (String s : list) {
            System.out.print(s);
        }
    }

}