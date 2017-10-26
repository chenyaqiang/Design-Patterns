package com.booxJ.observer;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 13:35
 * @see:
 * @since:
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
