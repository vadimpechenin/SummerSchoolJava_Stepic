public class Dog extends Animal {

    private String name;

    public Dog(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void sleep() {

    }

    @Override
    void eat() {

    }

    @Override
    public String toString() {
        return String.format("Собаку зовут - %s, ему лет %d, он весит - %dкг", name, age,weight);
    }
}
