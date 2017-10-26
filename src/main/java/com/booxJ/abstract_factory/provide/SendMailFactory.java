package com.booxJ.abstract_factory.provide;

import com.booxJ.abstract_factory.sender.MailSender;
import com.booxJ.abstract_factory.sender.Sender;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:28
 * @see:
 * @since:
 */
public class SendMailFactory implements Provider {

    public Sender produce() {
        return new MailSender();
    }
}
