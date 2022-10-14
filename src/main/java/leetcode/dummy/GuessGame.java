package leetcode.dummy;

public class GuessGame {
    private static int pick = 0;
    public static int guess(int n){
        if(n==pick)return 0;
        if(n<pick)return 1;
        return -1;
    }
    public void setPick(int m){
        this.pick = m;
    }
}
