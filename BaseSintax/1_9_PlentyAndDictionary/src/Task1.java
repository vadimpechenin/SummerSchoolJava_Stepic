/*
Соревнования
Программа получает на вход N целых чисел - штрафные баллы i-ого участника и К - мощность множества (количество элементов в нем).

Необходимо выбрать К - элементное множество из уникальных по величине штрафных баллов.
Необходимо вывести множество с минимальной суммой в порядке возрастания штрафных баллов через пробел или -1, если такое множество получить нельзя.



Sample Input 1:

7 1
2 3 4 5 6 7 1
Sample Output 1:

1
*/

import java.util.Scanner;

import java.util.*;

public class Task1{
    static void execute(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int [] arr = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i<n; i++){
            arr[i] = in.nextInt();
            set.add(arr[i]);
        }
        if (set.size()>=k){
            Iterator iterator = set.iterator();
            for (int i=0; i<k; i++){
                    System.out.print(iterator.next() + " ");
                }

        }else{
            System.out.println(-1);
        }
    }
 }