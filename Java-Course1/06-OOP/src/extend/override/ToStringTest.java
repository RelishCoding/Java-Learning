package extend.override;

/**
 * 方法重写的常见应用场景：
 * 子类重写Object的toString方法，以便返回对象的内容
 * 注意；
 * 1.直接输出对象，默认会调用Object的toString方法（可以省略不写toString的代码），返回对象的地址信息
 * 2.输出对象的地址实际上没什么意义，开发中更希望输出对象的内容信息
 * 所以子类需要重写Object的toString方法，以便以后输出对象时默认就近调用子类重写的toString方法返回对象的内容
 */
public class ToStringTest {
    public static void main(String[] args) {
        Student student = new Student("赵敏", '女', 25);
        System.out.println(student); // 重写toString前输出：extend.override.Student@3b6eb2ec
        System.out.println(student.toString());
    }
}

class Student {
    private String name;
    private char sex;
    private int age;

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", sex=" + sex + ", age=" + age + "}";
    }
}
