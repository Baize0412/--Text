package xxgame;

public class XiuXIng {
    public void xiuxing(int[] sz, final String mz) {
        if (sz[1] >= 150) {
            System.out.println("在修行方面，" + mz + "最终成为了一个大乘期修士（您已经达到本作最高境界）");
        } else if (sz[1] >= 125) {
            System.out.println("在修行方面，" + mz + "最终成为了一个渡劫期修士");
        } else if (sz[1] >= 105) {
            System.out.println("在修行方面，" + mz + "最终成为了一个化神期修士");
        } else if (sz[1] >= 85) {
            System.out.println("在修行方面，" + mz + "最终成为了一个元婴期修士");
        } else if (sz[1] >= 65) {
            System.out.println("在修行方面，" + mz + "最终成为了一个金丹期修士");
        } else if (sz[1] >= 45) {
            System.out.println("在修行方面，" + mz + "最终成为了一个筑基期修士");
        } else if (sz[1] >= 25) {
            System.out.println("在修行方面，" + mz + "最终成为了一个练气期修士");
        } else {
            System.out.println("在修行方面，" + mz + "无缘仙道，享年60岁");
        }
    }   //修行
}
