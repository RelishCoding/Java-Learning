package variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        //1.定义byte类型的变量
        //数据类型 变量名 = 数据值;
        byte a = 10;
        System.out.println(a);

        //2.定义short类型的变量
        short b = 20;
        System.out.println(b);

        //3.定义int类型的变量
        int c = 30;
        System.out.println(c);

        //4.定义long类型的变量
        //要在数据值后面加一个L作为后缀
        //L可以是大写的，也可以是小写的，建议使用大写，小写容易和1混淆
        long d = 123456789123456789L;
        System.out.println(d);

        //5.定义float类型的变量
        //要在数据值后面加一个F作为后缀
        float e = 10.1F;
        System.out.println(e);

        //6.定义double类型的变量
        double f = 20.3;
        System.out.println(f);

        //7.定义char类型的变量
        char g = 'a';
        System.out.println(g);

        //8.定义boolean类型的变量
        boolean h = true;
        System.out.println(h);
    }
}
