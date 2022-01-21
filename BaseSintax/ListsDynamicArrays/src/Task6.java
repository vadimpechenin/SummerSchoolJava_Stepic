/*
Замостить таблицу словом
Дано слово состоящее из букв в любом регистре. Необходимо вывести на экран таблицу в соответствии с примером:

Пусть слово = "abcde", тогда таблица должна быть вот такой -

a b c d e

b 0 0 0 d

c 0 0 0 c

d 0 0 0 b

e d c b a

Где пустое пространство заполняется нулями!

Расстояние между буквами на выводе - 1 пробел

Sample Input 1:

abcde
Sample Output 1:

a b c d e
b 0 0 0 d
c 0 0 0 c
d 0 0 0 b
e d c b a
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task6 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        ArrayList<String> bufline1 = new ArrayList<>();
        bufline1.addAll(Arrays.asList(a.split("")));
        ArrayList<String> bufline2 = new ArrayList<>();
        for (int j = 0; j < bufline1.size(); j++) {
            if (j==0){
                for (String value2 : bufline1) {
                    bufline2.add(value2);
                }
            }else if (j==bufline1.size()-1){
                for (int i = 0; i < bufline1.size(); i++) {
                    bufline2.set(i, bufline1.get(i));
                }
                Collections.reverse(bufline2);
            }else {
                for (int i = 0; i < bufline1.size(); i++) {
                    if (i==0){
                        bufline2.set(i, bufline1.get(j));
                    }else if (i==bufline1.size()-1){
                        bufline2.set(i, bufline1.get(bufline1.size()-j-1));
                    }else {
                        bufline2.set(i, "0");
                    }
                }
            }
      //            for (String s : bufline2) System.out.printf("%d ", s);
            Task6.printListSpecial(bufline2);
            System.out.println();
        }


    }

    private static void printListSpecial(ArrayList<String> list) {
        for (String s : list) {
            System.out.print(s + " ");
        }
    }

}