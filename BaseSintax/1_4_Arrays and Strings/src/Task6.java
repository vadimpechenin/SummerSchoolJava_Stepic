/*
                Слова от a до h
Вводится одна строка целиком. Необходимо вывести те слова данной строки, которые начинаются с буквы из интервала от a до h.

Словом считается совокупность букв и символов от пробела до пробела. Слова могут быть как в верхнем, так и нижнем регистре.

Выводить слова необходимо каждый раз с новой строки.

Sample Input 1:

I'm in my penthouse half naked I cooked this meal for you naked
Sample Output 1:

half
cooked
for
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task6 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String [] strings = s.split(" "); // делит строку на много строк по регулярному выражению
        char letter1;
        for (String i : strings){
            letter1= i.toLowerCase().charAt(0); // выделяем начальную букву слова
            if (letter1>='a' && letter1<='h') //сравниваем ее с диапазоном
            System.out.println (i); // выводим слово, если оно начинается на букву из диапазона
        }
    }
}