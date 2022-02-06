public class Value {
    //Класс-ценность, характеристики - масса и ценностью
    int w, p;

    public Value(int w, int p) {
        this.w = w;
        this.p = p;
    }

    @Override
    public String toString() {
        return "{" +
                "w=" + w +
                ", p=" + p +
                '}';
    }
}
