package com.tong.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 观察者模式
 *
 * 定义：指多个对象间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 *
 * 优点：
 * 降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。符合依赖倒置原则。
 * 目标与观察者之间建立了一套触发机制。
 *
 * 缺点：
 * 目标与观察者之间的依赖关系并没有完全解除，而且有可能出现循环引用。
 * 当观察者对象很多时，通知的发布会花费很多时间，影响程序的效率。
 *
 *
 * 应用场景
 * 对象间存在一对多关系，一个对象的状态发生改变会影响其他对象。
 * 当一个抽象模型有两个方面，其中一个方面依赖于另一方面时，可将这二者封装在独立的对象中以使它们可以各自独立地改变和复用。
 * 实现类似广播机制的功能，不需要知道具体收听者，只需分发广播，系统中感兴趣的对象会自动接收该广播。
 * 多层级嵌套使用，形成一种链式触发机制，使得事件具备跨域（跨越两种观察者类型）通知。
 *
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Task1 task1 = new Task1();
        subject.addObserver(task1);
        Task1 task11 = new Task1();
        subject.addObserver(task11);

        subject.notifyObserver("XXXXXXXX");
    }

}

class Subject {
    List<Observer> container = new ArrayList<>();

    public void addObserver(Observer observer) {
        container.add(observer);
    }

    public void remove(Observer observer) {
        container.remove(observer);
    }

    public void notifyObserver(Object object) {
        for (Observer item : container) {
            item.update(object);
        }
    }

}

interface Observer {
    void update(Object object);
}

class Task1 implements Observer {

    @Override
    public void update(Object object) {
        System.out.println("received: " + object);
    }
}



















