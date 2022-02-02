/*Пример использования типа данных char, ввод преобразования типов*/

public class TestClass {
    public static void main(String[] args) throws Exception {
        char c = 'a';
        int c1 = System.in.read();
        System.out.println((char)c1);
        //Диапазон символов
        for (int i = 0; i<1000; i++){ //<256
            System.out.print((char)i + " ");
            if (i % 80 == 0) System.out.println();
        }
    }
}
