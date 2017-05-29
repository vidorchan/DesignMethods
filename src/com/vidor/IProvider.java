package com.vidor;

/**
 * Created by vidor on 2017/5/29.
 */
public interface IProvider {
    public ISend provideEmail();
    public ISend provideSms();
    public ISend provideNew();
}
