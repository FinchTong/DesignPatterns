package com.tong.templatemethod;

/**
 * ������
 *
 * @author finch
 * @date 2018/2/6
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();

        //����ģ�巽��
        class1.templateMethod();
        class2.templateMethod();
    }

}
