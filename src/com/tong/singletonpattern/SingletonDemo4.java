package com.tong.singletonpattern;

/**
 * 饿汉变种
 * 避免了多线程的同步问题，instance在类装载时实例化
 *
 * @author tong
 */
public class SingletonDemo4 {

    private static SingletonDemo4 singletonDemo4 = null;

    static {
        singletonDemo4 = new SingletonDemo4();
    }

    private SingletonDemo4() {

    }

    public static SingletonDemo4 getSingletonDemo4() {
        return singletonDemo4;
    }
}
