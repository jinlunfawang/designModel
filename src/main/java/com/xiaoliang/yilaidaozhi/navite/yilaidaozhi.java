package com.xiaoliang.yilaidaozhi.navite;

/**
 * @version 1.0
 * @Author: liangfangwei
 * @Date: 2021/8/24 21:05
 */
public class yilaidaozhi {
    public static void main(String[] args) {
        Person person = new Person();
        person.feed(new Cat());
        person.feed(new Tiger());
    }
}

/**
 * 服务端代码
 */
class Person {
    public void feed(Cat cat) {
        cat.eat();
        System.out.println("人喂猫");
    }

    public void feed(Tiger tiger) {
        tiger.eat();
        System.out.println("人喂老虎");
    }

    public void feed(Dog dog) {
        dog.eat();

    }
}

class Dog {
    public void feed(Dog dog) {

        dog.eat();
    }

    public void eat() {
        System.out.println("狗吃shi");

    }

}

class Cat {
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Tiger {
    public void eat() {
        System.out.println("老虎吃肉");
    }
}