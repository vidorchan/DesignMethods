package com.vidor.builder;

/**
 * Created by vidor on 2017/5/29.
 */
public class BuilderMain {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceSmsSender(10);
    }
}
