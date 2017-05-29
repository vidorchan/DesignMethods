package com.vidor.singleton;

/**
 * Created by vidor on 2017/5/29.
 * 饿汉单例模式，线程安全
 */
public class People {
    private static People ourInstance = new People();

    public static People getInstance() {
        return ourInstance;
    }

    private People() {
    }

    public void printInfo() {
        System.out.println("create a singleton people");
    }
}
