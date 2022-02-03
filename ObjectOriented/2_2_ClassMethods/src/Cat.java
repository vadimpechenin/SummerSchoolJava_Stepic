public class Cat {
    //Класс кота, коты могут драться
    String name;
    int age, weight, hp = 100;

    void eat(){
        hp+=30;
    }

    void sleep(){
        hp+=15;
    }

    Cat fight(Cat cat1, Cat cat2){
        while (cat1.hp > 0 && cat2.hp > 0){
            cat2.hp -= cat1.weight *2;
            cat1.hp -= cat2.weight *2;
        }
        return cat1.hp < 0 ? cat2 : cat1;
    }
}
