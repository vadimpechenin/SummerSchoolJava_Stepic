/*
Три списка
Даны три списка целых чисел строками через пробел.

Первая строка - первый список, вторая - второй, третья - третий.

Из первого списка нужно выбрать положительные элементы, из второго - четные, из третьего - кратные 7. Все выбранные элементы необходимо объединить в единый список и вывести его в порядке не убывания.

Sample Input 1:

1 2 3 4 -2 -2 -2 -2
2 5 4 3 9 7 8 1 7 12 16
7 21 15 16 19 18
Sample Output 1:

1 2 2 3 4 4 7 8 12 16 21*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task3 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        int i = 1;
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] str_buf = str.split(" ");
            for (String s : str_buf) {
                int number = Integer.parseInt(s);
                if ((i==1)&&(number>0)){
                    list1.add(number);
                }else if ((i==2)&&(number%2==0)){
                    list2.add(number);
                }else if ((i==3)&&(number%7==0)){
                    list3.add(number);
                }
            }
            i++;
            if ((i==4)){
                break;
            }
        }
        list1.addAll(list2);
        list1.addAll(list3);
        Collections.sort(list1);
//        Collections.reverse(list1);
        Task3.printListSpecial(list1);

    }

    private static void printListSpecial(ArrayList<Integer> list) {
        for (Integer s : list) {
            System.out.print(s + " ");
        }
    }
}