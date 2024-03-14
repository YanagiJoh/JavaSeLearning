package day24;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessFileTest {

    @Test
    public void test1() {

        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("ドラえもん２.jpg"), "r");
            raf2 = new RandomAccessFile(new File("ドラえもん５.jpg"), "rw");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = raf1.read(buffer)) != -1) {
                raf2.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (raf2 != null) {
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test2() throws IOException {

        RandomAccessFile raf1 = new RandomAccessFile("hello4.txt", "rw");
        raf1.seek(3);
        raf1.write("xyz".getBytes());
        raf1.close();

    }

    @Test
    public void test3() throws IOException {

        RandomAccessFile raf1 = new RandomAccessFile("hello4.txt", "rw");
        raf1.seek(3);

        StringBuilder builder = new StringBuilder((int) new File("hello4.txt").length());
        byte[] buffer = new byte[20];
        int len;
        while ((len = raf1.read(buffer)) != -1) {
            builder.append(new String(buffer, 0, len));
        }

        raf1.seek(3);
        raf1.write("xyz".getBytes());
        raf1.write(builder.toString().getBytes());

        raf1.close();
    }

}
