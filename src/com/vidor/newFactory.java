package com.vidor;

/**
 * Created by vidor on 2017/5/29.
 */
public class newFactory implements ISend {
    @Override
    public void send() {
        System.out.println("new Factory send message ...");
    }
}
