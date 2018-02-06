package com.tong.templatemethod;

/**
 * ����ģ����
 *
 * @author finch
 * @date 2018/2/6
 */
public abstract class AbstractClass {

    /**
     * ��������
     */
    protected abstract void doSomething();

    /**
     * ��������
     */
    protected abstract void doAnything();

    public void templateMethod() {
        /*
        ���û��������������ص��߼�
         */
        this.doAnything();
        this.doSomething();
    }

}
