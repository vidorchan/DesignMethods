package com.vidor.builder;

import com.vidor.abstractFactory.ISend;

/**
 * Created by vidor on 2017/5/29.
 */
public class SmsSender implements ISend {

    public SmsSender() {

    }

    @Override
    public void send () {
        System.out.print("SmsSender send messages...");
    }
}
