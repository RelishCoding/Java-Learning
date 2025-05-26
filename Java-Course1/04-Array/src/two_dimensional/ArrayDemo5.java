package two_dimensional;

/**
 * 认识二维数组
 */
public class ArrayDemo5 {
    public static void main(String[] args) {
        printArray();
    }

    private static void printArray() {
        // 静态初始化二维数组
        String[][] classroom = {
                {"张无忌", "赵敏", "周芷若"},
                {"张三丰", "宋远桥", "殷梨亭"},
                {"灭绝", "陈昆", "玄冥二老", "金毛狮王"},
                {"杨逍", "纪晓芙"}
        };

        // 访问方式一
        String[] names = classroom[2];
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // 访问方式二
        System.out.println(classroom[1][1]);
        System.out.println(classroom[2][2]);

        // 长度访问
        System.out.println(classroom.length);
        System.out.println(classroom[3].length);

        // 动态初始化数组
        int[][] arr = new int[3][5];

        // 遍历方式一
        for (int i = 0; i < classroom.length; i++) {
            String[] temp = classroom[i];
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j] + "\t");
            }
            System.out.println();
        }

        // 遍历方式二
        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                System.out.print(classroom[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
