package polymorphism;

/**
 * 多态下的类型转换
 */
public class PolymorphismTest3 {
    public static void main(String[] args) {
        Animal animal = new Tortoise();
        animal.run();

        // 强制类型转换：可以解决多态下无法使用子类独有功能的问题
        Tortoise tortoise = (Tortoise) animal;
        tortoise.shrinkHead();

        // Wolf wolf = (Wolf) animal; // 有继承关系就可以强转，编译阶段不会报错
        // wolf.eatSheep(); // 运行时报错类型转换异常ClassCastException

        // 建议强制类型转换前先判断对象的真实类型
        if (animal instanceof Wolf) {
            Wolf wolf = (Wolf) animal;
            wolf.eatSheep();
        } else if (animal instanceof Tortoise) {
            Tortoise tortoise2 = (Tortoise) animal;
            tortoise2.shrinkHead();
        }

        go(new Wolf());
        go(new Tortoise());
    }

    public static void go(Animal animal) {
        System.out.println("开始......");
        animal.run();

        // 多态下不能使用子类独有的功能
        // animal.shrinkHead(); // error

        if (animal instanceof Wolf) {
            Wolf wolf = (Wolf) animal;
            wolf.eatSheep();
        } else if (animal instanceof Tortoise) {
            Tortoise tortoise2 = (Tortoise) animal;
            tortoise2.shrinkHead();
        }
    }
}
