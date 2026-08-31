package interfacedemo;

/**
 * 认识接口，搞清楚接口的特点、基本使用
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        System.out.println(Interface1.SCHOOL_NAME);

        // 注意：接口不能创建对象
        // Interface1 interface1 = new Interface1(); // 报错

        // 接口是用来被类实现的
        InterfaceImpl interfaceImpl = new InterfaceImpl();
        interfaceImpl.play();
        System.out.println(interfaceImpl.go());
        interfaceImpl.run();
    }
}

// 实现类，同时实现了多个接口
// 实现类实现多个接口，必须重写完全部接口的全部抽象方法，否则这个类必须定义成抽象类
class InterfaceImpl implements Interface1, Interface2 {
    @Override
    public void run() {
        System.out.println("重写run方法");
    }

    @Override
    public String go() {
        return "hello world";
    }

    @Override
    public void play() {
        System.out.println("重写play方法");
    }
}
