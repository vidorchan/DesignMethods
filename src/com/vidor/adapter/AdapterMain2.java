package com.vidor.adapter;

/**
 * Created by vidor on 2017/5/29.
 *
 */
public class AdapterMain2 {
    public static void main(String[] args) {
        Request request = new Request();
        SpecifiedIRequest sr = new AdapterRequest2(request);
        sr.request();
        sr.specifiedRequest();
    }
}
