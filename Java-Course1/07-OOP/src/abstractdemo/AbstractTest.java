package abstractdemo;

/**
 * 认识抽象类、抽象方法，搞清楚其特点
 * 抽象类的核心特点：有得有失（得到了抽象方法的能力，失去了创建对象的能力）
 * 抽象类不能创建对象（重点）
 * 抽象类的使命就是被子类继承
 */
public class AbstractTest {
    public static void main(String[] args) {
        // AbstractClass a = new AbstractClass(); // 报错

        Son son = new Son();
        son.method();
        son.show();
    }
}
