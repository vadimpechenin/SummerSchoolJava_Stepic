/*
Сумма двух чисел
Sample Input 1:

165165156151515161516515616515151515616516515616151516516161651 565565555555555555555556151
Sample Output 1:

165165156151515161516515616515151516182082071171707072071717802
*/

import java.util.Scanner;

import java.math.BigInteger;

import java.util.*;

public class Task1{
    static void execute(){
        Scanner in = new Scanner(System.in);
        BigInteger bg1 = new BigInteger(in.next());
        BigInteger bg2 = new BigInteger(in.next());
        System.out.println(bg1.add(bg2));
    }
 }