public class WaitThreeThread implements Runnable{
    final static private Object shared = new Object();
    private int type;

    public WaitThreeThread(int i){
        type = i;
    }

    public void run(){
        if (type==1|| type==2){
            synchronized(shared){
                try{
                    shared.wait();
                }catch (InterruptedException e){}
                System.out.println("Thread " + type + " after wait()");
            }
        }else{
            synchronized (shared){
                shared.notifyAll();
                System.out.println("Thread " + type + " after notifyAll()");
            }
        }

    }

}
