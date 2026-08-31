package abstractdemo;

// 一个类继承抽象类，必须重写完继承的全部抽象方法，否则这个类也必须定义成抽象类
public class Son extends AbstractClass {
    @Override
    public void method() {
        System.out.println("Son类重写method抽象方法");
    }
}
