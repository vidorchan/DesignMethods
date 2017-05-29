package com.vidor.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vidor on 2017/5/29.
 * 工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。
 */
public class Builder {

    private List<ISend> list = new ArrayList<ISend>();

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new EmailSender());
        }
        System.out.println("produce sms");
    }

    public void produceEmailSender(int count) {
        for (int i=0; i < count; i++) {
            list.add(new EmailSender());
        }
        System.out.println("produce email");
    }
}
