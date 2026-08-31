package singleinstance;

// 懒汉式单例类
public class LazySingleInstance {
    // 2.私有化静态变量
    private static LazySingleInstance instance;

    // 1.私有化构造器
    private LazySingleInstance() {

    }

    // 3.提供静态方法返回对象，真正需要对象的时候才开始创建对象
    public static LazySingleInstance getInstance() {
        if (instance == null) {
            // 第一次拿对象时，会创建对象赋值给静态变量
            instance = new LazySingleInstance();
        }
        return instance;
    }
}
