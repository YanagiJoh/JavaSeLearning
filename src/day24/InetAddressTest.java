package day24;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

    public static void main(String[] args) {

        InetAddress inet1 = null;
        InetAddress inet2 = null;
        InetAddress inet3 = null;
        InetAddress inet4 = null;
        try {
            inet1 = InetAddress.getByName("192.168.10.14");
            System.out.println(inet1);

            inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);

            inet3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet3);

            inet4 = InetAddress.getLocalHost();
            System.out.println(inet4);

            System.out.println(inet2.getHostName());
            System.out.println(inet2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
