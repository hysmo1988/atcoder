package abc115.a;

import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        sc.close();
        switch (d) {
            case 25:
                prtln("Christmas");
                break;
            case 24:
                prtln("Christmas Eve");
                break;   
            case 23:
                prtln("Christmas Eve Eve");
                break;
            default:
            prtln("Christmas Eve Eve Eve");
                break;
        }
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}