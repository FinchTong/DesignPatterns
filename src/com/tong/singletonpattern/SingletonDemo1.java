package com.tong.singletonpattern;

/**
 * 懒汉，线程不安全
 *
 * @author tong
 */
public class SingletonDemo1 {

    private static SingletonDemo1 singletonDemo1;


    private SingletonDemo1() {
    }

    public static SingletonDemo1 getSingletonDemo1() {
        if (singletonDemo1 == null) {
            singletonDemo1 = new SingletonDemo1();
        }
        return singletonDemo1;
    }
}
