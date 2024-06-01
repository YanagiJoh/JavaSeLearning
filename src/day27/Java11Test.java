package day27;

import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import java.util.function.Consumer;

public class Java11Test {

    @Test
    public void test1(){

        System.out.println(" \t \t \n ".isBlank());

        System.out.println("-----" + "  \t abc \t \n ".strip() + "-----");
        System.out.println("-----" + "  \t abc \t \n ".trim() + "-----");
        System.out.println("-----" + "  \t abc \t \n ".stripLeading() + "-----");
        System.out.println("-----" + "  \t abc \t \n ".stripTrailing() + "-----");

        String str1 = "abc";
        String str2 = str1.repeat(5);
        System.out.println(str2);

        String str3 = "abc\nde\nfg";
        System.out.println(str3.lines().count());

    }

    @Test
    public void test2(){

        var op = Optional.empty();
        System.out.println(op.isPresent());
        System.out.println(op.isEmpty());

        op = Optional.of("abc");
        var obj = op.orElseThrow();
        System.out.println(obj);

        Optional<String> op1 = Optional.of("hello");
        //op = Optional.empty();
        Optional<Object> op2 = op.or(() -> op1);
        System.out.println(op2);

    }

    @Test
    public void test3(){

        Consumer<String> con = (@Deprecated var t) -> System.out.println(t.toUpperCase());

    }

    @Test
    public void test4(){

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create("http://127.0.0.1:8080/test/")).build();
            HttpResponse.BodyHandler<String> responseBodyHandler = HttpResponse.BodyHandlers.ofString();
            HttpResponse<String> response = client.send(request, responseBodyHandler);
            String body = response.body();
            System.out.println(body);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
