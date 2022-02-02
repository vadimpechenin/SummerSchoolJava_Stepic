/*
Методы класса String:
charAt(int index);            // возвращает букву строки по индексу, [] - так нельзя!
length();                  // возвращает длину строки
toUpperCase();               // приводит строку к верхнему регистру
toLowerCase();               // приводит строку к нижнему регистру
compareTo(String anotherStr);        // лексикографическое сравнение строк
contains(String str);           // проверяет содержится ли строка внутри строки
startsWith(String str);          // проверяет начинает ли строка на строку
endsWith(String str);           // проверяет заканчивается ли строка на строку
indexOf(String str);            // возвращает позицию первого вхождения подстроки в строку
lastIndexOf(String str);          // возвращает позицию последнего вхождения подстроки в строку
split(regex reg);              // разбивает строку на массив строк по регулярному выражению
toCharArray();               // возвращает массив с символами

Методы класса StringBuilder, которых нет в классе String:

append(String str);           // вставка в конец за константное время
set(int index, char ch);        // изменение буквы внутри строки
delete(int from, int to);        // удаление куска строки
deleteCharAt(int index);        // удаление символа по индексу
insert(int index, String str);      // вставка строки по индексу
reverse()                            // обратный порядок симовлов
*/


import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args){
//        TestClass.bubbleSort();
//        TestClass.stringWork(); // Начало работы со String
//        TestClass.stringWorkAndBuilder(); // начало работы соStringBuilder
        TestClass.splitForString(); // Метод split для строки
    }

    private static void splitForString() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String [] strings = s.split(" - "); // делит строку на много строк по регулярному выражению
        System.out.println(Arrays.toString(strings));


    }

    private static void stringWorkAndBuilder() {
        Scanner in = new Scanner(System.in);
        String s = in.next(); // данные до пробела
        StringBuilder sb = new StringBuilder();
        char a = '1';
        sb.append("ASAD");
        sb.setCharAt(1,a);
        System.out.print(sb);
    }

    private static void stringWork() {
        //Работа со строками
        Scanner in = new Scanner(System.in);
        String s = in.next(); // данные до пробела
/*        String s1 = in.nextLine(); // Данные строки целеком
        System.out.println(s1  + "\n" + s);*/
//        Привести строку к массиву char
        char [] a = s.toCharArray();
        //Пройтись по длине строки
        for (int i = 0; i < a.length; i++){
            if (a[i] >= 'A' && a[i] <= 'Z'){
                a[i] += (int)('a' - 'A');

            }
        }
        //s = Arrays.toString(a);
        //outs = "";
        StringBuilder outs = new StringBuilder();
        for (char i:a){
            outs.append(i); // outs += i
        }
        System.out.println(outs);
    }

    public static void bubbleSort(){
        //Сортировка пузырьком
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        // Стандартная библиотека для сортировки
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println(Arrays.toString(a));
        // Ручная сортировка
        int buf;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - 1; j++){
                if (a[j] > a[j+1]){
                    if (a[j] > a[j + 1]){
                        buf = a[j + 1];
                        a[j+1] = a[j];
                        a[j] = buf;
                    }
                }
            }
        }
        for (int i : a)System.out.print(i + " ");
    }
}
