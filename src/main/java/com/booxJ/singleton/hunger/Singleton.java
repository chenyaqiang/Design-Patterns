package com.booxJ.singleton.hunger;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:54
 * @see:
 * @since:
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    public Singleton(){}

    public Singleton getSingleton(){
        return instance;
    }
}
