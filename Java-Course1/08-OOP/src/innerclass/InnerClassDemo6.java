package innerclass;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 完成给数组排序，理解其中匿名内部类的用法
 */
public class InnerClassDemo6 {
    public static void main(String[] args) {
        // 准备一个Person的数组，存放6个对象
        Person[] people = new Person[6];
        people[0] = new Person("殷素素", 35, 171.5, '女');
        people[1] = new Person("杨幂", 28, 168.5, '女');
        people[2] = new Person("张无忌", 25, 181.5, '男');
        people[3] = new Person("小昭", 19, 165.5, '女');
        people[4] = new Person("赵敏", 27, 167.5, '女');
        people[5] = new Person("刘亦菲", 36, 168, '女');

        // 需求：按钮年龄升序排序。可以调用sun公司写好的API直接对数组进行排序
        // Arrays.sort(people); // 报错
        /*
            public static void sort(T[] a, Comparator<T> c)
            参数一：需要排序的数组
            参数二：需要给sort方法声明一个Comparator比较器对象（指定排序的规则）
            sort方法内部会调用匿名内部类对象的compare方法，对数组中的对象进行两两比较，从而实现排序
         */
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                // 指定排序规则：
                // 如果左边对象 大于 右边对象，那么返回正整数
                // 如果左边对象 小于 右边对象，那么返回负整数
                // 如果两边相等那么返回0
                /*if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }*/
                // return o1.getAge() - o2.getAge(); // 按照年龄升序
                return o2.getAge() - o1.getAge(); // 按照年龄降序
            }
        });

        // 遍历数组中的对象并输出
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println(person);
        }
    }
}
