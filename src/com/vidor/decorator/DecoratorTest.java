package com.vidor.decorator;

/**
 * Created by vidor on 2017/5/29.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable decorator = new Decorator(source);
        decorator.method();
    }
}
