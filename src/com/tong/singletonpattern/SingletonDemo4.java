package com.tong.singletonpattern;

/**
 * ��������
 * �����˶��̵߳�ͬ�����⣬instance����װ��ʱʵ����
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
