package extend.feature;

/**
 * 继承的注意事项和特点
 * 1.Java的类只能是单继承的，不支持多继承，但可以多层继承
 * 2.一个类要么直接继承Object类，要么默认继承Object，要么间接继承Object
 * 3.继承后子类的访问特点：就近原则
 */
public class FeatureTest {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.hashCode());

        B b = new B();
        System.out.println(b.hashCode());

        b.show();
    }
}

// class A extends Object {
class A {
    String name = "父类name";

    public void run() {
        System.out.println("父类的run方法");
    }
}

class B extends A {
    String name = "子类name";

    public void show() {
        String name = "show方法的name";
        System.out.println(name); // show方法的name
        System.out.println(this.name); // 子类name
        System.out.println(super.name); // 父类name

        run();
        super.run();

        // go(); // 报错
    }

    public void run() {
        System.out.println("子类的run方法");
    }
}

// class C extends B, A { // error
class C extends B {

}