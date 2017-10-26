package com.booxJ.abstract_factory;

import com.booxJ.abstract_factory.provide.Provider;
import com.booxJ.abstract_factory.provide.SendMailFactory;
import com.booxJ.abstract_factory.sender.Sender;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:34
 * @see:
 * @since:
 */
public class Test {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
