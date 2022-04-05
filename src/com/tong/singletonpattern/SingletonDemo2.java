package com.tong.singletonpattern;

/**
 * 懒汉，线程安全
 *
 * @author tong
 */
public class SingletonDemo2 {

    private static SingletonDemo2 singletonDemo2;

    private SingletonDemo2() {
    }

    public static synchronized SingletonDemo2 getSingletonDemo2() {
        if (singletonDemo2 == null) {
            singletonDemo2 = new SingletonDemo2();
        }
        return singletonDemo2;
    }

}
