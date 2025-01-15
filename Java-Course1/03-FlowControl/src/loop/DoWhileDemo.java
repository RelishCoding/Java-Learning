package loop;

/**
 * 搞清楚do-while循环的写法，并理解其特点
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        test();
    }

    // 使用do-while循环控制打印三行HelloWorld
    public static void test() {
        // 特点：先执行后判断（一定会执行一次）。
        int i = 0;
        do {
            System.out.println("HelloWorld");
            i++;
        } while (i < 3);
    }
}
