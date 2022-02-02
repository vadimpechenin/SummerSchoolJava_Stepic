/*
Обработка списка
Существует ряд методов для класса ArrayList: add(n) - вставка в конец, add(i, n) - вставка по индексу, remove(i) - удаление по индексу, set(i, n) - изменение значения по индексу.

На вход программе подаются строки, первая из которых create N - создает исходный список с числами от 1 до N включительно. Сигнатуры остальных команд:

add 5 - вставляет 5 в конец списка

add 5 6 - вставляет 6 по индексу 5

remove 7 - удаляет 7 элемент списка

set 7 3 - заменяет значение седьмого элемента списка на 3

Команда printList - сигнализирует о конце ввода данных и должна вывести на экран список, полученный после всех манипуляций

Sample Input 1:

create 30
add 12
add 17
add 3 15
remove 4
set 12 34
printList
Sample Output 1:

1 2 3 15 5 6 7 8 9 10 11 12 34 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 12 17 */

import com.sun.deploy.net.MessageHeader;

import java.util.*;

public class Task2 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] str_buf = str.split(" ");
            if (str_buf[0].equals("create")) {
                int number = Integer.parseInt(str_buf[1]);
                for (int i = 0; i < number; i++){
                    list.add(i+1);
                }
            } else if (str_buf[0].equals("add")) {
                if (str_buf.length>2){
                    int index= Integer.parseInt(str_buf[1]);
                    int number = Integer.parseInt(str_buf[2]);
                    list.add(index,number);
                }else{
                    int number = Integer.parseInt(str_buf[1]);
                    list.add(number);
                }
            } else if (str_buf[0].equals("remove")) {
                int index= Integer.parseInt(str_buf[1]);
                list.remove(index);
            } else if (str_buf[0].equals("set")) {
                int index= Integer.parseInt(str_buf[1]);
                int number = Integer.parseInt(str_buf[2]);
                list.set(index,number);
            } else if (str_buf[0].equals("printList")) {
                Task2.printListSpecial(list);
                break;
            }
        }
    }

    private static void printListSpecial(ArrayList<Integer> list) {
        for (Integer s : list) {
            System.out.print(s + " ");
        }
    }
}