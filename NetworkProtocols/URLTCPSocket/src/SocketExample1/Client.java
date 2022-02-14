package SocketExample1;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String args[]) {
        try {
            Socket s = new Socket("localhost", 3456);
            InputStream is = s.getInputStream();
            System.out.println("Read: " + is.read());
            s.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
