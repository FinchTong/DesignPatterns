package com.tong.singletonpattern;

/**
 * ����
 * �����˶��̵߳�ͬ�����⣬instance����װ��ʱʵ����
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
