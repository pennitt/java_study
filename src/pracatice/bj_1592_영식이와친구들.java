package pracatice;

import java.util.Arrays;
import java.util.Scanner;

public class bj_1592_영식이와친구들 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// n : 인원 수, m : 한 사람이 받을 횟수, l : 공받 횟수 홀수 - 시계방향 l번째, 짝수 - 반시계 l번째
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		int[] arr = new int[n+1];
		int idx = 1;
		int cnt = 0;
		
		for (int i = 1; i < n+1; i++) {
			if (arr[i] == m) {
				break;
				
			} else if (arr[idx] % 2 == 0) {
				idx = idx - l;
				cnt++;
				if (idx < 0)
					idx = idx + n;
				System.out.println(idx);
			} else if (arr[idx] % 2 != 0) {
				idx = (idx + l) % (n - 1);
				cnt++;
				System.out.println(idx);
			}

		}
		
		System.out.println(cnt);

	}
}
