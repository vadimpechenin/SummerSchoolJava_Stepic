/*
              Сплит
Дана строка вида термин - определение1, определение2, определение3, .....

Необходимо вывести ответ в формате:

Термин:

-определение1

-определение2

-определение3

Sample Input 1:

banana - a, b, c, d, e
Sample Output 1:

banana:
-a
-b
-c
-d
-e
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task7 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String [] strings = s.split(" - "); // делит строку на много строк по регулярному выражению
        System.out.println (strings[0] + ":");
        String [] strings1 = strings[1].split(", ");

        for (String i : strings1){
                System.out.println ("-" + i); // выводим слово, если оно начинается на букву из диапазона
        }
    }
}