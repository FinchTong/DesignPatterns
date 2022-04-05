package com.tong.singletonpattern;

/**
 * 饿汉
 * 避免了多线程的同步问题，instance在类装载时实例化
 *
 * @author tong
 */
public class SingletonDemo3 {

    private static SingletonDemo3 singletonDemo3 = new SingletonDemo3();

    private SingletonDemo3() {

    }

    public static SingletonDemo3 getSingletonDemo3() {
        return singletonDemo3;
    }

}
