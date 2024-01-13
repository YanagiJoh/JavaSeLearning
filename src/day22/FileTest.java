package day22;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

    @Test
    public void test1() {

        File file1 = new File("hello.txt");
        File file2 = new File("C:\\Users\\楊　盛\\IdeaProjects\\JavaSeLearning\\hello.txt");

        System.out.println(file1);
        System.out.println(file2);

        File file3 = new File("C:\\Users\\楊　盛\\IdeaProjects", "JavaSeLearning");
        System.out.println(file3);

        File file4 = new File(file3, "hello.txt");
        System.out.println(file4);

    }

    @Test
    public void test2() {

        File file1 = new File("hello.txt");
        File file2 = new File("C:\\io\\hi.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println();

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());

    }

    @Test
    public void test3() {

        File file = new File("C:\\Users\\楊　盛\\IdeaProjects\\JavaSeLearning");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }

    }

    @Test
    public void test4() {

        File file1 = new File("hello.txt");
        File file2 = new File("C:\\io\\hi.txt");

        boolean renameTo = file2.renameTo(file1);
        System.out.println(renameTo);

    }

    @Test
    public void test5() {

        File file1 = new File("hello.txt");
        file1 = new File("hello1.txt");

        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());

        System.out.println();

        File file2 = new File("C:\\io");
        file2 = new File("C:\\io1");

        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());

    }

    @Test
    public void test6() throws IOException {

        File file = new File("hi.txt");

        if (!file.exists()) {
            file.createNewFile();
            System.out.println("新規作成完了");
        } else {
            file.delete();
            System.out.println("削除完了");
        }

    }

    @Test
    public void test7() {

        File file1 = new File("C:\\io\\io1\\io3");
        boolean mkdir = file1.mkdir();
        if (mkdir) {
            System.out.println("作成完了1");
        }

        File file2 = new File("C:\\io\\io1\\io4");
        boolean mkdir1 = file2.mkdirs();
        if (mkdir1) {
            System.out.println("作成完了2");
        }

        File file3 = new File("C:\\io\\io1\\io4");
        file3 = new File("C:\\io\\io1");
        System.out.println(file3.delete());

    }

}
