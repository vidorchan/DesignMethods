package com.vidor;

/**
 * Created by vidor on 2017/5/29.
 */
public class EmailFactory implements ISend{
    @Override
    public void send () {
        System.out.println("EmailFactory send messages...");
    }
}
