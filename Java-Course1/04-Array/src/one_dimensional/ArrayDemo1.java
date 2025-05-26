package one_dimensional;

/**
 * 认识使用数组的好处，数组的定义方式一、访问
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        randomStudent();
    }

    private static void randomStudent() {
        // 1.定义一个数组，存储15个学生的姓名
        // 静态初始化数组，定义数组时数据就已经确定好了
        // String[] names = {"name1", "name2", "name3", "name4", "name5", "name6", "name7", "name8", "name9", "name10", "name11", "name12", "name13", "name14", "name15"};
        // String names[] = {"name1", "name2", "name3", "name4", "name5", "name6", "name7", "name8", "name9", "name10", "name11", "name12", "name13", "name14", "name15"};
        String[] names = new String[]{"name1", "name2", "name3", "name4", "name5", "name6", "name7", "name8", "name9", "name10", "name11", "name12", "name13", "name14", "name15"};
        System.out.println(names); // [Ljava.lang.String;@3b6eb2ec

        // 2.随机获取一个索引值
        // Math.random() 生成[0,1)之间的小数
        int index = (int) (Math.random() * names.length);

        // 3.根据索引值，获取数组中的元素
        String name = names[index];
        System.out.println(name);
    }
}
