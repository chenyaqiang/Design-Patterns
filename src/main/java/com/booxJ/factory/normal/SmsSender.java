package com.booxJ.factory.normal;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:16
 * @see:
 * @since:
 */
public class SmsSender implements Sender {
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
