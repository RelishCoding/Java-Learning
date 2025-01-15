package loop;

/**
 * 掌握死循环的写法
 */
public class DeadForDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // for循环实现死循环
        /*for ( ; ; ) {
            System.out.println("Hello World");
        }*/

        // while循环实现死循环(经典写法)
        /*while (true) {
            System.out.println("Hello World2");
        }*/

        // do...while循环实现死循环
        do {
            System.out.println("Hello World3");
        } while (true);
    }
}
