package com.booxJ.adapter;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 11:25
 * @see:
 * @since:
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    public void method1() {
        source.method1();
    }

    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
