package hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("-----------------");
        printHelloWorld();

        System.out.println("-----------------");
        System.out.println(sum(1, 2));
    }

    // 打印三行hello world
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    // 求任意两个整数的和
    public static int sum(int a, int b) {
        return a + b;
    }
}
