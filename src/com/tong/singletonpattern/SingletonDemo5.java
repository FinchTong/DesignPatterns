package com.tong.singletonpattern;

/**
 * 静态内部类
 * 只有在调用getSingletonDemo5()方法时才会初始化类
 *
 * @author tong
 */
public class SingletonDemo5 {

    private static class SingletonHolder {
        private static final SingletonDemo5 singletonDemo = new SingletonDemo5();
    }

    private SingletonDemo5() {

    }

    public static SingletonDemo5 getSingletonDemo5() {
        return SingletonHolder.singletonDemo;
    }

}
