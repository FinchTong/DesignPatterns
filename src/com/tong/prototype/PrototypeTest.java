package com.tong.prototype;

/**
 *
 * 原型模式
 *
 * 定义：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象
 *
 * 应用场景：
 * 对象之间相同或相似，即只是个别的几个属性不同的时候。
 * 创建对象成本较大，例如初始化时间长，占用CPU太多，或者占用网络资源太多等，需要优化资源。
 * 创建一个对象需要繁琐的数据准备或访问权限等，需要提高性能或者提高安全性。
 * 系统中大量使用该类对象，且各个调用者都需要给它的属性重新赋值。
 *
 * 优点：
 * Java 自带的原型模式基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良。
 * 可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，简化了创建对象的过程，以便在需要的时候使用（例如恢复到历史某一状态），可辅助实现撤销操作。
 *
 * 缺点：
 * 需要为每一个类都配置一个 clone 方法
 * clone 方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背了开闭原则。
 * 当实现深克隆时，需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现起来会比较麻烦。因此，深克隆、浅克隆需要运用得当。
 *
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        BaseInfo baseInfo = new BaseInfo("XXX");
        Product product = new Product("part1", "part2", 3, 4, baseInfo);

        Product clone = product.clone();
        System.out.println(product.toString());
        System.out.println(clone.toString());
        product.setBaseInfo(new BaseInfo("YYY"));
        System.out.println(product.toString());
        System.out.println(clone.toString());
    }





}

class Product implements Cloneable {
    private String part1;
    private String part2;
    private Integer part3;
    private Integer part4;
    private BaseInfo baseInfo;

    public Product(String part1, String part2, Integer part3, Integer part4) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;
    }

    public Product(String part1, String part2, Integer part3, Integer part4, BaseInfo baseInfo) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;
        this.baseInfo = baseInfo;
    }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public Integer getPart3() {
        return part3;
    }

    public void setPart3(Integer part3) {
        this.part3 = part3;
    }

    public Integer getPart4() {
        return part4;
    }

    public void setPart4(Integer part4) {
        this.part4 = part4;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    @Override
    public String toString() {
        return "[" + super.hashCode() + "]Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3=" + part3 +
                ", part4=" + part4 +
                ", baseInfo=" + baseInfo.toString() +
                '}';
    }

    @Override
    protected Product clone() throws CloneNotSupportedException {
        Product clone = (Product) super.clone();
        //变量如果是对象，该类型也需要实现Cloneable接口，并自己使用clone方法赋值，否则克隆出来的该变量会指向同一个指针地址（浅拷贝）
        BaseInfo baseInfoClone = this.baseInfo.clone();
        clone.baseInfo = baseInfoClone;
        return clone;
    }
}

class BaseInfo implements Cloneable {

    private String name;

    public BaseInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected BaseInfo clone() throws CloneNotSupportedException {
        return (BaseInfo) super.clone();
    }

    @Override
    public String toString() {
        return "[" + super.hashCode() + "]BaseInfo{" +
                "name='" + name + '\'' +
                '}';
    }
}
