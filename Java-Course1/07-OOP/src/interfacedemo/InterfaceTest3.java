package interfacedemo;

/**
 * 完成接口的小案例
 */
public class InterfaceTest3 {
    public static void main(String[] args) {
        // 2、准备学生数据,目前我们自己造一些测试数据
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("张三", '男', 100);
        allStudents[1] = new Student("李四", '女', 99);
        allStudents[2] = new Student("王五", '男', 98);
        allStudents[3] = new Student("赵六", '女', 97);
        allStudents[4] = new Student("孙七", '男', 96);
        allStudents[5] = new Student("周八", '女', 95);
        allStudents[6] = new Student("吴九", '男', 94);
        allStudents[7] = new Student("郑十", '女', 93);
        allStudents[8] = new Student("赵敏", '女', 100);
        allStudents[9] = new Student("周芷若", '女', 90);

        // 3、提供两套业务实现方案，支持灵活切换（解耦合）： 面向接口编程
        ClassDataInterface cdi1 = new ClassDataInterfaceImpl1(allStudents);
        cdi1.printAllStudentsInfo();
        cdi1.printAverageScore();
        System.out.println("----------------------");

        ClassDataInterface cdi2 = new ClassDataInterfaceImpl2(allStudents);
        cdi2.printAllStudentsInfo();
        cdi2.printAverageScore();
    }
}
