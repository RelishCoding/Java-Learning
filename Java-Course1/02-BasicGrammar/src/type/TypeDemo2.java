package type;

/**
 * 理解表达式的自动类型提升
 */
public class TypeDemo2 {
    public static void main(String[] args) {
        int result = calc2((byte) 110, (byte) 120);
        System.out.println(result); // 230

        int result2 = calc3((byte) 110, (byte) 120);
        System.out.println(result2); // -26
    }

    // 接收各种类型的数据运算
    public static double calc(int a, int b, double c, char r) {
        // 表达式的最终结果类型是有最高类型决定的
        return a + b + c + r;
    }

    // 推荐写法
    public static int calc2(byte a, byte b) {
        // byte short char运算时会直接提升成int运算
        return a + b;
    }

    // 不推荐这种写法
    public static byte calc3(byte a, byte b) {
        return (byte) (a + b);
    }
}
