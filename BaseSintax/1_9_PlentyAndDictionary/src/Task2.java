/*
Друзья
Вводится несколько строк по два слова в каждой - имена двух друзей. Дружба - вещь взаимная(с двух сторон!!!).
Иначе люди - не друзья.

Необходимо вывести ответ в соответствии с примерами ниже - список друзей. Список состоит из имен людей,
список выстроен в лексографическом порядке(по алфавиту) по возрастанию, после имени человека идет фраза " дружит с : ",
 далее следует список имен его друзей, выстроенный так же по возрастанию.

Sample Input 1:

Mike Nike
Oleg Petr
Mike Petr
Ivan Oleg
Sample Output 1:

Ivan дружит с : Oleg
Mike дружит с : Nike Petr
Nike дружит с : Mike
Oleg дружит с : Ivan Petr
Petr дружит с : Mike Oleg
*/

import java.util.*;

public class Task2 {
    static void execute(){
        Scanner in = new Scanner(System.in);
        TreeMap<String, TreeSet<String>> map = new TreeMap<>();
        boolean flag = true;
        int i = 1;
        while (flag){

//        while (flag){
//            try {
           /* String s = in.nextLine();
            String[] ss = s.split(" ");
            String name = ss[0];
            String friend = ss[1];*/
            String name = in.next();
            String friend = in.next();
            if (map.containsKey(name)) {
                map.get(name).add(friend);
            } else {
                TreeSet<String> set = new TreeSet<>();
                set.add(friend);
                map.put(name, set);
            }
            if (map.containsKey(friend)) {
                map.get(friend).add(name);
            } else {
                TreeSet<String> set = new TreeSet<>();
                set.add(name);
                map.put(friend, set);
            }

            flag = in.hasNext();
            System.out.println(i);
            i++;
            int g = 0;
//            }catch (Exception e){
//                flag = false;
//            }

        }
        for (String name : map.keySet()){
            System.out.print(name + " дружит с : ");
            for (String number : map.get(name)){
                System.out.print(number + " ");
            };
            System.out.println("");
        }
    }
 }