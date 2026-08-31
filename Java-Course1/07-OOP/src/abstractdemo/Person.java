package abstractdemo;

public abstract class Person {
    // 模板方法设计模式
    public final void write() {
        System.out.println("第一段");
        // 父类定义一个抽象方法，具体的实现交给子类来重写
        writeMain();
        System.out.println("第三段");
    }

    public abstract void writeMain();
}
