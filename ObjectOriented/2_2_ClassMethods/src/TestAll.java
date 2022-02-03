import java.io.IOException;
import java.util.Random;

public class TestAll {
    public static void main(String[] args) throws IOException {
        Array inst = new Array();
        //Генерация случайного числа
        int min = 1;
        int max = 100000;
        int diff = max - min;
        Random random = new Random();

        for(int i = 0; i < 100; i++) {
            int element = random.nextInt(diff + 1);
            element += min;
            inst.add(element);
        }
        System.out.println("Длина массива: " + inst.size);
        System.out.println("Элемент 50: " + inst.data[50]);
    }
}
