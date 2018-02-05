package com.tong.singletonpattern;

/**
 * �������̲߳���ȫ
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
