/*
Множество и словарь
1. Сборка jar

в maven (pom.xml) прописываем плагины
maven-compiler-plugin
maven-assembly-plugin
jar-with-dependencies

java -jar testPro.jar - запуск собранного jar файла в терминале

2. Тесты.
Нужно создать src/test/java/ *.java
Через File -> Project Structure -> Modules
пометить java папку как Test

Добавить в файл аннотацию @Test

3. Множество - собирает в себя уникальные элементы
HashSet - на хэш-таблицах (по возростанию хэш функции)
 и TreeSet - на деревьях (по возрастанию элементов в дереве)
Оба реализуют интерфейс iterable, по ним можно бежать циклами foreach

4. Словарь - map (одна из реализаций ассоциативного массива),
может быть устроена в виде дерева. Хранит информацию не только об элементе, но и вторичную
(количество, данные клиента, имя ребенка и имя родителя). Ключ-значения.
*/

import java.util.*;

public class Main {
    public static void main(String[] args){
//        inHelloWorld();
//        System.out.println(new Main().sum(1,2));
//        setFunction();
//        setFunctionTasks();
//        mapFunctionTasks();
        mapSetFunctionTasks();
    }

    static void setFunction(){
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        Random r = new Random();
        for (int i = 0; i < 100; i++){
            int t = r.nextInt(1000);
            hashSet.add(t);
            treeSet.add(t);
        }
        System.out.println(treeSet + " " + treeSet.size());
        System.out.println(hashSet + " " + hashSet.size());
    }
    static void setFunctionTasks(){
//        Задача на множество - задача сборки алфавита строки
        // Вход - Karl u Klari ukral koralli, a Klara ukrala u Karla klarnet
        Scanner in = new Scanner(System.in);
        TreeSet<Character> treeSet = new TreeSet<>();
        String s = in.nextLine();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                treeSet.add(s.charAt(i));
            }
        }
        System.out.println(treeSet);
        for (Character i : treeSet){
            System.out.print(i + " ");
        }
    }

    static void mapFunctionTasks(){
//        Задача на словарь - задача сборки алфавита строки и
//        наряду с алфавитом узнать сколько каждая буква встречается в строке
        // Вход - Karl u Klari ukral koralli, a Klara ukrala u Karla klarnet
        Scanner in = new Scanner(System.in);
        TreeMap<Character, Integer> map = new TreeMap<>();
        String s = in.nextLine();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                if (map.containsKey(s.charAt(i)))
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                else
                    map.put(s.charAt(i), 1);
            }
        }
        for (Character ch : map.keySet()){
            System.out.println(ch + " : " + map.get(ch));
        }
    }

    static void mapSetFunctionTasks(){
//        Задача о связке чего-то с чем-то (человека и его телефона)
//      ФИ - ключ, значение - множество телефонов
        // Строк будет много
/*
Ivanov Ivan +792722222
Petrov Petr +09182048120984
Ivanov Ivan +1209850157
Sidorov Sidr 1254158112412
 */
        Scanner in = new Scanner(System.in);
        TreeMap<String, TreeSet<String>> map = new TreeMap<>();
        for (int i = 0; i<4; i++){
            String s = in.nextLine();
            String [] ss = s.split(" ");
            String name = ss[0] + ss[1];
            String number = ss[2];
            if (map.containsKey(name)) {
                map.get(name).add(number);
            }else{
                TreeSet<String> set = new TreeSet<>();
                set.add(number);
                map.put(name,set);
                }

            }
        for (String name : map.keySet()){
            System.out.print(name + " : ");
            for (String number : map.get(name)){
                System.out.print(number + " ");
            };
            System.out.println("");
        }
    }

    int sum(int a, int b){
        return a + b;
    }

    int mult(int a, int b){
        return a * b;
    }


    static void inHelloWorld(){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        while (n-->0)
            System.out.println("Hello world!");
    }

}
