package Task4;

import java.util.ArrayList;

public class Magician extends Hero{
    public Magician(){
        //базовые значение
        this.s = 5; this.a = 30; this.i = 300; this.exp = 0; this.hp = 100; this.mana = 5000; // сила ловкость интеллект опыт здоровье мана
        this.damage = 40; // урон
    }
    private ArrayList<Item> casts = new ArrayList<>();
    /*
        класс должен обладать всеми свойствами героя при создании маг должен обладать следующими характеристиками:
         здоровье - 100, мана - 5000, сила - 5, ловкость - 30, интеллект - 300, опыт 0, урон - 40.
    атака по аналогии с воином
    помимо обычной атаки, маг имеет возможность бить заклинанием в процессе атаки
    защита мага осуществляется магическим щитом, который полгащает весь урон, но вместо здоровья тратит ману.
    Новый уровень дает +10 ко всем характеристикам, +30 здоровья, 1000 маны и +10 урона.
    В случае возможности убить врага с руки - маг бьет с руки!!! в Первую очередь
    */

    public void makeCast(Enemy enemy){
        // если в списке есть заклятия можно его произнести потратив 100 маны и нанеся 1000 урона цели.
        // после произнесения предмет из списка пропадает
        if(!casts.isEmpty()) {
            this.mana -= 100;
            enemy.hp -= 1000;
            casts.remove(casts.size() - 1);
        }
    }

    public void eduCast(Item item){
                /*
                если предмет или предметы из списка имеют тип 2, это заклинания и их нужно добавить в список
заклинаний мага
                */
        for (int j=0; j<items.size(); j++){
            if (items.get(j).type==2){
                this.casts.add(items.get(j));
            }
        }
    }

    @Override
    public void attack(Enemy enemy) {
        if(this.hp > 0 && enemy.hp <= this.damage || this.hp > 0 && casts.isEmpty()) {
            enemy.hp -= this.damage;
        }
        else this.makeCast(enemy);
        if (enemy.hp <= 0){
            this.exp += enemy.exp;
            while(this.exp >= 500) {
//                System.out.println("Lvl UP!!!");
                this.s += 10;
                this.a += 10;
                this.i += 10;

                this.hp += 30;
                this.damage += 10;
                this.mana += 1000;

                this.exp -= 500;
            }
        }
    }

    @Override
    public void defense(Enemy enemy) {
        if(enemy.hp > 0 && this.mana > 0){
            this.mana -= enemy.damage;
        }else if ((this.mana <= 0)&&(enemy.hp > 0)){
            this.hp -= enemy.damage;
        }
        if (this.hp <= 0){
            System.out.println( "Ваш герой был убит");
        }
    }
}
