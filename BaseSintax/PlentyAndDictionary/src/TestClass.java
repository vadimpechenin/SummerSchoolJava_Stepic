/*
Множество и словарь
*/


import java.math.BigInteger;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger(in.next());
        //Факториал числа
        System.out.println(f(bigInteger));
        /*bigInteger = bigInteger.add(new BigInteger("222222222222222"));
        System.out.println(bigInteger);*/
    }

    static BigInteger f(BigInteger n){
        return n.equals(BigInteger.ONE) ? n: n.multiply(f(n.add(new BigInteger("-1"))));
    }
}
