/*
Стек
Необходимо создать класс Stack. Для данного класса должны быть доступны следующие методы:

push(int value) - положить число на стек

pop() - вернуть вершину стека и извлечь элемент из стека, в случае извлечения максимума или минимума необходимо найти новые максимум и минимум

getMin() - возвращает минимум стека

getMax() - возвращает максимум стека

size() - возвращает длину стека

isEmpty() - проверяет стек на пустоту
*/

import java.util.ArrayList;
import java.util.Collections;

public class Stack {
    private int size, capacity, top;
    private ArrayList<Integer> stack = new ArrayList<>();

    public void push(int value){
        stack.add(value);
        size++;
    }

    public int pop(){
        top = stack.get(size-1);
        stack.remove(size-1);
        return  top;
    }

    int getMin(){
        return Collections.min(stack);
    }

    int getMax(){
        return Collections.max(stack);
    }

    int size(){
        return  stack.size();
    }

    boolean isEmpty(){
        if (size<0)
            return true;
        else
            return false;
    }

}
