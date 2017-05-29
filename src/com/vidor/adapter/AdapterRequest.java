package com.vidor.adapter;

/**
 * Created by vidor on 2017/5/29.
 */
public class AdapterRequest extends Request implements SpecifiedIRequest{

    @Override
    public void specifiedRequest() {
        System.out.println("send a specified request...");
    }
}
