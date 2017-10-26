package com.booxJ.state;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 14:08
 * @see:
 * @since:
 */
public class State {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("execute the first opt!");
    }

    public void method2(){
        System.out.println("execute the second opt!");
    }
}
