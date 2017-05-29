package com.vidor.singleton;

/**
 * Created by vidor on 2017/5/29.
 * 懒汉单例模式
 */
public class LazyPeople {

    private String name = null;
    private static LazyPeople ourInstance = null;

    private static final class LazyHandler {
        private static final LazyPeople INTANCE = new LazyPeople();
    }

    public static final LazyPeople getInstance() {
        return LazyHandler.INTANCE;
    }

    private LazyPeople() {
    }

    /**
    public static synchronized LazyPeople getInstance() {
        if (ourInstance == null) {
            ourInstance = new LazyPeople();
        }
        return ourInstance;
    }

    public static LazyPeople getInstance() {
        if (ourInstance == null) {
            synchronized (Singleton.class) {
                if (ourInstance == null) {
                    ourInstance = new LazyPeople();
                }
            }
        }
        return ourInstance;
    }
    **/

    public void printInfo() {
        System.out.println("create a lazy singleton people and name = " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
