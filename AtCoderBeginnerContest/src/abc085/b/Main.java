package abc085.b;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] d = new Integer[n];
		for(int i=0;i<n;i++) {
			d[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(d, Collections.reverseOrder());
		int cnt = 0;
		int be = 0;
		for(int i=n-1;i>=0;i--) {
			if(be!=d[i]) cnt++;
			be = d[i];
		}
		System.out.println(cnt);
	}
}
