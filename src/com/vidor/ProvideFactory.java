package com.vidor;

/**
 * Created by vidor on 2017/5/29.
 */
public class ProvideFactory implements IProvider {
    @Override
    public ISend provideEmail () {
        return new EmailFactory();
    }
    @Override
    public ISend provideSms () {
        return new SmsFactory();
    }

    @Override
    public ISend provideNew () {
        return new newFactory();
    }
}
