package pracatice;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// n : 인원 수, m : 한 사람이 받을 횟수, l : 공받 횟수 홀수 - 시계방향 l번째, 짝수 - 반시계 l번째
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
	
		int[] arr = new int[n];

		int idx = 1;
		int left_idx = (idx + l) % (n-1);
		int right_idx = (idx - l) % (n-1);

		for (int i = 0; i < n ; i++) {
			if (arr[i] == m) {
				break;
			} else if (arr[idx])
				
		}

	}
}
