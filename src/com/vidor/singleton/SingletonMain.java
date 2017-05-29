package com.vidor.singleton;

/**
 * Created by vidor on 2017/5/29.
 */
public class SingletonMain {
    public static void main(String[] args) {
        /**
        People p = People.getInstance();
        p.printInfo();
        **/
        LazyPeople p1 = LazyPeople.getInstance();
        p1.setName("test1");

        LazyPeople p2 = LazyPeople.getInstance();
        p2.setName("test2");

        p1.printInfo();
        p2.printInfo();

        if (p1 == p2) {
            System.out.println("same object");
        } else {
            System.out.println("not same object");
        }
    }
}