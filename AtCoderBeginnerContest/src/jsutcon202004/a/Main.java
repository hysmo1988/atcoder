package jsutcon202004.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int L = sc.nextInt();
		int R = sc.nextInt();
		sc.close();
		int X = S;
		while (!(L <= X && X <= R)) {
			if(X < L) X++;
			else if(X > R) X--;
		}
		System.out.println(X);
	}
}
