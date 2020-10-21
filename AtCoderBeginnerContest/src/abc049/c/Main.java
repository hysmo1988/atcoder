package abc049.c;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.println(new Main().func(s)?"YES":"NO");
	}

	public boolean func(String s){
		int slen = s.length();
		boolean dp[] = new boolean[slen + 1];
		Arrays.fill(dp, false);
		dp[0] = true;
		String[] t = {"dream","dreamer","erase","eraser"};
		for(int i = 1; i <= slen; i++){
			for(int j = 0; j < 4; j++){
				// 検索文字位置からtarget文字長さを引いた位置
				int p = i - t[j].length();
				// pがマイナスの場合は検索文字位置がtarget文字長さに満たない
				if(p < 0) { continue; }
				
				// DP[]の値がtrueであること
				// 検索文字列の対象範囲とtarget文字が一致すること
				// 上記に合致する場合、検索結果trueとなる
				boolean b1 = dp[p];
				boolean b2 = s.substring(p, i).equals(t[j]);
				// DP[i]が検索済み(true)である場合はtrueのまま
				// dp[i] = dp[i] | (b1 && b2);
				dp[i] |= b1 && b2;
			}
		}
		return dp[slen];
	}
}
