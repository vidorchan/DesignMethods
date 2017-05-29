package com.vidor;

/**
 * Created by vidor on 2017/5/29.
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        IProvider provide = new ProvideFactory();
        ISend sendF = provide.provideEmail();
        sendF.send();

        //Add a new type message sender
        ISend sendN = provide.provideNew();
        sendN.send();
    }
}