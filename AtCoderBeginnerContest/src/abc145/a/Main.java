package abc145.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 円周率
		int x = (int) Math.PI;
		// 半径1の円の面積
		int area1 = 1 * 1 * x;
		// 入力値の円の面積
		int a = sc.nextInt();
		int areaX = a * a * x;
		// 結果
		System.out.println(areaX/area1);

		// 半径1の円の面積の何倍になるか、が問なので
		// 単純に入力値*入力値でよい
		System.out.println(a*a);
		sc.close();
	}
}
