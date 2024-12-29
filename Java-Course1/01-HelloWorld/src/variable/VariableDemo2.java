package variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 掌握8种基本数据类型定义变量。
        printVariable();
    }

    // 定义一个方法，打印出8种基本数据类型定义的变量。
    public static void printVariable() {
        // 1. 整型
        byte b = 10;
        System.out.println(b);
        // byte b2 = 128; // 越界了，error
        short s = 20;
        System.out.println(s);
        int i2 = 30;
        System.out.println(i2);
        // 注意：随便写一个整数字面量默认是int类型的，334254235555这个数据虽然没有超过long的范围，但是超过了int的范围，所以报错
        // 如果希望334254235555这个是long类型，需要显示的指定，加上L或者l
        long l1 = 334254235555L;
        System.out.println(l1);
        long l = 40;
        System.out.println(l);

        // 2. 浮点型
        // 注意：随便写一个浮点数字面量默认是double类型的，如果希望1.1是float类型的，必须加上f或者F
        // float f2 = 1.1;
        float f = 1.1f;
        double d = 2.2;
        System.out.println(f);
        System.out.println(d);

        // 3. 字符型
        char c = 'a';
        System.out.println(c);

        // 4. 布尔型
        boolean flag = true;
        boolean flag2 = false;
        System.out.println(flag);
        System.out.println(flag2);

        // 5. 字符串型： 定义字符串变量记录字符串数据的
        String str = "hello";
        System.out.println(str);
    }
}
