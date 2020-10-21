package abc081.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//anser1
		int m1 = Integer.parseInt(s.substring(0,1));
		int m2 = Integer.parseInt(s.substring(1,2));
		int m3 = Integer.parseInt(s.substring(2));
		System.out.println(m1+m2+m3);

		// anser2
//		int m=0;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='1') m++;
//		}
//		System.out.println(m);
		sc.close();
	}
}
