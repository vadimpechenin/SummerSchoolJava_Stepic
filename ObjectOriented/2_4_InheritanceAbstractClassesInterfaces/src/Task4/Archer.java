package Task4;

import java.util.Random;

public class Archer extends Hero{
    public Archer(){
        //базовые значение
        this.s = 20; this.a = 150; this.i = 30; this.exp = 0; this.hp = 200; this.mana = 50; // сила ловкость интеллект опыт здоровье мана
        this.damage = 200; // урон
    }
    /*
             класс должен обладать всеми свойствами героя при создании лучник должен обладать следующими характеристиками:
             здоровье - 200, мана - 50, сила - 20, ловкость - 150, интеллект - 30, опыт 0, урон - 200.
              атака по аналогии с воином, но в процессе атаки лучник имеет 30% шанс избежать урон
              лучник всегда открывает предмет - 100%
              Новый уровень дает +10 ко всем характеристикам, +50 здоровья и +50 урона и 30 ловкости.
              */
    @Override
    public void attack(Enemy enemy) {
        if(this.hp > 0) enemy.hp -= this.damage;
        if(enemy.hp <= 0) {
//            System.out.println("Congrats! You killed the enemy!");
            this.exp += enemy.exp;
            while(this.exp >= 500) {
//                System.out.println("Lvl UP!!!");
                this.mana += 10;
                this.s += 10;
                this.i += 10;

                this.hp += 50;
                this.damage += 50;
                this.a += 30;

                this.exp -= 500;
            }
        }
    }

    @Override
    public void defense(Enemy enemy) {
        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
//        if(R.nextInt(100) >= 70) //System.out.println("Dodged!");
        if(enemy.hp > 0  && random.nextInt(diff + 1) < 70) this.hp -= enemy.damage;
        if(this.hp <= 0) {
            System.out.println( "Ваш герой был убит");
         }
    }

    @Override
    public void openItem(Item item) {
        this.items.add(item);
    }
}
