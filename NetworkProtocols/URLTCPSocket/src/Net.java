/*
Классы, работающие с сетевыми протоколами, располагаются в пакете java.net. Простейшим из них является класс URL.
С его помощью можно сконструировать uniform resource locator (URL), который имеет следующий формат:
protocol://host:port/resource
protocol - название протокола, используемого для связи
host - IP-адрес, или DNS-имя сервера, к которому производится обращение
port - номер порта сервера
resource - имя запрашиваемого ресурса

Затем можно воспользваться методом openStream(), который возвращает InputStream, что позволяет считать содержимое ресурса.
Данная программа при помощи LineNumberReader считывает первую страницу сайта http://www.ru и выподит ее в консоль.

Более функциональным классом являентся URLConnection, который можно получить с помощью метода класса URL.openConnection().
У этого класса есть два метода - getInputStream() (именно с его помощью работает URL.openStream()) и getOutputStream(),
который можно использовать для передачи данных на сервер, если он поддерживает такую операцию.
*/

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Net {
    public static void main(String args[]){
        try{
            URL url = new URL("http://www.ru");
            LineNumberReader r = new LineNumberReader(new InputStreamReader(url.openStream()));
            String s = r.readLine();
            while (s!=null){
                System.out.println(s);
                s = r.readLine();
            }
            System.out.println(r.getLineNumber());
            r.close();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
