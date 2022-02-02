public class ThreadTestSynchronized implements Runnable{
    private static ThreadTestSynchronized shared = new ThreadTestSynchronized();

    public void process(){
        for (int i =0; i<3; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            Thread.yield();
        }
    }
    public void run(){
        //Основной объект заключен в synchronized для блокировки доступа к нему
        synchronized (shared){
            shared.process();
        }
    }

}
