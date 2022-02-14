/*
Пакет java.net предоставляет доступ к протоколам более низкого уровня - TCP и UDP
Для этого сначала нужно ознакомится с классом ItenAddress, который является Internet-адресом, или IP. Экземпляры
этого класса создаются не с помощью конструкторов, а с помощью статческих методов:

InetAddress getLocalHost()
InetAddress getByName(String name)
InetAddress[] getAllByName(String name)

Первый метод возвращает IP-адрес машины, на которой исполняется java-программа.
 Второй метод возвращает адрес сервера, чье имя передается в качестве параметра.
Это может быть как DNS-имя, так и числовой IP, записанный в виде текста, например, "67.11.12.101".
Наконец, третий метод определяет все IP-адреса указанного сервера.

2. Для работы с TCP протоколом используются классы ServerSocket и Socket.
Первым создается ServerSocket - сокет на стороне сервера. Его простейший конструктор имеет только один праметр - номер порта,
на котором будут приниматься входящие запросы. После создания вызывается метод accept(), который приостанавливает выполнение программы и ожидает,
пока какой-нибудь клиент не инициирует соединение. В этом случае работа сервера возобновляется, а метод возвращает экземпляр класса Socket для взаимодействия с клиентом.

Клиент для подключения к серверу также использует класс Socket. Его простейший конструктор принимает два параметра -
адрес сервера (в виде строки, или экземпляра InetAddress) и номер порта. Если сервер принял запрос, то сокет конструируется успешно и далее
можно воспользвоаться методами getInputStream() или getOutputStream().


3. Сервер по запросу клиента отправляет число 10 и завершает работу.
 */

package SocketExample1;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]){
        try{
            ServerSocket ss = new ServerSocket(3456);
            System.out.println("Waiting...");
            Socket client = ss.accept();
            System.out.println("Connected");
            client.getOutputStream().write(10);
            client.close();
            ss.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
