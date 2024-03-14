package day23;

import org.junit.Test;

import java.io.*;

public class FileReaderWriterTest {

    @Test
    public void testFileReader() {

        FileReader fr = null;

        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);

//        int data = fr.read();
//        while (data != -1){
//            System.out.print((char) data);
//            data = fr.read();
//        }

            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            try {
//                if (fr != null)
//                    fr.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("hello1.txt");
        System.out.println(file.getAbsolutePath());

        File file1 = new File("day23\\hello1.txt");
        System.out.println(file1.getAbsolutePath());
    }

    @Test
    public void testFileReader1() {

        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
//                for (int i = 0; i < cbuf.length ; i++) {
//                    System.out.print(cbuf[i]);
//                }

//                for (int i = 0; i < len ; i++) {
//                    System.out.print(cbuf[i]);
//                }

//                String str = new String(cbuf);
//                System.out.print(str);

                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void testFileWriter() {

        FileWriter fw = null;
        try {
            File file = new File("hello1.txt");

            fw = new FileWriter(file);

            fw.write("I have a dream!\n");
            fw.write("you need to have a dream!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    @Test
    public void testFileReaderWriter() {

        FileReader fr = null;
        FileWriter fw = null;
        try {
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

//            try {
//                if (fw != null)
//                    fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    if (fr != null)
//                        fr.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }

        }

    }
}
