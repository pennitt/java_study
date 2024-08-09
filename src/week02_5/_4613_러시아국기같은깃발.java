package week02_5;

import java.util.*;

public class _4613_러시아국기같은깃발 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			char[][] arr = new char[n][m];

			// 배열 만들기
			for (int i = 0; i < n; i++) {
				String c = sc.next();
				arr[i] = c.toCharArray();

			}

			// 칠한 칸의 개수 셀 변수 cnt 생성
			int cnt = 0;

//			// 첫 번째 열
//			cnt += cntFlag(arr, 0, n, m)[1];
//			cnt += cntFlag(arr, 0, n, m)[2];
//
//			// 마지막 열
//			cnt += cntFlag(arr, n-1, n, m)[0];
//			cnt += cntFlag(arr, n-1, n, m)[1];

			boolean blue = false;
			int[] blueCnt = new int[n];
			int max = 0;
			int blueIdx = 0;

			// 파랑 자리 선정
			for (int i = 1; i < n - 1; i++) {
				int[] cntColor = cntFlag(arr, i, n, m);
				if (cntColor[1] > max) {
					blueIdx = i;
				}
			}
			
			// 

			int start = blueIdx;
			int end = blueIdx + 1;
			
			for (int i = start; i > 0; i--) {
				if (cntFlag(arr, i, n, m)[1] >= cntFlag(arr, i, n, m)[0]) {
					start = i;
				}
			}
			
			for (int i = end; i < n - 1; i++) {
				if (cntFlag(arr, i, n, m)[1] >= cntFlag(arr, i, n, m)[2]) {
					end = i;
				}
			}

			for (int i = 0; i < start; i++) {
				cnt += cntFlag(arr, i, n, m)[1];
				cnt += cntFlag(arr, i, n, m)[2];
			}
			
			for (int i = start; i <= end; i++) {
				cnt += cntFlag(arr, blueIdx, n, m)[0];
				cnt += cntFlag(arr, blueIdx, n, m)[2];
			}

			for (int i = end + 1; i < n; i++) {
				cnt += cntFlag(arr, i, n, m)[0];
				cnt += cntFlag(arr, i, n, m)[1];
			}

			System.out.println("#" + t + " " + cnt);
		}

	}

	// 개수 세는 배열 생성
	static int[] cntFlag(char[][] arr, int r, int n, int m) {
		// [0] : W [1] : B [2] : R
		int[] flag = new int[3];

		for (int i = 0; i < m; i++) {
			if (arr[r][i] == 'W') {
				flag[0]++;
			} else if (arr[r][i] == 'B') {
				flag[1]++;
			} else {
				flag[2]++;
			}
		}

		return flag;

	}

}
