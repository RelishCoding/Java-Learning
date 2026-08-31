package interfacedemo;

// 定义第二套实现类，实现接口：实现打印学生信息(统计男女人数)，实现打印平均分（去掉最高分和最低分）
public class ClassDataInterfaceImpl2 implements ClassDataInterface {
    private Student[] students;

    public ClassDataInterfaceImpl2(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentsInfo() {
        System.out.println("学生信息如下：");
        int maleCount = 0; // 男生人数
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.getName() + " " + student.getSex() + " " + student.getScore());
            if (student.getSex() == '男') {
                maleCount++;
            }
        }
    }

    @Override
    public void printAverageScore() {
        System.out.println("平均分如下：");
        double sum = students[0].getScore();
        double max = students[0].getScore();
        double min = students[0].getScore();
        for (int i = 1; i < students.length; i++) {
            Student student = students[i];
            sum += student.getScore();
            if (student.getScore() > max) {
                max = student.getScore();
            }
            if (student.getScore() < min) {
                min = student.getScore();
            }
        }

        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + (sum - max - min) / (students.length - 2));
    }
}
