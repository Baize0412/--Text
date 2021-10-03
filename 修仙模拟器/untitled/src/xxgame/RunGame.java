package xxgame;

import java.util.Scanner;

public class RunGame {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到修仙模拟器");

        Edit s0 = new Edit();

        s0.millis(500);

        for (int jx = 0; jx == 0; ) {
            System.out.println("您降生了，请给自己起个名字");
            final String mz = sc.next();
            int[] sz = new int[2];  //sz[0]=声望；sz[1]=修为
            sz[0] = 5;
            sz[1] = (int) (Math.random() * 21);
            int sj1 = 0;

            s0.millis(700);

            TianFu s1 = new TianFu();
            s1.tianfu(sz[1], mz);

            s0.millis(700);

            System.out.println(mz + "的修真之旅开始了！");

            ShiJian s2 = new ShiJian();
            s2.shijian(sz, mz);

            s0.millis(700);

            System.out.println(mz + "的一生结束了");

            s0.millis(700);

            System.out.println("-----------------------------------------------------------------------------");

            s0.millis(1000);

            RongYu s3 = new RongYu();
            s3.rongyu(sz, mz);

            s0.millis(1000);

            XiuXIng s4 = new XiuXIng();

            s4.xiuxing(sz, mz);

            s0.millis(1000);

            System.out.println("声望" + sz[0] + "修为" + sz[1]);

            ChongKai s5 = new ChongKai();

            int jx_ = s5.chongkai();

            if (jx_ == 0) {
                jx = 0;
            } else {
                jx = 1;
            }


        }
    }   //0声望//1修为
}
