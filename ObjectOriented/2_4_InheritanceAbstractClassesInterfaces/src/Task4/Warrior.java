package Task4;

import java.util.ArrayList;
import java.util.Random;

public class Warrior extends Hero{
    public Warrior(){
        //базовые значение
        this.s = 100; this.a = 50; this.i = 1; this.exp = 0; this.hp = 500; this.mana = 10; // сила ловкость интеллект опыт здоровье мана
        this.damage = 150; // урон
    }
    /*
  класс должен обладать всеми свойствами героя при создании воин должен обладать следующими характеристиками:
   здоровье - 500, мана - 10, сила - 100, ловкость - 50, интеллект - 1, опыт 0, урон - 150. При атаке герой наносит цели урон
   и получает урон в ответ от цели, действия повторяются пока кто то не победит.
    В случае победы герой получает опыт цели, каждые 500 единиц опыта герой получает новый уровень.
     Новый уровень дает +10 ко всем характеристикам, +200 здоровья и +20 урона.Если воин имеет предмет 1 типа, к его урону добавляется 100.
              Уже мертвая цель - урона герою не наносит!!!
              */
    @Override
    public void attack(Enemy enemy) {
        /*int i = 0;
        while (this.hp > 0 && enemy.hp > 0){
            if (i==0) {
                enemy.hp -= this.damage;
                i=1;
            }else{
                this.hp -= enemy.damage;
                i=0;
            };
        }*/
        if(this.hp > 0) enemy.hp -= this.damage;
        if (enemy.hp <= 0){
            this.exp += enemy.exp;
            while(this.exp >= 500) {
//                System.out.println("Lvl UP!!!");
                this.mana += 10;
                this.s += 10;
                this.a += 10;
                this.i += 10;

                this.hp += 200;
                this.damage += 20;
                this.exp -= 500;
            }
        }
    }

    @Override
    public void defense(Enemy enemy) {
        if(enemy.hp > 0) this.hp -= enemy.damage;
        if(this.hp <= 0) {
            System.out.println( "Ваш герой был убит");
        }
    }

    @Override
    public void openItem(Item item) {
        // метод должен добавлять предмет в список с вероятностью 50 %
        // для осуществления вероятностных процессов можно использовать случайное число от 0 до 100.
        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        if (i>=50){
            this.items.add(item);
        }
        for (int j=0; j<items.size(); j++){
            if (items.get(j).type==1){
                this.damage += 100;
            }
        }
    }
}
