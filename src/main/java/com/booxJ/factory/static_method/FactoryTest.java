package com.booxJ.factory.static_method;

import com.booxJ.factory.normal.Sender;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:24
 * @see:
 * @since:
 */
public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }
}
