/*
Произведение двух чисел
Sample Input 1:

56516515616515615615656156151616 11656516165165156516165165
Sample Output 1:

658785677882723285223840272699554862329752715360637656640
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Task2 {
    static void execute(){
        Scanner in = new Scanner(System.in);
        BigInteger bg1 = new BigInteger(in.next());
        BigInteger bg2 = new BigInteger(in.next());
        System.out.println(bg1.multiply(bg2));
    }
 }