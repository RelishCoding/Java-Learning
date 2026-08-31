package singleinstance;

// 设计成单例设计模式
public class SingleInstance {
    // 2.定义一个静态变量，用于记住本类的一个唯一对象
    // public static final SingleInstance instance = new SingleInstance();
    private static SingleInstance instance = new SingleInstance();

    // 1.私有化构造器：确保单例类对外不能创建太多对象，单例才有可能性
    private SingleInstance() {

    }

    // 3.提供一个公开的静态方法，返回这个类的唯一对象
    public static SingleInstance getInstance() {
        return instance;
    }
}
