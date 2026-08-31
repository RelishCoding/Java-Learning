package abstractdemo;

// 搞清楚使用抽象类的好处
public class AbstractTest2 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.cry();

        Animal dog = new Dog();
        dog.cry();
    }
}
