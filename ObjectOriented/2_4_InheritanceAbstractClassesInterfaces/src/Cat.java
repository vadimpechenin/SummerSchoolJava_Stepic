public class Cat extends Animal{
//    Много конструкторов - это полиморфизм
    private String name = "Vaska";
    private int hp = 100;
    private int levelOfHappy = 0;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Кот зовут - %s, ему лет %d, он весит - %dкг", name, age,weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevelOfHappy() {
        return levelOfHappy;
    }

    public void setLevelOfHappy(int levelOfHappy) {
        this.levelOfHappy += levelOfHappy;
    }

    @Override
    void sleep() {
        hp++;
    }

    @Override
    void eat() {
        hp++;
    }
}
