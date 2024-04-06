package day25;

import java.io.Serializable;

public class Creature<T> implements Serializable {

    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物が呼吸する");
    }

    public void eat(){
        System.out.println("生物が食べる");
    }

}
