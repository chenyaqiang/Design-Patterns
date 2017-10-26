package com.booxJ.decorator;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 12:50
 * @see:
 * @since:
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
