/*
Списки и динамические массивы
Для реализации динамических массивов есть два класса:
ArrayList (на входе ссылочный тип данных)
LinkedList<>
Это объекты, к ним мы не можем обращаться через []
set - изменить значение внутри объекта
get - получить значение из объекта

ArrayList<Integer> list = new ArrayList<>(); //в треугольных скобках передаем ссылочный тип!

Методы ArrayList:
list.add(12); // вставка элемента 12 в конец списка
list.add(1, 18); // вставка по индексу 1 элемента 18
int a = list.get(2); // получение элемента списка по индексу
list.set(2, 8); // заменить значение списка по индексу
list.remove(1); // удалить элемент по индексу
*/


import java.io.IOException;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException{

        //TestClass.initial(); // Знакомство с ArrayList и LinkedList
        TestClass.twoArrays(); // сортировка и случайные числа
    }

    private static void initial() throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            arrayList.add(i+1);
        }
        // Изменение числа в середине
        arrayList.add(3, 87);
        System.out.println(arrayList.contains(5));
        //Удаление числа
        arrayList.remove(2);
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++){
            arrayList.set(i, arrayList.get(i) * 7);
        }
        System.out.println(arrayList);

    }

    private static void twoArrays() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++){
            arrayList.add(r.nextInt(100));
        }
        System.out.println(arrayList);
        for (int i = 0; i < 20; i++){
            linkedList.add(r.nextInt(100));
        }
        System.out.println(linkedList);
        // Соединить два списка
        arrayList.addAll(linkedList);
        System.out.println(arrayList);
        // Отсортировать
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }
}
