package hello;

/**
 * 创建学生对象存储学生数据，并操作学生数据
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "播妞";
        s1.chinese = 77;
        s1.math = 85;
        System.out.println(s1.name + "的总成绩是：" + (s1.chinese + s1.math));
        System.out.println(s1.name + "的平均成绩是：" + (s1.chinese + s1.math) / 2);
        s1.printAllScore();
        s1.printAverageScore();
        System.out.println(s1);

        System.out.println("----------------");

        Student s2 = new Student();
        s2.name = "播仔";
        s2.chinese = 50;
        s2.math = 100;
        System.out.println(s2.name + "的总成绩是：" + (s2.chinese + s2.math));
        System.out.println(s2.name + "的平均成绩是：" + (s2.chinese + s2.math) / 2);
        s2.printAllScore();
        s2.printAverageScore();
        System.out.println(s2);
    }
}
