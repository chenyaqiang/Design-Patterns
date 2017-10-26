package com.booxJ.observer;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:32
 * @see:
 * @since:
 */
public class Observer1 implements Observer {
    
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
