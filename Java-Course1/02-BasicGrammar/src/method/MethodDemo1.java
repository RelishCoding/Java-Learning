package method;

public class MethodDemo1 {
    public static void main(String[] args) {
        int sum = getSum(10, 20);
        System.out.println("和是：" + sum);

        int sum2 = getSum(200, 300);
        System.out.println(sum2);

        printHelloWorld();

        System.out.println(getCode(4));
        System.out.println(getCode(5));
    }

    // 定义一个方法，求任意两个整数的和并返回
    public static int getSum(int a, int b) {
        return a + b;
    }

    // 打印3行HelloWorld
    // 注意：如果方法没有返回结果，返回值类型必须声明成void.
    // 无参数，无返回值类型
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }

    // 获取一个指定位数的验证码返回
    // 有参数有返回值的方法
    public static String getCode(int len) {
        String code = "";
        for (int i = 0; i < len; i++) {
            int num = (int) (Math.random() * 10);
            code += num;
        }
        return code;
    }
}
