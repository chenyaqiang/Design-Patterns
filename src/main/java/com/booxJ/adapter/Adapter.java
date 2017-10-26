package com.booxJ.adapter;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 11:21
 * @see:
 * @since:
 */
public class Adapter extends Source implements Targetable {

    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
