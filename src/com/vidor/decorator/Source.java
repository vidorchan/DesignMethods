package com.vidor.decorator;

/**
 * Created by vidor on 2017/5/29.
 */
public class Source implements Sourceable{

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
