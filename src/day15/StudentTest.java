package day15;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.regist(-1001);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Student{
    private int id;

    public void regist(int id)throws Exception{
        if(id > 0){
            this.id = id;
        }else{
            //System.out.println("入力したデータが正しくない");
            //throw new RuntimeException("入力したデータが正しくない");
            //throw new Exception("入力したデータが正しくない");
            throw new MyException("負数を入力できません");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
