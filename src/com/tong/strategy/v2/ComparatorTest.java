package com.tong.strategy.v2;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {

    public static void main(String[] args) {
        Person[] peoples = new Person[]{new Person(10, 111), new Person(18, 99), new Person(15, 122)};
        Arrays.sort(peoples, new SortByAge());
        print(peoples);
        System.out.println("------------------");
        Arrays.sort(peoples, new SortByHeight());
        print(peoples);
    }

    static void print(Person[] peoples) {
        for (int i = 0; i < peoples.length; i++) {
            System.out.println(peoples[i]);
        }
    }

}

class Person {

    public Person(int age, int height) {
        this.age = age;
        this.height = height;
    }

    private int age;
    private int height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}

class SortByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge()>o2.getAge()) {
            return 1;
        } else if (o1.getAge()<o2.getAge()) {
            return -1;
        }
        return 0;
    }
}

class SortByHeight implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getHeight()>o2.getHeight()) {
            return 1;
        } else if (o1.getHeight()<o2.getHeight()) {
            return -1;
        }
        return 0;
    }
}
