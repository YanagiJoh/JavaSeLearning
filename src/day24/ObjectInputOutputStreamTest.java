package day24;

import org.junit.Test;

import java.io.*;

public class ObjectInputOutputStreamTest {

    @Test
    public void testObjectOutputStream() {

        ObjectOutputStream oos = null;
        try {

            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));

            oos.writeObject(new String("東京タワーが好き"));
            oos.flush();

            oos.writeObject(new Person("楊", 32));
            oos.flush();

            oos.writeObject(new Person("楊", 32, 1001, new Account(99999.9)));
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    @Test
    public void testObjectInputStream() {

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj = ois.readObject();
            String str = (String) obj;
            System.out.println(str);

            Person p = (Person) ois.readObject();
            System.out.println(p);

            Person p1 = (Person) ois.readObject();
            System.out.println(p1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
