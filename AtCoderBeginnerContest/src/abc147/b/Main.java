package abc147.b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		char[] c = s.toCharArray();
		int cnt = 0;
		for(int i=0;i<c.length/2;i++) {
//			System.out.println(c[i] + ";" + c[len+(c.length%2)+i]);
//			System.out.println(c[i] + ";" + c[max-1-i]);
			if(c[i]!=c[c.length-1-i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
