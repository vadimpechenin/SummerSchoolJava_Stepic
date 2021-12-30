import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {
    public static void main (String[] args) throws IOException{
//        Тест ввода-вывода с помощью различных классов из io и util
        Scanner in = new Scanner(System.in);  //System.in - базовое устройство ввода
        int a = in.nextInt();
        System.out.println(a);
        BufferedReader bufin = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(bufin.readLine());
        System.out.println(b);
//        Вывод данных на консоль:
        /*System.out.println("n = " + n); // с переходом на следующую строку
        System.out.print("n = " + n);   // без перехода на следующую строку
        System.out.printf("n = %d", n); // форматированный вывод как в Си*/
    }
}
