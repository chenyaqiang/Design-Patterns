package com.booxJ.factory.static_method;

import com.booxJ.factory.normal.MailSender;
import com.booxJ.factory.normal.Sender;
import com.booxJ.factory.normal.SmsSender;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:23
 * @see:
 * @since:
 */
public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
