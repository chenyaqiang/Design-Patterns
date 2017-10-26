package com.booxJ.chain_of_responsibility;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:55
 * @see:
 * @since:
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + " deal!");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
