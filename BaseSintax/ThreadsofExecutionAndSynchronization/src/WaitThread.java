public class WaitThread implements Runnable{
    private Object shared;

    public WaitThread(Object o){
        shared = o;
    }

    public void run(){
        synchronized(shared){
            try{
                shared.wait();
            }catch (InterruptedException e){}
            System.out.println("after wait");
        }
    }

}
