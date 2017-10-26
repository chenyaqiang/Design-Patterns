package com.booxJ.factory.muti;

import com.booxJ.factory.normal.Sender;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:21
 * @see:
 * @since:
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}
