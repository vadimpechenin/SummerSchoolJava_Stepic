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
        Test.lockOfThreads();
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
}
