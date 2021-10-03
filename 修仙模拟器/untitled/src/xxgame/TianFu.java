package xxgame;

public class TianFu {
    public void tianfu(int xiuwei, final String mz) {
        switch (xiuwei) { // 天赋
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(mz + "的修仙天赋较低");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println(mz + "的修仙天赋一般");
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println(mz + "的修仙天赋较高");
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println(mz + "的修仙天赋极高");
                break;
        }   //天赋
    }   //天赋
}
