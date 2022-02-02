/*
Введение в классы и объекты. Создание классов, полей классов.
*/

import java.io.IOException;

public class TestClass {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.age = 2;
        cat.name = "Vaska";
        cat.weight = 8;

        User u = new User();
        u.name = "Иван";
        u.sername = "Иванов";
        u.age = 15;
    }
}
