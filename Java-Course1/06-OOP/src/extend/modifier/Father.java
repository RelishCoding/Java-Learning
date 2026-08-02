package extend.modifier;

public class Father {
    // 1.private 只能当前类中访问
    private void privateMethod() {
        System.out.println("privateMethod");
    }

    // 2.缺省 只能在当前类中和同一个包下的其它类中访问
    void method() {
        System.out.println("method");
    }

    // 3.protected 只能在当前类中、同一个包下的其它类中、子孙类中访问
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    // 4.public 在任何类中都可以访问
    public void publicMethod() {
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.privateMethod();
        father.method();
        father.protectedMethod();
        father.publicMethod();
    }
}
