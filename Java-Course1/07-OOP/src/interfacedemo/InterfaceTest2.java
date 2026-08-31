package interfacedemo;

/**
 * 理解Java设计接口的好处、用处
 * 接口弥补了类单继承的不足，可以让类拥有更多角色，类的功能更强大
 * 接口可以实现面向接口编程，更利于解耦合
 */
public class InterfaceTest2 {
    public static void main(String[] args) {
        Person person = new Student1();
        Driver driver = new Student1(); // 多态
        BoyFriend boyFriend = new Student1();

        Driver driver2 = new Student1();
        BoyFriend boyFriend2 = new Teacher();
    }
}

interface Driver {}

interface BoyFriend {}

class Person {}

class Student1 extends Person implements Driver, BoyFriend {}

class Teacher implements Driver, BoyFriend {}