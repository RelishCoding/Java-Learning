package one_dimensional;

/**
 * 测试数组访问次数对性能的影响
 */
public class BenchmarkTest {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        // 初始化数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // 写法一
        long startTime = System.nanoTime();
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }
        long duration1 = System.nanoTime() - startTime;

        // 写法二
        startTime = System.nanoTime();
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            if (tmp > max2) {
                max2 = tmp;
            }
        }
        long duration2 = System.nanoTime() - startTime;

        System.out.println("写法一耗时: " + duration1 + " ns"); // 2262400
        System.out.println("写法二耗时: " + duration2 + " ns"); // 2203400
    }
}
