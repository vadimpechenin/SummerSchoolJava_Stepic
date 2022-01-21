/*
Потоки исполнения. Синхронизация
Для работы с потоками имеется базовый клас Thread и интерфейс Runnable
1. В классе (например MyRunnable) нужно переопределять метод run()
2. Runnable r = new MyRunnable();
3. Thread t = new Thread(r);
t.start();

Работа с приоритетами
методы getPriority() и setPriority()
три константы MIN_PRIORITY, MAX_PRIORITY И NORM_PRIORITY
*/
public class Test {

    public static void main(String s[]){
//        Test.priorityOfThreads();
        Test.daemonThreads();
    }
    public static void priorityOfThreads(){
        //Подготовка потоков
        Thread t[] = new Thread[3];
        for (int i = 0; i<t.length; i++){
            t[i] = new Thread(new ThreadTest(), "Thread " + i);
            //Назначение приоритетов (необязательно)
            t[i].setPriority(Thread.MIN_PRIORITY + (Thread.MAX_PRIORITY-Thread.MIN_PRIORITY)/t.length*i);
        }
        //Запуск потоков
        for (int i = 0; i<t.length; i++){
            t[i].start();
            System.out.println(t[i].getName() + " started");
        }
    }

    public static void daemonThreads(){
        //Подготовка потоков
       new ThreadTestWithDaemons(16);
       new DaemonDemo();
    }
}
