package com.tong.adapter.v1;

/**
 * object adapter
 * 对象适配器模式
 *
 * 适配器模式（Adapter）的定义如下：
 * 将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作
 *
 * 应用场景:
 * 以前开发的系统存在满足新系统功能需求的类，但其接口同新系统的接口不一致。
 * 使用第三方提供的组件，但组件接口定义和自己要求的接口定义不同。
 *
 * 优点:
 * 客户端通过适配器可以透明地调用目标接口。
 * 复用了现存的类，程序员不需要修改原有代码而重用现有的适配者类。
 * 将目标类和适配者类解耦，解决了目标类和适配者类接口不一致的问题。
 * 在很多业务场景中符合开闭原则。
 *
 * 缺点：
 * 适配器编写过程需要结合业务场景全面考虑，可能会增加系统的复杂性。
 * 增加代码阅读难度，降低代码可读性，过多使用适配器会使系统代码变得凌乱。
 *
 */
public class AdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.output5v();
    }
}

class Adaptee {
    public int output220v() {
        return 220;
    }
}

interface Target{
    int output5v();
}

class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int output5v() {
        int i = adaptee.output220v();
        //......
        System.out.println("转换电压为5v");
        return 5;
    }
}


