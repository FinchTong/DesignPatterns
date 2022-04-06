package com.tong.facade;

/**
 *
 * 外观模式（门面模式）
 *
 * 定义：一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。该模式对外有一个统一接口，外部应用程序不用关心内部子系统的具体细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。
 *
 * 优点：
 * 降低了子系统与客户端之间的耦合度，使得子系统的变化不会影响调用它的客户类。
 * 对客户屏蔽了子系统组件，减少了客户处理的对象数目，并使得子系统使用起来更加容易。
 * 降低了大型软件系统中的编译依赖性，简化了系统在不同平台之间的移植过程，因为编译一个子系统不会影响其他的子系统，也不会影响外观对象。
 *
 * 缺点：
 * 不能很好地限制客户使用子系统类，很容易带来未知风险。
 * 增加新的子系统可能需要修改外观类或客户端的源代码，违背了“开闭原则”。
 *
 * 应用场景：
 * 对分层结构系统构建时，使用外观模式定义子系统中每层的入口点可以简化子系统之间的依赖关系。
 * 当一个复杂系统的子系统很多时，外观模式可以为系统设计一个简单的接口供外界访问。
 * 当客户端与多个子系统之间存在很大的联系时，引入外观模式可将它们分离，从而提高子系统的独立性和可移植性。
 *
 */
public class FacadeTest {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doSomeThing();
    }

}

class Facade {
    SubSystem1 subSystem1 = new SubSystem1();
    SubSystem2 subSystem2 = new SubSystem2();
    SubSystem3 subSystem3 = new SubSystem3();

    public void doSomeThing() {
        subSystem1.method();
        subSystem2.method();
        subSystem3.method();
    }

}

class SubSystem1 {
    public SubSystem1() {
    }

    public void method() {
        System.out.println("SubSystem1 method is run");
    }
}
class SubSystem2 {
    public void method() {
        System.out.println("SubSystem1 method is run");
    }
}
class SubSystem3 {
    public void method() {
        System.out.println("SubSystem1 method is run");
    }
}
