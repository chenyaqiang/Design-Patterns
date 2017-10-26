package com.booxJ.observer;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:32
 * @see:
 * @since:
 */
public interface Subject {

    /*增加观察者*/
    public void add(Observer observer);

    /*删除观察者*/
    public void del(Observer observer);

    /*通知所有的观察者*/
    public void notifyObservers();

    /*自身的操作*/
    public void operation();
}
