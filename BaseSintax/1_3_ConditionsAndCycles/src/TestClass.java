import java.io.IOException;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws IOException {
        if (1==0){
        Scanner in = new Scanner(System.in);
        //In - 54 84 12
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a > b) {
            System.out.println("A");
        } else if (a > c) {
            System.out.println("C");
        } else {
            System.out.println("B");
        }
        //Короткая запись с помощью библиотеки
        //Out - 84
        int d = Math.max(Math.max(a, b), c);
        System.out.println(d);
        // Громоздкая запись с помощью условий
        if (a > b) {
            if (a > c)
                System.out.println(a);
            else
                System.out.println(c);
        } else {
            if (b > c)
                System.out.println(b);
            else
                System.out.println(c);
        }
        // Запись с помощью тернарных выражений
        a = a > b ? a : b;
        a = a > c ? a : c;
        System.out.println(a);

        //Условия и циклы
        //
        int c1 = 0;
        while (c1 < 800) {
            System.out.print(5);
            c1++;
            if (c1 % 80 == 0) System.out.println();
        }
        //Алгоритм поиска суммы цифр числа
        // In 1524
        Scanner in1 = new Scanner(System.in);
        int c2 = in.nextInt();
        int sum = 0;
        while (c2 > 0) {
            sum += c2 % 10;
            c2 /= 10;
        }

        // Out 12
        System.out.println(sum);
        //}
        // Не знаем сколько цифр вводится,режим интерактива заканчивается при нажатии ctrl+D
        Scanner in2 = new Scanner(System.in);
        int a1, sum1 = 0;
        while (in2.hasNext()){ // Позволяет вводить данные пока они не кончатся
            a1 = in2.nextInt();
            sum1 += a1;
            System.out.print(sum1 + " ");
        }
    }
        //Пример цикла for
        for (int i = 0; i<10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 9; i>=0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        //fori + Tab - кратко преобразуется в базовую конструкцию
        for (int i = 9; i>=0; i-=3){
            System.out.print(i + " ");
        }
        System.out.println();
        // Цикл по всем элементам
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        for(int i : array) System.out.print(i + " "); //переменная i станет экземпляром массива и будет обходить его поэлементно от начала к концу
    }
}
