package com.booxJ.command;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 14:04
 * @see:
 * @since:
 */
public class Test {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }

}
