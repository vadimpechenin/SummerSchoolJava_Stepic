
import java.io.IOException;

public class TestAll {
    public static void main(String[] args) throws IOException {
        ParametrList<Integer> aI = new ParametrList<>();
        System.out.println("Создание массива");
        for (int i=0; i<4; i++){
            aI.add(i);
        }
        System.out.println(aI);
        System.out.println(aI.size());
        System.out.println("Получение элемента");
        System.out.println(aI.get(2));
        System.out.println("Замена элемента");
        aI.set(2,100);
        System.out.println(aI.get(2));
        System.out.println("Удаление элемента");
        aI.remove(2);
        System.out.println(aI);
        System.out.println(aI.size());
        System.out.println("Поиск элемента");
        System.out.println(aI.find(3));
        System.out.println(aI.find(100));
        System.out.println("Вставка элемента");
        aI.insert(2,100);
        System.out.println(aI);
        System.out.println(aI.size());

    }
}
