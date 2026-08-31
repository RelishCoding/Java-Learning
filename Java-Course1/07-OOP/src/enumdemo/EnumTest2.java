package enumdemo;

/**
 * 掌握枚举类的应用场景：做信息的分类和标志
 */
public class EnumTest2 {
    public static void main(String[] args) {
        // 需求：模拟上下左右移动图片

        // 方案一：使用常量做信息标志和分类，但参数值不受约束
        move1(DirectionConstant.UP);
        move1(1);

        // 方案二：使用枚举，参数值受枚举类约束
        move2(DirectionEnum.UP);
    }

    public static void move1(int direction) {
        // 根据方向做移动，上下左右
        switch (direction) {
            case DirectionConstant.UP:
                System.out.println("向上移动");
                break;
            case DirectionConstant.DOWN:
                System.out.println("向下移动");
                break;
            case DirectionConstant.LEFT:
                System.out.println("向左移动");
                break;
            case DirectionConstant.RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("输入有误");
        }
    }

    public static void move2(DirectionEnum direction) {
        switch (direction) {
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
