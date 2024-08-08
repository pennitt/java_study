package week02_4;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {

			int N = sc.nextInt();

			// 농장 배열
			int[][] arr = new int[N][N];

			for (int i = 0; i < N; i++) {
				String value = sc.next();
				char[] c = value.toCharArray();

				for (int j = 0; j < N; j++) {
					arr[i][j] = Character.getNumericValue(c[j]);
				}
			}
			
			System.out.println(arr);
		}
	}
}
