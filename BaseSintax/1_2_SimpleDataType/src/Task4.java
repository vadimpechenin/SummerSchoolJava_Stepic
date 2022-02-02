/*
Длинные целые
Необходимо вывести остаток от деления первого числа на второе

Sample Input:

55656567464 674764
Sample Output:

8452
*/
import java.util.*;
import java.math.*;
import java.io.*;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        long a = k.nextLong();
        long b = k.nextLong();
        long c = a%b;
        System.out.println(c);
    }
}
