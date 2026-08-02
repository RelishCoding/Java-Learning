package extend.override;

/**
 * 认识方法重写，搞清楚应用场景
 * 方法重写：方法名称、形参列表必须一样
 * 重写的规范：声明不变，重新实现
 */
public class OverrideTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
    }
}

class Cat extends Animal {
    // 方法重写的校验注解（标志）：要求方法名称和形参列表必须与被重写方法一致，否则报错
    // 加了此注解后更安全、可读性好、更优雅
    @Override
    public void cry() {
        System.out.println("Cat cry");
    }
}

class Animal {
    public void cry() {
        System.out.println("Animal cry");
    }
}