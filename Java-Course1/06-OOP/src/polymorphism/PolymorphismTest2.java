package polymorphism;

/**
 * 多态的好处：
 * 1.右边对象解耦合
 * 2.使用父类类型的形参，可以接收一切子类对象，扩展性更强、更便利
 *
 * 多态的缺点：多态下不能使用子类独有的功能
 */
public class PolymorphismTest2 {
    public static void main(String[] args) {
        Animal animal = new Tortoise();
        animal.run();

        animal = new Wolf();
        animal.run();

        go(animal);

        Wolf wolf = new Wolf();
        go(wolf);

        Tortoise tortoise = new Tortoise();
        go(tortoise);

        // 多态下不能使用子类独有的功能
        // animal.eatSheep(); // error
    }

    public static void go(Animal animal) {
        System.out.println("开始......");
        animal.run();
        // 多态下不能使用子类独有的功能
        // animal.shrinkHead(); // error
    }
}



