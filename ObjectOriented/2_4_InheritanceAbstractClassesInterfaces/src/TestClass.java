/*
Наследование, абстрактные классы, интерфейсы
Перегрузка (конструкторов, методов) - несколько одинаковых имен, разная сигнатура
Наследование - возможность одному классу перенимать свойства и методы другого класса
Ключевое слово extends.


Абстрактный класс - класс, который может не иметь реализации конкретных методов и их реализация должна быть определена в классах-наследниках/
Нельзя создать экземпляр абстрактного класса/


Интерфейс - все методы абстрактные. Может быть важно в сетевых протоколах, когда интерфейс один, а реализация непонятно.
Ключевое слово implements
*/

import java.io.IOException;

public class TestClass {
    public static void main(String[] args) throws IOException {
//        catInLection1();
//        catInLection2();
        catInLection3();
    }

    public static void catInLection1(){
        // Знакомство с полиморфизмом на примере нескольких констркторов
        Cat cat = new Cat("Petr", 12, 20);
        Cat cat1 = new Cat("Olga", 5 );
        Cat cat3 = new Cat("Oleg");

        System.out.println(cat + "\n" + cat1 + "\n" + cat3);
    }

    public static void catInLection2(){
        // Знакомство с наследованием и абстрактными классами
        Cat cat = new Cat("Petr", 12, 20);

        System.out.println(cat );
    }

    public static void catInLection3(){
        // Много наследников от одного абстрактного класса
        Animal cat = new Cat("Petr", 12, 20);
        Animal dog = new Dog("Buldog", 50, 9);
        Animal fish = new Fish(1,3);
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(fish);
    }

}
