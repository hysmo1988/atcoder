package abc085.c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		//10,000円札を0枚からN枚まで全探索
		for(int a=0;a<=n;a++){
			//5,000円札を0枚からN-A枚まで全探索
			for(int b=0;a+b<=n;b++){
				// 1,000円札の枚数を計算する
				int c = n-a-b;
				int m = 10000*a+5000*b+1000*c;
				//枚数はN枚なので金額だけ見る
				if(m==y){
					System.out.println(a+" "+b+" "+c);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}
