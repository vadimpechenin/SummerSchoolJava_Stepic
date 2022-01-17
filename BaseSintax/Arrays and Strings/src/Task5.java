/*
Ввод строк
Программа получает на вход строку из 2 слов, разделенных пробелом.

Необходимо вывести слово, меньшее в лексикографическом порядке.

Sample Input 1:

mother brother
Sample Output 1:

brother
*/

import java.util.Scanner;

public class Task5 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        String s1 = in.next(); // данные до пробела
        String s2 = in.next();

        int index = s1.compareTo(s2);
        if (index >= 0){
            System.out.println(s2);
        }else{
            System.out.println(s1);
        }
    }
}