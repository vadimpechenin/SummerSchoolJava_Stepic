/*
НОД двух чисел
Sample Input 1:

5465151651561565656151 1151651651651
Sample Output 1:

1
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Task3 {
    static void execute(){
        Scanner in = new Scanner(System.in);
        BigInteger bg1 = new BigInteger(in.next());
        BigInteger bg2 = new BigInteger(in.next());
        System.out.println(bg1.gcd(bg2));
    }
 }