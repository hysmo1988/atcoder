package abc158.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		sc.close();
		int a = 0;
		int b = 0;
		for(int i = 0; i < S.length; i++) {
			if(S[i] == 'A') a++;
			if(S[i] == 'B') b++;
		}
		System.out.println(a > 0 && b > 0 ? "Yes" : "No");
	}
}
