package abc146.c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        // 所持金
        long x = sc.nextLong();
		sc.close();

		// 最小値のカーソル
        long curMin = 0;
        // 最大値のカーソル
        long curMax = (long) Math.pow(10, 9) + 1; // 1e9もOK=1000000000

        // 最大と最小のカーソルがぶつかるまでループ
        while (curMax - curMin > 1) {
        	// カーソル位置を半分にする
            long curMid = (curMin + curMax) / 2;
            // curMidの十進表記の桁数を取得
            int len = String.valueOf(curMid).length();

            // 所持金に収まる場合
            if ((a*curMid)+(b*len)<=x) {
            	// カーソル位置を大きくする
                curMin = curMid;
            } else {
            	// 所持金に収まらない場合
            	// カーソル位置を小さくする
                curMax = curMid;
            }
        }
        System.out.println(curMin);
	}
}
