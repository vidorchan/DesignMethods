package com.vidor.adapter;

/**
 * Created by vidor on 2017/5/29.
 *
 */
public class AdapterMain3 {
    public static void main(String[] args) {
        SpecifiedIRequest sr = new Adapter3();
        sr.request();
        sr.specifiedRequest();
    }
}
