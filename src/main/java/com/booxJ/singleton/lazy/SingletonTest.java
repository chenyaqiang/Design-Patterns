package com.booxJ.singleton.lazy;

/**
 * @description:为了防止构造函数抛出异常，将创建和getInstance()分开，单独为创建加synchronized关键
 * @author: wb
 * @data: 2017/10/24 10:57
 * @see:
 * @since:
 */
public class SingletonTest {

    private static SingletonTest instance = null;

    private SingletonTest() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
