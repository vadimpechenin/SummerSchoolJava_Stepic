/*Цифры в числе
Дано число, необходимо вывести два числа через пробел.
Первое число - количество нечетных цифр данного числа, второе число - произведение четных цифр данного числа.
Если четных цифр в числе нет - произведение 0.

Sample Input 1:

1345
Sample Output 1:

3 4*/

import java.util.Scanner;

public class Task4 implements AbstrctTask{

    public void calculate(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int composition = 1;
        boolean flag = false;
        int count = 0;
        int residue = 0;
        while (a > 0){
            residue = a % 10;
            if (residue % 2 == 0){
                composition *= residue;
                flag = true;
            }else{
                count += 1;
            }
            a /= 10;
        }
        if (flag == false){
            composition = 0;
        }

                System.out.printf("%d %d",count, composition);
    }
}