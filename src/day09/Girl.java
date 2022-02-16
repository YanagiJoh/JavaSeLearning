package day09;

public class Girl {

    private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy) {

        System.out.println(boy.getName() + "と結婚したい");
        boy.marry(this);

    }

    public int compare(Girl girl) {

        if (this.age > girl.age) {
            return 1;
        } else if (this.age < girl.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
