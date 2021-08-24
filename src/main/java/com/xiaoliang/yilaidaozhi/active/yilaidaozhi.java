package com.xiaoliang.yilaidaozhi.active;

/**
 * @version 1.0
 * @Author: liangfangwei
 * @Date: 2021/8/24 21:05
 */
public class yilaidaozhi {
    public static void main(String[] args) {
        Person person = new Person();
        person.feed(new Cat());
        person.feed(new Dog());

    }
}


interface Animal{
    void  eat();
}
/**
 * 服务端代码
 */
class Person {
    public void feed(Animal animal) {
        animal.eat();

    }


}

class Dog implements Animal {


    @Override
    public void eat() {
        System.out.println("狗吃shi");
    }
}

class Cat implements Animal{
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

