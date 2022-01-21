

public class ThreadTestWithDaemons implements Runnable{

//    Отдельная группа, в которой будут
//    находиться все потоки ThreadTest
    public final static ThreadGroup GROUP =
        new ThreadGroup("Daemon demo");

//    Стартовое значение,
//    указывается при создании объекта
    private int start;

    public ThreadTestWithDaemons(int s){
        start = (s%2==0)? s: s+1;
        new Thread(GROUP, this, "Thread " + start).start();
    }

    public void run(){
        // Начинаем обратный отсчет
        for (int i = start; i > 0; i--){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e){}
            //По достижении середины порождаем новый
            //поток с половинным начальным значением
            if (start>2&& i == start/2){
                new ThreadTestWithDaemons(i);
            }

        }
    }
}
