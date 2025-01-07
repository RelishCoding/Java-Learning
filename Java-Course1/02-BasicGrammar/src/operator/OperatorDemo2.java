package operator;

/**
 * 理解自增自减运算符
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        print(10);

        System.out.println("------------");

        print2(10);
    }

    public static void print(int a) {
        a++; // a = a + 1;
        ++a;
        System.out.println(a);

        a--;
        --a;
        System.out.println(a);
    }

    // 理解自增和自减放在变量前后的区别
    public static void print2(int a) {
        int b = a++; // 先用后加
        System.out.println(a); // 11
        System.out.println(b); // 10

        int c = ++a; // 先加后用
        System.out.println(a); // 12
        System.out.println(c); // 12
    }
}
