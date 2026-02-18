package javabean;

/**
 * 学生业务操作对象：负责对学生的数据进行业务处理
 */
public class StudentOperator {
    private Student student; // 要操作的学生对象

    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printAllScore() {
        System.out.println(student.getName() + "总成绩是：" + (student.getMath() + student.getEnglish()));
    }

    public void printAverageScore() {
        System.out.println(student.getName() + "平均成绩是：" + (student.getMath() + student.getEnglish()) / 2);
    }
}
