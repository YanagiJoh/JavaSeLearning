package day24;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

    public static void main(String[] args) {

        try {

            URL url = new URL("https://www.starbucks.co.jp/cafe/hanami-matcha/?utm_medium=store&utm_source=wi-fi&utm_campaign=official&utm_content=cafe_20240228");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getPath());
            System.out.println(url.getFile());
            System.out.println(url.getQuery());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
