package com.booxJ.factory.muti;

import com.booxJ.factory.normal.MailSender;
import com.booxJ.factory.normal.Sender;
import com.booxJ.factory.normal.SmsSender;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:19
 * @see:
 * @since:
 */
public class SendFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
