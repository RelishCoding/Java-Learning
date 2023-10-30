package variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        //1.基本用法：定义变量，再进行输出
        int a = 10;
        System.out.println(a);

        //2.变量参与计算
        int b = 30;
        int c = 20;
        System.out.println(b + c);

        //3.修改变量记录的值
        a = 50;
        System.out.println(a);

        //一条语句中可以定义多个变量
        int d = 100, e = 200, f = 300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //变量在使用之前必须要赋值
        //int g;
        //g = 500;
        //建议：定义变量时直接赋值，不要把赋值分开写
        int g = 500;
        System.out.println(g);
    }
}
