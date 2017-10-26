package com.booxJ.command;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 14:02
 * @see:
 * @since:
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
