package xxgame;

public class ShiJian {
    public void shijian(int[] sz, final String mz) {
        int sj1 = 0;
        Edit s1 = new Edit();
        for (int cs = 1; cs <= 20; cs++) {
            int shijian = (int) (Math.random() * 53);
            if (cs <= 10)

                switch (shijian) { // 事件
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 39:
                    case 40:
                    case 41:
                        s1.millis(700);
                        System.out.println("正在修炼中...修为提升....");
                        sz[1] = sz[1] + 10;
                        sz[0] = sz[0] + 5;

                        continue;
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        s1.millis(700);
                        System.out.println("走火入魔了！修为下滑....");
                        sz[1] = sz[1] - 8;
                        continue;
                    case 15:
                        s1.millis(700);
                        System.out.println("得到了奇遇！修为大幅度上升！！");
                        sz[1] = sz[1] + 25;
                        sz[0] = sz[0] + 15;
                        continue;
                    case 16:
                        s1.millis(700);
                        System.out.println("心魔作乱，修为大幅度下降！！");
                        sz[1] = sz[1] - 25;
                        continue;
                    case 17:
                    case 18:
                    case 19:
                        s1.millis(700);
                        System.out.println("修行太累，正在摸鱼");
                        continue;
                    case 20:
                    case 21:
                    case 22:
                        s1.millis(700);
                        System.out.println("师父开始讲道，不知道能有多少收货");
                        int jd = (int) (Math.random() * 21);
                        sz[1] = sz[1] + jd;
                        continue;
                    case 23:
                        s1.millis(700);
                        System.out.println("正在修炼中...修为提升....");
                        sz[1] = sz[1] + 12;
                        sz[0] = sz[0] + 2;
                        continue;
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        if (cs <= 8) {
                            cs = cs - 1;
                            continue;
                        } else {
                            s1.millis(700);
                            if (sz[1] >= 30) {
                                System.out.println("斩杀低阶域外天魔，有所收获");
                                sz[1] = sz[1] + 5;
                                sz[0] = sz[0] + 15;
                                continue;
                            } else {
                                System.out.println("与一位实力一般的天外邪魔大战时力不从心，身死道消");
                                s1.millis(700);
                                cs = cs + 15;
                                continue;
                            }
                        }
                    case 28:
                    case 29:
                    case 30:
                        if (cs <= 10) {
                            cs = cs - 1;
                            continue;
                        } else {
                            s1.millis(700);
                            if (sz[1] >= 45) {
                                System.out.println("斩杀中阶域外天魔，有所收获");
                                sz[1] = sz[1] + 10;
                                sz[0] = sz[0] + 20;
                                continue;
                            } else {
                                System.out.println("与一位实力强劲的天外邪魔大战时力不从心，身死道消");
                                s1.millis(700);
                                cs = cs + 15;
                                continue;
                            }
                        }
                    case 31:
                    case 32:
                        if (cs <= 12) {
                            cs = cs - 1;
                            continue;
                        } else {
                            s1.millis(700);
                            if (sz[1] >= 60) {
                                System.out.println("斩杀高阶域外天魔，有所收获");
                                sz[1] = sz[1] + 20;
                                sz[0] = sz[0] + 30;
                                continue;
                            } else {
                                System.out.println("与一位实力极强的天外邪魔大战时力不从心，身死道消");
                                s1.millis(700);
                                cs = cs + 15;
                                continue;
                            }
                        }
                    case 33:
                        s1.millis(700);
                        System.out.println("与一位貌美的女修士双修，修为提升！");
                        sz[1] = sz[1] + 15;
                        sz[0] = sz[0] + 10;
                        continue;
                    case 34:
                    case 35:
                        s1.millis(700);
                        System.out.println("修炼了错误功法，修为下滑");
                        sz[1] = sz[1] - 12;
                        continue;
                    case 36:
                    case 37:
                        s1.millis(700);
                        System.out.println("修行遭遇了瓶颈，难以突破");
                        sz[1] = sz[1] - 5;
                        continue;
                    case 38:
                        s1.millis(700);
                        System.out.println("走火入魔了！修为下滑....");
                        sz[1] = sz[1] - 10;
                        continue;
                    case 42:
                    case 43:
                        s1.millis(700);
                        System.out.println("用邪法吞噬其他修士修为，修为上升");
                        sz[1] = sz[1] + 15;
                        sz[0] = sz[0] - 8;
                        continue;
                    case 44:
                        s1.millis(700);
                        System.out.println("用邪法吞噬其他修士修为，修为上升，被众人发现，群起攻之，修为被大帝所废");
                        sz[1] = sz[1] - 20;
                        sz[0] = sz[0] - 20;
                        continue;
                    case 45:
                        s1.millis(700);
                        System.out.println("修为被其他修士用邪法吞噬，修为下降");
                        sz[1] = sz[1] - 15;
                        sz[0] = sz[0] + 5;
                        continue;
                    case 46:
                    case 47:
                    case 48:
                        s1.millis(700);
                        System.out.println("在域外战场上拼死搏杀，身受重创");
                        sz[1] = sz[1] - 10;
                        sz[0] = sz[0] + 15;
                        continue;
                    case 49:
                        s1.millis(700);
                        System.out.println("勾引女修士双修，被发现，经脉被打断");
                        sz[1] = sz[1] - 15;
                        sz[0] = sz[0] - 15;
                        continue;
                    case 50:
                    case 51:
                        if (sj1 == 0) {
                            s1.millis(700);
                            System.out.println("偶然从仙界拍卖会上买到了《仙脉图录》上半部分残卷");
                            sz[1] = sz[1] + 15;
                            sj1 = sj1 + 1;
                            continue;
                        } else {
                            cs = cs - 1;
                            continue;
                        }
                    case 52:
                        if (sj1 == 1) {
                            s1.millis(700);
                            System.out.println("从一处上古遗迹中发现了《仙脉图录》下半部分残卷！");
                            sz[1] = sz[1] + 30;
                            continue;
                        } else {
                            cs = cs - 1;
                            continue;
                        }
                }
            else {
            }


        }
    }   //事件
}
