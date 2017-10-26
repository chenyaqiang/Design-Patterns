package com.booxJ.chain_of_responsibility;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:54
 * @see:
 * @since:
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
