package com.booxJ.chain_of_responsibility;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:59
 * @see:
 * @since:
 */
public class Test {

    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");

        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operator();
    }
}
