package com.booxJ.abstract_factory.sender;


/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:30
 * @see:
 * @since:
 */
public class SmsSender implements Sender {
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
