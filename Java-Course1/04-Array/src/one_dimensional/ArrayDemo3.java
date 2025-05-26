package one_dimensional;

/**
 * 完成数组求最值
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = {15, 9000, 10000, 20000, 9500, -5};
        int max = getMax(scores);
        System.out.println("最高颜值是：" + max);
    }

    private static int getMax(int[] arr) {
        // 1.定义变量记录当前最大值
        // 建议用第一个数据作为参照物
        int max = arr[0];

        // 2.从数组的第二个位置开始遍历
        for (int i = 1; i < arr.length; i++) {
            /*if (arr[i] > max) {
                max = arr[i];
            }*/
            int tmp = arr[i];
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }
}
