package com.vidor.adapter;

/**
 * Created by vidor on 2017/5/29.
 */
public class AdapterRequest2 implements SpecifiedIRequest{

    public Request request;

    public AdapterRequest2(Request request) {
        this.request = request;
    }

    @Override
    public void request() {
        System.out.println("send a request...");
    }

    @Override
    public void specifiedRequest() {
        System.out.println("send a specified request...");
    }
}
