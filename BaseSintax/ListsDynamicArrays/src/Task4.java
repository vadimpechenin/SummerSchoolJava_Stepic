/*
Слияние списков
Даны два списка. Необходимо слить два списка в один, отсортировать по убыванию и вывести.

Вводится целое число N и N чисел со следующей строки, потом целое число M и М чисел со следующей строки.

Sample Input 1:

5
1 2 3 4 5
7
5 4 3 1 2 6 7
Sample Output 1:

7 6 5 5 4 4 3 3 2 2 1 1
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task4 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int i = 1;
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] str_buf = str.split(" ");
            int number = Integer.parseInt(str_buf[0]);
            str = in.nextLine();
            str_buf = str.split(" ");
            for (String s : str_buf) {
                int number1 = Integer.parseInt(s);
                if (i==1) {
                    list1.add(number1);
                }else if (i==2){
                    list2.add(number1);
                }
            }
            i++;
            if ((i==3)){
                break;
            }
        }
        list1.addAll(list2);
        Collections.sort(list1);
        Collections.reverse(list1);
        Task4.printListSpecial(list1);

    }

    private static void printListSpecial(ArrayList<Integer> list) {
        for (Integer s : list) {
            System.out.print(s + " ");
        }
    }
}