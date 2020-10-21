package abc087.b;

import java.util.Scanner;

public class Main {

	private static int A = 500;
	private static int B = 100;
	private static int C = 50;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 500円の枚数
		int a = sc.nextInt();
		// 100円の枚数
		int b = sc.nextInt();
		// 50円の枚数
		int c = sc.nextInt();
		// 合計金額
		int x = sc.nextInt();

		// 結果
		int r = 0;
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=b;j++) {
				for(int k=0;k<=c;k++){
					if((A*i)+(B*j)+(C*k)==x) {
						r++;
					}
				}
			}
		}
		System.out.println(r);
		sc.close();
	}
}
