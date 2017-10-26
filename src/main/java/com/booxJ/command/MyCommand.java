package com.booxJ.command;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 14:01
 * @see:
 * @since:
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void exe() {
        receiver.action();
    }
}
