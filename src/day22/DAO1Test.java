package day22;

import java.util.List;

public class DAO1Test {

    public static void main(String[] args) {

        DAO1<User> dao = new DAO1<>();
        dao.save("1001",new User(1001,34,"JayZhou"));
        dao.save("1002",new User(1002,20,"KunLing"));
        dao.save("1003",new User(1003,25,"Caiyilin"));

        dao.update("1003",new User(1003,30,"Fangwenshan"));
        dao.delete("1002");

        List<User> list = dao.list();
        list.forEach(System.out::println);

    }
}
