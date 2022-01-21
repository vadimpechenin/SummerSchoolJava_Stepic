/*
Класс, в котором два потока работают с одними и темиже данными
*/
public class ThreadTestWithoutSynchronization {

    private int a = 1, b = 2;
    public void one() {
        a = b;
    }

    public void two() {
        b = a;
    }

    public static void execute(){
        int a11 = 0, a22 = 0, a12 = 0;
        for (int i = 0; i<1000; i++){
            final ThreadTestWithoutSynchronization o = new ThreadTestWithoutSynchronization();

            //Запускаем первый поток, который вызывает один метод
            new Thread(){
                public void run(){
                    o.one();
                }
            }.start();

            //Запускаем второй поток, который вызывает второй метод
            new Thread(){
                public void run(){
                    o.two();
                }
            }.start();

            //даем потокам время отработать
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){}

            //анализируем финальные значения
            if (o.a==1 && o.b==1) a11++;
            if (o.a==2 && o.b==2) a22++;
            if (o.a!=o.b) a12++;
        }
        System.out.println(a11+" " + a22 + " " + a12);
    }
}
