/*
Параметризованные классы

Содаем некий класс (Array), который будет похож на класс ArrayList
public class Array<E> - E - некий ссылочный тип, т.к. все объекты Java наследуются от класса Object
Экземпляр E мы создаь не можем, но можем создать экземпляр Array.

По сути Array - реализация ArrayList
*/

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class TestClass {
    public static void main(String[] args) throws IOException {
        parameterInLection1();

    }

    public static void parameterInLection1(){
        //Тестирование класса Array
        Array<Integer> aI = new Array<>();
        Array<String> aS = new Array<>();
        for (int i=0; i<4; i++){
            aI.add(1);
            aS.add("word");
        }

        System.out.println(aI);
        System.out.println(aS);
    }


}
