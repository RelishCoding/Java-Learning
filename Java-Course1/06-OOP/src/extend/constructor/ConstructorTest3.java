package extend.constructor;

/**
 * 理解this(...)调用兄弟构造器
 * 注意：super(...)和this(...)必须写在构造器的第一行，而且两者不能同时出现
 */
public class ConstructorTest3 {
    public static void main(String[] args) {
        // 创建对象，存储一个学生的数据
        Student s1 = new Student("张无忌", '男', 18, "黑马程序员");
        System.out.println(s1);

        Student s2 = new Student("赵敏", '女', 19);
        System.out.println(s2);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private String schoolName;

    public Student() {

    }

    public Student(String name, char sex, int age, String schoolName) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.schoolName = schoolName;
    }

    public Student(String name, char sex, int age) {
        // this.name = name;
        // this.sex = sex;
        // this.age = age;
        // this.schoolName = "黑马程序员";

        // this调用兄弟构造器
        this(name, sex, age, "黑马程序员");
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}