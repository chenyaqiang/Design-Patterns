package com.booxJ.observer;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:34
 * @see:
 * @since:
 */
public class MySubject extends AbstractSubject  {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
