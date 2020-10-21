package abc151.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 入力値
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();
		int a = 0;
		for(int i=0;i<n-1;i++){
			a += sc.nextInt();
		}
		sc.close();

		int r = 0;
		boolean ok = false;
		int cnt = 0;
		do {
			if((a+cnt)/n >= m) {
				ok = true;
				r = cnt;
			}
			cnt++;
		} while (!ok && cnt <= k);

		System.out.println(ok?r:-1);
	}
}