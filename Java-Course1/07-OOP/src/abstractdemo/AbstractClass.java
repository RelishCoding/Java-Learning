package abstractdemo;

// 抽象类
public abstract class AbstractClass {
    private String name;
    private int age;

    public AbstractClass() {
        System.out.println("AbstractClass的无参构造器");
    }

    public AbstractClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 抽象方法，必须用abstract修饰，没有方法体，只有方法声明
    public abstract void method();

    public void show() {
        System.out.println("show方法");
    }
}
