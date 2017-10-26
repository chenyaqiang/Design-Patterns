package com.booxJ.factory.normal;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:18
 * @see:
 * @since:
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}
