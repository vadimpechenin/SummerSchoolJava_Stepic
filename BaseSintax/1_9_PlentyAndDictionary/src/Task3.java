/*
Покупки в магазине
В магазине внедрили автоматизированную систему анализа покупок покупателей.
В 2020 году наличные деньги были отменены и все платежи стали открытыми.
 Каждый магазин в момент платежа получает от покупателя его Фамилию и Имя, а так же список его покупок в формате Наименование товара и сумма покупки.

Например:

Иванов Иван:

    селедка 7
    помидоры 120
    огурцы 110
    устрицы 32
    омары 36
    лобстер 45
Программа получает на вход строки в следующем формате: Фамилия пробел Имя пробел Наименование товара пробел сумма.
Система формирует отчет за месяц, в котором информация обо всех покупателях и обо всех покупках для каждого покупателя.
Покупатели отсортированы по алфавиту, покупки отсортированы по наименованию по алфавиту, в пределах конкретного покупателя.
Внимательно посмотрите на примеры! Если не понятно - оставляйте свои вопросы в комментариях.
На выводе, перед каждым продуктом ставится 4 пробела!
Sample Input 1:

Иванов Иван селедка 7
Иванов Иван помидоры 120
Иванов Иван огурцы 110
Иванов Иван устрицы 32
Иванов Иван омары 36
Иванов Иван лобстер 45
Петров Петр хлеб 2
Билл Гейтс вода 10000
Sample Output 1:

Билл Гейтс:
    вода 10000
Иванов Иван:
    лобстер 45
    огурцы 110
    омары 36
    помидоры 120
    селедка 7
    устрицы 32
Петров Петр:
    хлеб 2
*/

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task3 {
    static void execute(){
        Scanner in = new Scanner(System.in);
        TreeMap<String, TreeMap<String, Integer>> map = new TreeMap<String, TreeMap<String, Integer>>();
        boolean flag = true;
        int i = 1;
        while (flag){
            String name = in.next();
            String lastName = in.next();
            String fullName = name + " " + lastName;
            String product = in.next();
            int number = in.nextInt();
            if (map.containsKey(fullName)) {
                TreeMap<String, Integer> tmp = map.get(fullName);
                if (tmp.containsKey(product)) {
                    Integer oldNumber = tmp.get(product);
                    tmp.put(product, oldNumber + number);
                }else{
                    tmp.put(product, number);
                }
                map.put(fullName,tmp);
            } else {
                TreeMap<String, Integer> tmp = new TreeMap<String, Integer>();
                tmp.put(product, number);
                map.put(fullName,tmp);
            }


            flag = in.hasNext();
//            System.out.println(i);
            i++;
            int g = 0;
        }
        for (Map.Entry<String, TreeMap<String, Integer>> entry : map.entrySet()) {
            String key = entry.getKey();
            TreeMap<String, Integer> value = entry.getValue();

            System.out.println(key + ": ");
            //System.out.println("");
            for (Map.Entry<String, Integer> product : value.entrySet()) {
                String keyProduct = product.getKey();
                Integer valueProduct = product.getValue();

                System.out.println("    " + keyProduct + " " + valueProduct);

            }

        }
    }
 }