package innerclass;

/**
 * 认识匿名内部类，搞清楚其基本作用
 * 匿名内部类实际上是有名字：外部类名$编号.class
 * 匿名内部类本质是一个子类，同时会立即构建一个子类对象
 */
public class InnerClassDemo3 {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        animal1.cry();

        Animal animal2 = new Animal() {
            @Override
            public void cry() {
                System.out.println("Dog cry");
            }
        };
        animal2.cry();
    }
}
