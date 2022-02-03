public class CatLecture3 {

    public static int catCount;


    private String name = "Vaska";
    private int age, weight, hp = 100;

    @Override
    public String toString() {
        return String.format("Кот зовут - %s, ему лет %d, он весит - %dкг", name, age,weight);
 /*               \"Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';*/
    }

    public CatLecture3(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

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
