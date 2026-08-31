package singleinstance;

/**
 * 目标：设计单例类
 */
public class SingleInstanceTest {
    public static void main(String[] args) {
        // SingleInstance instance1 = SingleInstance.instance;
        // SingleInstance instance2 = SingleInstance.instance;
        SingleInstance instance1 = SingleInstance.getInstance();
        SingleInstance instance2 = SingleInstance.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2); // true

        // SingleInstance.instance = null; // 把单例类的唯一对象给干掉了

        System.out.println("----------------------------");

        LazySingleInstance instance3 = LazySingleInstance.getInstance();
        LazySingleInstance instance4 = LazySingleInstance.getInstance();
        System.out.println(instance3);
        System.out.println(instance4);
        System.out.println(instance3 == instance4); // true
    }
}
