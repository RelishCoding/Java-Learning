package capsulation;

/**
 * 目标：搞清楚封装的设计思想：合理隐藏合理暴露。
 * 学会如何隐藏如何暴露
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        // student.age = -19;
        student.setAge(19); // 赋值
        System.out.println(student.getAge()); // 取值

        // student.chinese = -10;
        student.setChinese(86);
        System.out.println(student.getChinese());
    }
}
