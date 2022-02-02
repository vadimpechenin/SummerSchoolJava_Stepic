/*
Prime
Реализуйте функцию проверки числа на простоту. Постарайтесь найти оптимальное решение с асимптотикой O((n)^{1/2}))

Sample Input 1:

5
Sample Output 1:

true

Решение етодом перебора делителей (как раз O((n)^{1/2})))
 */


public class Task6 {

    static boolean isPrime(long n){
        boolean simple = true;
        long i = 2;
        while (i<=Math.sqrt(n)){
            if (n % i ==0){
                simple = false;
                break;
            }
            i++;

        }
        System.out.println(simple);
        return simple;
    }
}