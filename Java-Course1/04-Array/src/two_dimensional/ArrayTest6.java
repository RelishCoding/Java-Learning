package two_dimensional;

/**
 * 完成数字华容道的初始化和随机乱序
 */
public class ArrayTest6 {
    public static void main(String[] args) {
        start(4);
    }

    private static void start(int n) {
        int[][] arr = new int[n][n];

        // 二维数组的初始化
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        printArray(arr);

        // 打乱二维数组中的元素顺序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int row = (int) (Math.random() * arr.length);
                int col = (int) (Math.random() * arr[i].length);
                int temp = arr[row][col];
                arr[row][col] = arr[i][j];
                arr[i][j] = temp;
            }
        }
        System.out.println("--------------");
        printArray(arr);
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
