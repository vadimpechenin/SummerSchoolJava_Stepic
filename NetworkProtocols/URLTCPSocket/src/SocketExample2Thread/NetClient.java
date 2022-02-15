/*
Теперь объявим клиента. Эта программа будет запускать несколько потоков, каждый и з которых независимо подключается к серверу, считвает его ответ и выводит на консоль
 */

package SocketExample2Thread;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetClient implements Runnable{
    public static final int PORT = 2500;
    public static final String HOST = "localhost";
    public static final int CLIENTS_COUNT = 5;
    public static final int READ_BUFFER_SIZE = 10;

    private String name = null;

    public static void main(String[] args){
        String name = "name";
        for (int i=1; i<=CLIENTS_COUNT; i++){
            NetClient client = new NetClient(name+i);
            Thread thread = new Thread(client);
            thread.start();
        }
    }

    public NetClient(String name){
        this.name = name;
    }

    public void run(){
        char[] readed = new char[READ_BUFFER_SIZE];
        StringBuffer strBuff = new StringBuffer();
        try{
            Socket socket = new Socket(HOST, PORT);
            InputStream in = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(in);
            while (true){
                int count = reader.read(readed, 0, READ_BUFFER_SIZE);
                if (count==-1) break;
                strBuff.append(readed, 0, count);
                Thread.yield();
            }
        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("client" + name + "read:" + strBuff.toString());
    }

}
