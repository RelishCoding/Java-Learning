package thisdemo;

/**
 * 认识this关键字，搞清楚this关键字的应用场景
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "zhangsan";
        s1.printThis(); // thisdemo.Student@1e643faf
        System.out.println(s1); // thisdemo.Student@1e643faf

        System.out.println("--------------");

        Student s2 = new Student();
        s2.printThis(); // thisdemo.Student@6e8dacdf
        System.out.println(s2); // thisdemo.Student@6e8dacdf

        System.out.println("--------------");
        Student s3 = new Student();
        s3.name = "lisi";
        s3.printHobby("唱歌");
    }
}
