package com.booxJ.factory.normal;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:17
 * @see:
 * @since:
 */
public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }

    }
}
