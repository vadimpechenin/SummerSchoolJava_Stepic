


import java.util.Scanner;

public class Test9  {
    public static void main(String[] args) {
        /*1 Введите 3 числа. И выведите их через пробел в обратном порядке.

        Sample Input 1:

        1 2 3
        Sample Output 1:

        3 2 1*/

        Scanner in= new Scanner(System.in);
        //Scanner in = new Scanner(System.in);
        /*int a = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        int b = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        int c = in2.nextInt();
        System.out.print(c+" "+b+" "+a+" ");*/

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.printf("%d %d %d", c,b,a);
        /*2. Программа получает на вход два целых числа. Числа не превышают 1000000000.

        Программа должна вывести одно целое число - сумму двух чисел.*/
        Scanner in1= new Scanner(System.in);
        int a1 = in1.nextInt();
        int b1 = in1.nextInt();
        int c1 = a1 + b1;
        System.out.printf("%d", c1);
        /*3 Вводится три числа a, b, c, необходимо вывести три строки:
        Если a=1, b = 2, c = 3
        1 + 2 + 3 = 6
        1 * 2 * 3 = 6
        (1 + 2) * 3 = 9*/
        Scanner in2= new Scanner(System.in);
        int a2 = in2.nextInt();
        int b2 = in2.nextInt();
        int c2 = in2.nextInt();
        int d = a2+b2+c2;
        int e =  a2+b2+c2;
        int g = (a2+b2)*c2;
        System.out.printf("%d + %d + %d = %d\n",a2, b2, c2, d);
        System.out.printf("%d * %d * %d = %d\n",a2, b2, c2, e);
        System.out.printf("(%d + %d) * %d = %d",a2, b2, c2, g);

        //Альтернативно
        System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
        System.out.println(a+" * "+b+" * "+c+" = "+(a*b*c));
        System.out.println("("+a+" + "+b+") * "+c+" = "+((a+b)*c));
    }
}

