/*
Одинаковые элементы из двух списков
Дано два списка строками с целыми числами через пробел. Необходимо вывести уникальные элементы(1 раз - 1 элемент),
которые присутствуют и в первом и во втором списке. Элементы необходимо вывести в порядке возрастания.
Гарантируется что хотя бы 1 одинаковый элемент в списках есть.

Sample Input 1:

1 2 3 4 5 6 7 8 9 10
7 8 1 1 1 11 1 1 1 11 1 1 11 1 1 1
Sample Output 1:

1 7 8
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task5 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> allList = new ArrayList<>();
        String a1 = in.nextLine();
        ArrayList<String> bufline1 = new ArrayList<>();
        bufline1.addAll(Arrays.asList(a1.split(" ")));
        ArrayList<Integer> bufint1 = new ArrayList<>();
        for (int j = 0; j < bufline1.size(); j++){
            bufint1.add(Integer.parseInt(bufline1.get(j)));
        }
        String a2 = in.nextLine();
        ArrayList<String> bufline2 = new ArrayList<>();
        bufline2.addAll(Arrays.asList(a2.split(" ")));
        ArrayList<Integer> bufint2 = new ArrayList<>();
        for (int j = 0; j < bufline2.size(); j++){
            bufint2.add(Integer.parseInt(bufline2.get(j)));
        }
        for (Integer value1 : bufint1) {
            for (Integer value2 : bufint2) {
                if (value1.equals(value2) && !allList.contains(value2)) allList.add(value1);
            }
        }
        Collections.sort(allList);
        for (Integer integer : allList) System.out.printf("%d ", integer);
    }

}