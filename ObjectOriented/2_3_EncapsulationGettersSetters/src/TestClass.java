/*
Инкапсуляция, геттеры и сеттеры

private - доступ только внутри класса
protected - внутри и в наследниках
public - везде доступ
*/

import java.io.IOException;

public class TestClass {
    public static void main(String[] args) throws IOException {
//        catInLection1();
        // Конструктор класса
        //catInLection2();
        //Возможности IDE - alt+insert - автоматом добавить геттеры и сеттеры
        // toString() -
        catInLection3();

    }

    public static void catInLection1(){
        // Знакомство с геттерами и сеттерами
        Cat cat = new Cat();

        System.out.println(cat.getName());
        cat.setLevelOfHappy(100);
        System.out.println(cat.getLevelOfHappy());
    }

    public static void catInLection2(){
        Cat cat;
        for (int i = 0; i< 15; i++){
            cat = new Cat();
        }
        System.out.println(Cat.catCount);
    }

    public static void catInLection3(){
        CatLecture3 cat = new CatLecture3("Vaska", 10, 12);

        System.out.println(cat);
    }
}
