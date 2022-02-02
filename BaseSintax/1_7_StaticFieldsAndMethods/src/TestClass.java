/*
Статические переменные и методы
Не зависят от экзепляра класса и характеризуют состояние класса
*/


public class TestClass {
    // Посчитать количестсво запусков функции
    static int counter = 0;
    static int c = 3;
    public static void main(String[] args){
       /*for (int i = 0; i < 12; i++){
           System.out.println(foo());
       }
        System.out.println(counter);*/
        new TestClass().run();
        // На область видимости
        int c = 0;
        for(int i = 0; i < 3; i++) c++;
        System.out.print(c);
    }

    void run(){
        for (int i = 0; i < 30; i++){
            foo();
        }
        System.out.println(counter);
    }

    static int foo(){
        counter++;
        return 1;
    }
}
