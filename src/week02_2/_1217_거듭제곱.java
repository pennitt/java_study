package week02_2;

import java.util.Scanner;

public class _1217_거듭제곱 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for (int t = 1; t <= 10; t++) {

			sc.nextInt();

			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println("#" + t + " " + pow(a, b));
		}
	}
	static int pow(int n, int m) {

		if (m < 1)
			return 1;
		m = m - 1;
		return n * pow(n, m);
	}

}
