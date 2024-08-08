package week02_4;

import java.util.*;

public class _1966_숫자를정렬하자 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			
			
			// 배열 arr 생성
			int[] arr = new int[N];
			for (int n = 0; n < N; n++) {
				int num = sc.nextInt();
				arr[n] = num;
			}
			
			for (int i = 1; i < arr.length; i++) {
				int data = arr[i];
				
				int j;
				for (j = i - 1; j >= 0 && arr[j] > data; j--) {
					arr[j + 1] = arr[j]; // 오른쪽으로 이동
				}
				arr[j + 1] = data; 
			}
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
				sb.append(" ");
			}
			System.out.println("#" + t + " " + sb);
		}

	}

}
