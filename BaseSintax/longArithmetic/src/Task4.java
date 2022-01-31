/*
Длинные числа Фибоначчи
Числа Фибоначчи определяются, исходя из рекуррентного соотношения:

f_{1} = 1

f_{2} = 1

f_{i} = f_{i-1} + f_{i-2} , i > 2

Это означает, что каждое новое число является суммой двух предыдущих чисел. При чем, первое и второе числа Фибоначчи -  равны 1.

Программа получает на вход натуральное число N, при чем N не превосходит 10^510
5


Программа должна вывести N-ое по порядку число Фибоначчи.

Рекурсия - не зайдет по времени.

Sample Input 1:

100
Sample Output 1:

354224848179261915075
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Task4 {
    static void execute(){
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        BigInteger fib1 = BigInteger.valueOf(1);
        BigInteger fib2 = BigInteger.valueOf(1);
        BigInteger fib_sum = BigInteger.valueOf(1);
        for (int number = 2; number<n; number++){
            fib_sum = fib1.add(fib2);
            fib1 = fib2;
            fib2 = fib_sum;
        }
        System.out.println(fib_sum);
    }


 }