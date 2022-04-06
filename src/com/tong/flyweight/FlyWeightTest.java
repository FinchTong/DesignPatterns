package com.tong.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * 享元模式
 *
 * 定义：运用共享技术来有效地支持大量细粒度对象的复用。它通过共享已经存在的对象来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。
 *
 * 优点：相同对象只要保存一份，这降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力。
 *
 *
 */
public class FlyWeightTest {

    public static void main(String[] args) {

        TreeFactory treeFactory = new TreeFactory();
        TreeNode treeNode = new TreeNode(3, 4, TreeFactory.getTree("xxx", "xxxxxx"));
        TreeNode treeNode2 = new TreeNode(3, 5, TreeFactory.getTree("xxx", "xxxxxx"));
        TreeNode treeNode3 = new TreeNode(4, 4, TreeFactory.getTree("yyy", "yyyyyy"));
        TreeNode treeNode4 = new TreeNode(4, 5, TreeFactory.getTree("yyy", "yyyyyy"));

    }

}

class TreeNode {
    private int x;
    private int y;
    private Tree tree;

    public TreeNode(int x, int y, Tree tree) {
        this.x = x;
        this.y = y;
        this.tree = tree;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }
}

class TreeFactory {
    private static Map<String, Tree> map = new ConcurrentHashMap<>();

    public static Tree getTree(String name, String data) {
        if (map.containsKey(name)) {
            System.out.println("tree已存在，直接获取！");
            return map.get(name);
        }
        Tree tree = new Tree(name, data);
        map.put(name,tree);
        return tree;
    }

}

class Tree {
    private final String name;
    private final String data;

    public Tree(String name, String data) {
        this.name = name;
        this.data = data;
        System.out.println("name:" + name + " ,data:" + data + "  is create!");
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }
}