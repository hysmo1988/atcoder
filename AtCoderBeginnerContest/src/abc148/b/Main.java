package abc148.b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sc.close();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(s[i]);
			sb.append(t[i]);
		}
		System.out.println(sb.toString());
	}
}
