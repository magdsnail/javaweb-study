package com.kuang.pojo;

/**
 * ClassName: People
 * Package: com.kuang.pojo
 * Description:
 *
 * @Date: 2023-06-29 029 10:49
 * @Author: wangkejing
 */
public class People {
    private String name;
    private int age;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public People(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
