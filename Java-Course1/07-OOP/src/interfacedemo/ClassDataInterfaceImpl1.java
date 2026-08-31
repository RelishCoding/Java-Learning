package interfacedemo;

// 定义第一套实现类，实现接口：实现打印学生信息，实现打印平均分
public class ClassDataInterfaceImpl1 implements ClassDataInterface{
    private Student[] students; // 记住送来的全班学生对象信息

    public ClassDataInterfaceImpl1(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentsInfo() {
        System.out.println("全班学生信息如下：");
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.getName() + " " + student.getSex() + " " + student.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        System.out.println("全班平均成绩为：" + sum / students.length);
    }
}
