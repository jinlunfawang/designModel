package com.xiaoliang.yilaidaozhi.active;

/**
 * @version 1.0
 * @Author: liangfangwei
 * @Date: 2021/8/24 21:05
 *
 * 没有依赖倒置 代码没有扩展性
 * 依赖倒置
 *
 * 上层不应该依赖于下层 而应该依赖于抽象层
 *
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
 * 服务端代码  不用动 只需要改动
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

