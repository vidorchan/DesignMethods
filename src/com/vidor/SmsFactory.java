package com.vidor;

/**
 * Created by vidor on 2017/5/29.
 */
public class SmsFactory implements ISend{
    @Override
    public void send () {
        System.out.print("SmsFactory send messages...");
    }
}
