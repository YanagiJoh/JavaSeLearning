package day14;

import day12.Man;

interface Filial {

    default void help() {
        System.out.println("母さん、今から助けに行きます!");
    }

}

interface Sponny {

    default void help() {
        System.out.println("嫁、今から助けに行きます!");
    }

}

class Father {
    public void help(){
        System.out.println("息子、俺の嫁を救え!");
    }
}

class Me extends Father implements Filial, Sponny {

    @Override
    public void help() {
        System.out.println("誰を救うべきですか?");
        Filial.super.help();
        Sponny.super.help();
    }

}
