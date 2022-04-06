package com.tong.decorator;


/**
 *
 * 装饰器模式
 *
 * 定义：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式。
 *
 * 优点：
 * 装饰器是继承的有力补充，比继承灵活，在不改变原有对象的情况下，动态的给一个对象扩展功能，即插即用
 * 通过使用不用装饰类及这些装饰类的排列组合，可以实现不同效果
 * 装饰器模式完全遵守开闭原则
 *
 * 缺点：装饰器模式会增加许多子类，过度使用会增加程序得复杂性。
 *
 * 应用场景
 * 当需要给一个现有类添加附加职责，而又不能采用生成子类的方法进行扩充时。例如，该类被隐藏或者该类是终极类或者采用继承方式会产生大量的子类。
 * 当需要通过对现有的一组基本功能进行排列组合而产生非常多的功能时，采用继承关系很难实现，而采用装饰器模式却很好实现。
 * 当对象的功能要求可以动态地添加，也可以再动态地撤销时。
 *
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Component component = new ConreteDecorator1(new ConreteDecorator2(new ConcreteComponent()));
        component.operation();

    }

}

interface Component {
    void operation();
}
class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("拍照");
    }
}

abstract class Decorator implements Component {
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}

class ConreteDecorator1 extends Decorator {

    public ConreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("添加美颜");
        component.operation();
    }
}

class ConreteDecorator2 extends Decorator {

    public ConreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("增加滤镜");
        component.operation();
    }
}
