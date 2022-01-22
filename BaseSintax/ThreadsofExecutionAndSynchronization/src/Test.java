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

Модификатор volatile - устанавливает более строгие правила для работы с значениями переменных
(переменная и главное хранилище всегда имеют самое последнее значение для этой переменной)

Основные операции для потоков при работе с памятью
use - чтение значения переменной из рабочей памяти потока;
assign - запись значения переменной в рабочую память потока;
read - получение значения переменной из основного хранилища;
load - сохранение значения переменой, прочитанного из основного хранилища, в рабочей памяти;
store - передача значения перменной из рабочей памяти в основное хранилище для дальнейшего хранения;
write - сохраняет в основное хранилище значение переменной, переданной командой store.

Хранилище для каждого объекта поддерживается блокировка(lock), над которой можно произвести два действия -
установить (lock) и снять (unlock). Только один поток в один момент времени может установить блокировку на некоторый объект.
В Java для использования механизма блокировкок существует ключевое слово synchronized, применяется в 2 вариантах:
 1) объявление synchronized-блока
 2) как модификатор метода

 В обоих случаях
 sychronized (ref){
 ...
 }
 ref - переменная, обязательно ссылается на объект, потому не null.

 wait(), notify(), notifyAll() класса Object
 Каждый объект Java имеет т.н. wait-set, набор потоков исполнения.
 Любой поток может вызвать метод wait() любого объекта и таким образом попасть в его wait-set.
 При этом выполнение такого потока приостанавливается до тех пор, пока другой поток не вызовет у этого же объекта метод notifyAll(),
  который пробуждает все потоки из wait-set.
  Метод notify() пробуждает один случайно выбранный поток из данного набора.
  Применение методов возможно у объекта только после установления блокировки (внутри synchronized-блока со ссылкой на этот объект
  в качестве аргумента, либо обращения к методам должны быть в синхронизированных методах класса самого объекта
*/
public class Test {

    public static void main(String s[]){
        //1. Приоритетность потоков
//        Test.priorityOfThreads();
        //2. Потоки-демоны
//        Test.daemonThreads();
        //3. Потоки обращаются к одним данным, непредсказуемость работы
//        ThreadTestWithoutSynchronization.execute();
        //4. Использование блокировок доступа к объекту - synchronized
//        Test.lockOfThreads();
        //5. Использование методов wait(), notify(), notifyAll() класса Object. Один поток
//        Test.waitNotifyMethods();
        //6. Использование методов wait(), notify(), notifyAll() класса Object для трех потоков
        Test.waitNotifyAllMethods();
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
     /* Все потоки находятся в группах, представляемых экземплярами класса ThreadGroup
                Группа указывается при создании потока. Если группа не была указана,
                то поток помещается в ту же группу, где находится поток, продивший его
        Методы ctiveCount() и enumerate() возвращают количество и полный список, соответственно, всех потоков в группе.
        */
    //Подготовка потоков
       new ThreadTestWithDaemons(16);
       new DaemonDemo();
    }

    public static void lockOfThreads(){
        for (int i=0; i<3; i++){
            new Thread(new ThreadTestSynchronized(), "Thread-" + i).start();
        }
    }

    public static void waitNotifyMethods(){
      Object o = new Object();
      WaitThread w = new WaitThread(o);
      new Thread(w).start();
      try{
          Thread.sleep(100);
      }catch (InterruptedException e) {}
      System.out.println("before notify");
        synchronized (o) {
            o.notifyAll();
        }
    }
    public static void waitNotifyAllMethods(){
        WaitThreeThread w1 = new WaitThreeThread(1);
        new Thread(w1).start();
        try{
            Thread.sleep(100);
        }catch (InterruptedException e) {}
        WaitThreeThread w2 = new WaitThreeThread(2);
        new Thread(w2).start();
        try{
            Thread.sleep(100);
        }catch (InterruptedException e) {}
        WaitThreeThread w3 = new WaitThreeThread(3);
        new Thread(w3).start();
        }
}
