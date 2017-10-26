package com.booxJ.builder;

import com.booxJ.factory.normal.MailSender;
import com.booxJ.factory.normal.Sender;
import com.booxJ.factory.normal.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 11:02
 * @see:
 * @since:
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for (int i=0;i<count;i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}
