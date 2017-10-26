package com.booxJ.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:33
 * @see:
 * @since:
 */
public abstract class AbstractSubject implements Subject{

    private Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }
}
