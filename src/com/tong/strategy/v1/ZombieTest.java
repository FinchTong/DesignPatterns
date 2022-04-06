package com.tong.strategy.v1;

/**
 *
 * 策略设计模式
 *
 * 定义：该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。
 *
 * 优点：
 * 多重条件语句不易维护，而使用策略模式可以避免使用多重条件语句，如 if...else 语句、switch...case 语句。
 * 策略模式提供了一系列的可供重用的算法族，恰当使用继承可以把算法族的公共代码转移到父类里面，从而避免重复的代码。
 * 策略模式可以提供相同行为的不同实现，客户可以根据不同时间或空间要求选择不同的。
 * 策略模式提供了对开闭原则的完美支持，可以在不修改原代码的情况下，灵活增加新算法。
 * 策略模式把算法的使用放到环境类中，而算法的实现移到具体策略类中，实现了二者的分离。
 *
 * 缺点：
 * 客户端必须理解所有策略算法的区别，以便适时选择恰当的算法类。
 * 策略模式造成很多的策略类，增加维护难度。
 *
 * 应用场景
 * 一个系统需要动态地在几种算法中选择一种时，可将每个算法封装到策略类中。
 * 一个类定义了多种行为，并且这些行为在这个类的操作中以多个条件语句的形式出现，可将每个条件分支移入它们各自的策略类中以代替这些条件语句。
 * 系统中各算法彼此完全独立，且要求对客户隐藏具体算法的实现细节时。
 * 系统要求使用算法的客户不应该知道其操作的数据时，可使用策略模式来隐藏与算法相关的数据结构。
 * 多个类只区别在表现行为不同，可以使用策略模式，在运行时动态选择具体要执行的行为。
 *
 */
public class ZombieTest {
    public static void main(String[] args) {
        AbstractZombie normalZombie = new NormalZombie();
        AbstractZombie flagZombie = new FlagZombie();
        flagZombie.setAttackable(new HitAttack());

        normalZombie.display();
        normalZombie.move();
        normalZombie.attack();

        flagZombie.display();
        flagZombie.move();
        flagZombie.attack();

    }
}

interface Moveable {
    void move();
}
interface Attackable {
    void attack();
}

class StepByStepMove implements Moveable {

    @Override
    public void move() {
        System.out.println("一步一步移动");
    }
}

class BiteAttack implements Attackable {

    @Override
    public void attack() {
        System.out.println("咬");
    }
}

class HitAttack implements Attackable {

    @Override
    public void attack() {
        System.out.println("打");
    }
}

abstract class AbstractZombie{

    public AbstractZombie() {
    }

    public AbstractZombie(Moveable moveable, Attackable attackable) {
        this.moveable = moveable;
        this.attackable = attackable;
    }

    Moveable moveable;
    Attackable attackable;

    public Moveable getMoveable() {
        return moveable;
    }

    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }

    public Attackable getAttackable() {
        return attackable;
    }

    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }

    public abstract void display();
    public abstract void attack();
    public abstract void move();

}

class NormalZombie extends AbstractZombie {

    public NormalZombie() {
        super(new StepByStepMove(), new BiteAttack());
    }

    public NormalZombie(Moveable moveable, Attackable attackable) {
        super(moveable, attackable);
    }

    @Override
    public void display() {
        System.out.println("普通僵尸");
    }

    @Override
    public void attack() {
        attackable.attack();
    }

    @Override
    public void move() {
        moveable.move();
    }
}

class FlagZombie extends AbstractZombie {

    public FlagZombie() {
        super(new StepByStepMove(), new BiteAttack());
    }

    public FlagZombie(Moveable moveable, Attackable attackable) {
        super(moveable, attackable);
    }

    @Override
    public void display() {
        System.out.println("旗手僵尸");
    }

    @Override
    public void attack() {
        attackable.attack();
    }

    @Override
    public void move() {
        moveable.move();
    }
}


