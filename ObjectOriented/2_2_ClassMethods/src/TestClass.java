/*
Методы класса, свойства класса.
*/

import java.io.IOException;

public class TestClass {
    public static void main(String[] args) throws IOException {
        // Задача битвы котов
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.name = "Vaska"; cat2.name = "Petka";

        cat1.weight = 10;
        cat2.weight = 5;
       Cat winner = cat1.fight(cat1, cat2);
       System.out.println(winner.name);
    }
}
