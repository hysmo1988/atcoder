package abc083.b;

import java.util.Scanner;

public class Main {

	// 10分くらい
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int r = 0;
		for(int i=1;i<=n;i++) {
			// 桁の和を出すため、一旦charにする
			char[] c = String.valueOf(i).toCharArray();
			int wa = 0;
			for(int j=0;j<c.length;j++) {
				// charにしたのでintに明示的キャスト
				wa+=Integer.parseInt(String.valueOf(c[j]));
			}
			if(wa>=a && wa<=b) {
				r+=i;
			}
		}
		System.out.println(r);
	}
}
