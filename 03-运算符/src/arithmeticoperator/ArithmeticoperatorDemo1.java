package arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2);//5
        // -
        System.out.println(5 - 1);//4
        // *
        System.out.println(7 * 9);//63

        //1.整数参与计算，结果只能得到整数
        //2.小数参与计算，结果有可能是不精确的，如果我们需要精确计算，那么需要用到后面的知识点。
        System.out.println(1.1 + 1.1);//2.2
        System.out.println(1.1 + 1.01);//2.1100000000000003
        System.out.println(1.1 - 1.01);//0.09000000000000008
        System.out.println(1.1 * 1.01);//1.1110000000000002

        //除法
        System.out.println(10 / 2);//5
        System.out.println(10 / 3);//3
        System.out.println(10.0 / 3);//3.3333333333333335

        //取模，取余。实际上也是做除法运算，只不过得到的是余数而已。
        System.out.println(10 % 2);//0
        System.out.println(10 % 3);//1
    }
}
