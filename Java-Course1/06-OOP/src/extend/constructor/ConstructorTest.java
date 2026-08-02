package extend.constructor;

/**
 * 认识子类构造器的特点和应用场景
 * 子类构造器必须先调用父类的构造器，再执行自己的构造器
 */
public class ConstructorTest {
    public static void main(String[] args) {
        Son son = new Son();
    }
}

class Father {
    public Father() {
        System.out.println("父类无参构造器执行了");
    }

    public Father(String name) {
        System.out.println("父类有参构造器执行了" + name);
    }
}

class Son extends Father {
    public Son() {
        // super(); // 默认存在的，写不写都有
        super("zhangsan"); // 指定调用父类的有参构造器
        System.out.println("子类无参构造器执行了");
    }
}
