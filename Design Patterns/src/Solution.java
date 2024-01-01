import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int findMaxDolls(int[] dolls, int k, int m) {
        int n = dolls.length;
        int[][][] dp = new int[n][2][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return Math.max(getMaxDolls(dolls, k, 0, m, dp, 0), getMaxDolls(dolls, k, 1, m, dp, 0));
    }

    public static int getMaxDolls(int[] dolls, int pos, int dir, int movesLeft, int[][][] dp, int dollsCollected) {
        if (movesLeft == 0) {
            return dollsCollected;
        }
        if (dp[pos][dir][movesLeft] != -1) {
            return dp[pos][dir][movesLeft] + dollsCollected;
        }
        int res = 0;
        if (dir == 0) { // moving left
            if (pos > 0) {
                res = Math.max(res, getMaxDolls(dolls, pos - 1, dir, movesLeft - 1, dp, dollsCollected + dolls[pos - 1]));
            }
            if (pos < dolls.length - 1 && movesLeft > 1) {
                res = Math.max(res, getMaxDolls(dolls, pos + 1, dir, movesLeft - 2, dp, dollsCollected + dolls[pos + 1]));
            }
        } else { // moving right
            if (pos < dolls.length - 1) {
                res = Math.max(res, getMaxDolls(dolls, pos + 1, dir, movesLeft - 1, dp, dollsCollected + dolls[pos + 1]));
            }
            if (pos > 0 && movesLeft > 1) {
                res = Math.max(res, getMaxDolls(dolls, pos - 1, dir, movesLeft - 2, dp, dollsCollected + dolls[pos - 1]));
            }
        }
        dp[pos][dir][movesLeft] = res - dollsCollected;
        return res;
    }

    public static void main(String[] args) {
//        int[] dolls = {2, 3, 7, 5, 1, 3, 9};
        int[] dolls = {7,6,3,2};
        int k = 2;
        int m = 3;
        int maxDolls = findMaxDolls(dolls, k, m);
        System.out.println("Max dolls collected: " + maxDolls);

    }

//

}
