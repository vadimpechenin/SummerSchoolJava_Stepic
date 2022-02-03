public class Cat {

    public static int catCount;

    @Override
    public String toString() {
        return String.format("Кот зовут - %s, ему лет %d, он весит - %dкг", name, age,weight);
 /*               \"Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';*/
    }

    public Cat() {
        catCount ++;
    }

    private String name = "Vaska";
    private int age, weight, hp = 100;

    //поле погладить
    private int levelOfHappy = 0;

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
}
