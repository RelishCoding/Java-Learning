package operator;

/**
 * 理解关系运算符
 */
public class OperatorDemo4 {
    public static void main(String[] args) {
        print(10, 20);
        System.out.println("-------------");
        print(10, 10);
    }

    public static void print(int a, int b) {
        System.out.println(a > b); // true
        System.out.println(a < b); // false
        System.out.println(a >= b); // true 要么大于要么等于
        System.out.println(a <= b); // false 要么小于要么等于
        System.out.println(a == b); // false
        System.out.println(a != b); // true
    }
}