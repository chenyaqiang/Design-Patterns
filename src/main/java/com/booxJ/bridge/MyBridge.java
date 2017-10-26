package com.booxJ.bridge;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:05
 * @see:
 * @since:
 */
public class MyBridge extends Bridge {

    public void method(){
        getSource().method();
    }
}
