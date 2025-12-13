package thisdemo;

public class Student {
    // 成员变量
    String name;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public void printThis() {
        // this是一个变量，用在方法中，用于拿到当前对象
        // 哪个对象调用这个方法，this就拿到哪个对象
        System.out.println(this);
        System.out.println(this.name);
    }

    // 局部变量
    public void printHobby(String name) {
        System.out.println(this.name + "喜欢" + name);
    }
}
