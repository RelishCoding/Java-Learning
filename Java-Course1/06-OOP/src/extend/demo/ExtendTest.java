package extend.demo;

/**
 * 认识继承的好处
 */
public class ExtendTest {
    public static void main(String[] args) {
        // 1.创建对象，封装老师数据
        // 子类可以继承父类的非私有成员
        // 子类对象其实是由子类和父类共同创建出来的对象，所以子类对象是完整的
        Teacher teacher = new Teacher();
        teacher.setName("dlei");
        teacher.setSex('男');
        teacher.setSkill("Java、前端、大数据");
        System.out.println(teacher.getName());
        System.out.println(teacher.getSex());
        System.out.println(teacher.getSkill());
        System.out.println("------------------");

        Consultant consultant = new Consultant();
        consultant.setName("zhangsan");
        consultant.setSex('男');
        consultant.setNumber(100);
        System.out.println(consultant.getName());
        System.out.println(consultant.getSex());
        System.out.println(consultant.getNumber());
    }
}
