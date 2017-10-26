package com.booxJ.abstract_factory.provide;

import com.booxJ.abstract_factory.sender.Sender;
import com.booxJ.abstract_factory.sender.SmsSender;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:29
 * @see:
 * @since:
 */
public class SendSmsFactory implements Provider {
    public Sender produce() {
        return new SmsSender();
    }
}
