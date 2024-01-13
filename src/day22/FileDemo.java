package day22;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    @Test
    public void test1() throws IOException {

        File file = new File("C:\\io\\io1\\hello.txt");
        File destFile = new File(file.getParent(), "haha.txt");
        boolean newFile = destFile.createNewFile();
        if (newFile) {
            System.out.println("作成成功!");
        }

    }
}
