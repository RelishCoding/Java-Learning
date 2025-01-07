package operator;

/**
 * 搞清楚基本的算术运算符
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        print(10, 3);

        print2();
    }

    public static void print(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 3.3333... ==> 3
        System.out.println((double) a / b);
        System.out.println(1.0 * a / b);
        System.out.println(a % b);
    }

    // 研究+符号做连接符还是做运算符
    public static void print2() {
        int a = 5;
        System.out.println("abc" + a); // abc5
        System.out.println(a + 5); // 10
        System.out.println("itheima" + a + 'a'); // itheima5a
        System.out.println(a + 'a' + "itheima"); // 102itheima
    }
}
