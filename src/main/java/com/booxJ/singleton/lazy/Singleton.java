package com.booxJ.singleton.lazy;

/**
 * @description:
 * @author: wb
 * @data: 2017/10/24 10:37
 * @see:
 * @since:
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }


    /**
     * 在Java指令中创建对象和赋值操作是分开进行的
     * 单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的
     */
    private static class SingletonFactory{

        private static Singleton instance = new Singleton();

        public static Singleton getInstance(){
            return SingletonFactory.instance;
        }

        public Object readResolve() {
            return getInstance();
        }
    }
}
