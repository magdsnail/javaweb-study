package com.snail.pojo;

/**
 * ClassName: Person
 * Package: com.snail.pojo
 * Description:
 *
 * @Date: 2023-06-23 023 13:04
 * @Author: wangkejing
 */
public class Person {
    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
