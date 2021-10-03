package xxgame;

import java.util.Scanner;

public class ChongKai {
    public int chongkai() {
        Scanner sc = new Scanner(System.in);

        int jx = 0;
        System.out.println("您是否想继续游戏，继续请输入1，否则请输入2");
        final int sr = sc.nextInt();
        if (sr == 1) {
        } else {
            jx = jx + 1;
            System.out.println("游戏结束");

        }
        return jx;
    }   //游戏重开
}
