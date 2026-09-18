package innerclass;

/**
 * 搞清楚静态内部类的语法
 *
 * 1、静态内部中是否可以直接访问外部类的静态成员？ 可以！
 * 2、静态内部类中是否可以直接访问外部类的实例成员？ 不可以！
 */
public class InnerClassDemo2 {
    public static void main(String[] args) {
        // 创建对象：外部类名.内部类名 对象名 = new 外部类名.内部类名();
        OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
        innerClass2.show();
    }
}
