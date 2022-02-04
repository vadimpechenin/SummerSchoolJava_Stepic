public class Fish extends Animal implements Swimmable{

    public Fish(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    void sleep() {

    }

    @Override
    void eat() {

    }

    @Override
    public void swim(){
        this.weight-=1;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
