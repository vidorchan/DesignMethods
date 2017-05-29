package com.vidor.builder;

import com.vidor.builder.ISend;

/**
 * Created by vidor on 2017/5/29.
 */
public class EmailSender implements ISend{
    @Override
    public void send () {
        System.out.println("EmailSender send messages...");
    }
}
