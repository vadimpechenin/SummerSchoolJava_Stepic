/*
Для работы с протоколом UDP на стороне клиента и на стороне сервера используется класс DatagramSocket.
У него есть следующие конструкторы.

DatagramSocket() - сокет открывается на произвольном доступном порту, что уместно для клиента
DatagramSocket(int port) - как правило применяется на серверах, чтобы клиенты знали,
на каком порту им нужно пытаться устанавливать соединение
DatagramSocket(int port, InetAddress laddr) - для машин с несколькими сетевыми интерфейсами

2. После открытия сокетов начинается обмен датаграммами. Они представляются экземплярами класса DatagramPacket.
При отсылке сообщения применяется следующий конструктор:

DatagramPacket(byte[] buf, int length, InetAddress address, int port)

Массив содержит данные для отправки (созданный пакет будет иметь длину, равную length), а адрес и порт указывают получателя пакета.

3. После этого вызывается метод send() класса DatagramSocket

4. Для получения датаграммы также создается экземпляр класса DatagramPacket, но в конструктор передается лишь
массив, в который будут записаны полученные данные (так же указывается ожидаемая длина пакета).
Сокет необходимо создать с указанием порта, иначе, скорее вего, сообщение просто не дойдет до адресата.

Используется метод receive() класса DatagramSocket (аналогично методу ServerSocket.accept(), этот метод так же прерывает
выполнение потока, пока не придет запрос от клиента).


Если запустить сначала получателя, а затем отправителя, то можно увидеть,
что первый напечатает содержимое полученной датаграммы, а потом программы завершат свою работу.

3. Пример сервера, который получает датаграммы и отправляет их обратно, дописав к ним слово received.
 */

package SocketExample3UDP;

import java.io.*;
import java.net.*;

public class DatagramDemoServer {
    public static final int PORT=3456;
    private static final int LENGTH_RECEIVE = 1;
    private static final byte[] answer = ("received").getBytes();
    private DatagramSocket servSocket = null;
    private boolean keepRunning = true;
    public static void main(String[] args){
        DatagramDemoServer server = new DatagramDemoServer();
        server.service();
    }

    public DatagramDemoServer(){
        try{
            servSocket = new DatagramSocket(PORT);
        }catch(SocketException e){
            System.err.println("Unable to open socket: " + e.toString());
        }
    }

    protected void service(){
        DatagramPacket datagram;
        InetAddress clientAddr;
        int clientPort;
        byte[] data;
        while (keepRunning){
            try{
                data = new byte[LENGTH_RECEIVE];
                datagram = new DatagramPacket(data, data.length);
                servSocket.receive(datagram);
                clientAddr = datagram.getAddress();
                clientPort = datagram.getPort();
                data = getSendData(datagram.getData());
                datagram = new DatagramPacket(data, data.length, clientAddr, clientPort);
                servSocket.send(datagram);
            }catch(IOException e){
                System.err.println("I/O Exception: " + e.toString());
            }
        }
    }

    protected byte[] getSendData(byte b[]){
        byte[] result = new byte[b.length + answer.length];
        System.arraycopy(b, 0, result, 0, b.length);
        System.arraycopy(answer, 0, result, b.length, answer.length);
        return result;
    }
}
