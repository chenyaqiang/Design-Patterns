package com.booxJ.factory.normal;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:13
 * @see:
 * @since:
 */
public class MailSender implements Sender {

    public void Send() {
        System.out.println("this is mailsender!");
    }
}
