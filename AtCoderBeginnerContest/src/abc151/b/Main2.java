package abc151.b;

import java.util.Scanner;

public class Main2 {
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

		int r = (n*m)-a;
		
		System.out.println(r>k?-1:r<0?0:r);
	}
}