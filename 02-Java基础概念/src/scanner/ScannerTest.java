package scanner;

//导包
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        //接收第二个数据
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();

        System.out.println(num1 + num2);
    }
}
