/*
Сортируем точки
Программа получает на вход целое число N, далее следуют N пар значений x, y - координаты текущей точки. Необходимо выстроить все точки по увеличению их удаленности от начала координат и вывести отсортированный спиcок точек на экран в формате :

(1; 2)

(2: 7)

........

Необходимо учесть, что координаты могут принимать как положительные так и отрицательные значения!

Sample Input 1:

5
1 2
3 7
-2 3
1 1
3 5
Sample Output 1:

(1; 1)
(1; 2)
(-2; 3)
(3; 5)
(3; 7)
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task1 {
    public static void task1(){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        Point[] point = new Point[number];
        for (int i = 0; i < number; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            point[i] = new Point(x,y);

        }
        Arrays.sort(point,(Comparator.comparingInt(o -> o.x*o.x+o.y*o.y)));
        for (Point v : point){
            System.out.println("(" + v.x+ "; " + v.y + ")");
        }
    }


}
