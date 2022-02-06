/*
Сортировка объектов

*/

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class TestClass {
    public static void main(String[] args) throws IOException {
//        sortedInLection1();
//        sortedInLection2();
        sortedInQuestion1();
    }

    public static void sortedInLection1(){
        // Будем сортировать объекты, обладающими двумя характеристиками  - массой и ценностью
        Value[] values = new Value[50];
        Random r = new Random();
        for (int i = 0; i < 50; i++){
            values[i] = new Value(r.nextInt(1000), r.nextInt(10000));
//            values[i].p = r.nextInt(1000);
//            values[i].w = r.nextInt(10000);
        }
        System.out.println(Arrays.toString(values));
        //Собственно сортировка
        Arrays.sort(values, ((o1, o2) ->o1.p *o2.w - o2.p*o1.w)); // Из-за целочисленности, домножили на w обоих вещей
        System.out.println(Arrays.toString(values));
        for (Value v : values) System.out.println(v.p + " " + v.w);
    }

    public static void sortedInLection2(){
        // Будем сортировать объекты, обладающими двумя характеристиками  - массой и ценностью
        // Только по весу
        Value[] values = new Value[50];
        Random r = new Random();
        for (int i = 0; i < 50; i++){
            values[i] = new Value(r.nextInt(1000), r.nextInt(10000));
//            values[i].p = r.nextInt(1000);
//            values[i].w = r.nextInt(10000);
        }
        System.out.println(Arrays.toString(values));
        //Собственно сортировка
        Arrays.sort(values, (Comparator.comparingInt(o -> o.w))); // Сравнение только по весу
        System.out.println(Arrays.toString(values));
        for (Value v : values) System.out.println(v.p + " " + v.w);
    }

    public static void sortedInQuestion1(){
//        Компаратор
//        Что произойдет с массивом узлов в результате выполнения инструкции Arrays.sort() из примера ниже?
        Node [] nodes = new Node[10];
        for (int i = 0; i < 10; i++) {
            nodes[i] = new Node(i+1, (i+1) * (i+1));
        }
        Arrays.sort(nodes, Comparator.comparingInt(o->o.x));
        for (Node n : nodes) System.out.println(n.x + " " + n.y);
        //
//        Узлы будут отсортированы по возрастанию Х, а в случае равенства Х - по убыванию У
//        Данный алгоритм имеет ограничения в своей применимости

        Arrays.sort(nodes, Comparator.comparingInt(o-> 10000 * o.x - o.y));
        for (Node n : nodes) System.out.println(n.x + " " + n.y);
    }

}
