package com.booxJ.decorator;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 12:49
 * @see:
 * @since:
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
