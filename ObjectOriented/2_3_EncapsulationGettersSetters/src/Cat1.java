/*
Инкапсуляция кота
Спроектируйте класс Cat с любыми полями, но таким образом,
 чтобы для него были доступны следующие методы:

setName(String name) - дать имя коту

getName() - получить имя кота

run() - бежать, уменьшает уровень энергии на 100

getStamina() - возвращает текущий уровень энергии. Стартовая энергия кота - 1000.

eat() - увеличивает уровень энергии на 200

sleep() - увеличивает уровень энергии на 100
*/

public class Cat1 {

    private String name;
    private int energy=1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        energy-=100;
    }

    public int getStamina() {
        return energy;
    }

    public void eat() {
        energy+=200;
    }

    public void sleep() {
        energy+=100;
    }

}
