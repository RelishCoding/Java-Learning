package one_dimensional;

/**
 * 完成斗地主游戏的做牌和洗牌
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        String[] poker = new String[54];

        // 准备4种花色和点数
        String[] colors = {"黑桃", "红桃", "方块", "梅花"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int index = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                poker[index++] = colors[i] + numbers[j];
            }
        }

        // 将大小王存入数组
        poker[index++] = "大王";
        poker[index] = "小王";

        // 打印牌
        System.out.println("新牌：");
        for (int i = 0; i < poker.length; i++) {
            System.out.println(poker[i]);
        }

        // 洗牌：将54张牌的顺序打乱
        for (int i = 0; i < poker.length; i++) {
            int index1 = (int) (Math.random() * poker.length);
            int index2 = (int) (Math.random() * poker.length);
            String temp = poker[index2];
            poker[index2] = poker[index1];
            poker[index1] = temp;
        }

        System.out.println("洗牌后：");
        for (int i = 0; i < poker.length; i++) {
            System.out.println(poker[i]);
        }
    }
}
