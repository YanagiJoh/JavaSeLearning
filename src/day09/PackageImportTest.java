package day09;

import day09.exer.Bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//import java.util.*;

import static java.lang.System.*;
import static java.lang.Math.*;

public class PackageImportTest {
    public static void main(String[] args) {

        String info = Arrays.toString(new int[]{1, 2, 3});

        Bank bank = new Bank();

        ArrayList list = new ArrayList();

        HashMap map = new HashMap();

        out.println("Hello!");//java.lang.*のクラスはimportを省略することができる

        Person p = new Person();

        Account acct = new Account(001,10000,0.123);

        day09.exer.Account acct1 = new day09.exer.Account(1000);

        long num = round(123.45);

    }
}
