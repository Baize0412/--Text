package xxgame;

public class RongYu {
    public void rongyu(int[] sz, final String mz) {
        if (sz[0] >= 100) {
            System.out.println("在荣誉方面，" + mz + "一人独断万古，带领修士斩杀无数域外之魔，被誉为【灭魔大帝】，成为了一段不可磨灭的传说");
        } else if (sz[0] >= 75) {
            System.out.println("在荣誉方面，" + mz + "在抗击天外邪魔方面做出了卓越贡献，孤生一人抵御外敌，斩杀数百邪魔，被誉为【斩魔真人】，永远留存于人们心中");
        } else if (sz[0] >= 50) {
            System.out.println("在荣誉方面，" + mz + "跟随大军迎战天外邪魔，浴血奋战，奋勇杀魔，小有名气");
        } else if (sz[0] >= 25) {
            System.out.println("在荣誉方面，" + mz + "在修真界只有寥寥数人知道你");
        } else {
            System.out.println("在荣誉方面，" + mz + "默默无闻，独善其身");
        }
    }   //荣誉
}
