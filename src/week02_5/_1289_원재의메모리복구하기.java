package week02_5;

import java.util.*;

public class _1289_원재의메모리복구하기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			String num = sc.next();
			int n = num.length();

			char[] original = num.toCharArray();
			char[] c = new char[n];
			for (int i = 0; i < n; i++) {
				c[i] = '0';
			}

			int sum = 0;

			for (int i = 0; i < n; i++) {
				if (original[i] != c[i]) {
					int idx = i;
					int sts = original[i];

					if (sts == '1') {
						while (idx < n) {
							c[idx] = '1';
							idx++;
						}
					} else if (sts == '0') {
						while (idx < n) {
							c[idx] = '0';
							idx++;
						}
					}
					sum++;
				}
			}
			System.out.println("#" + t + " " + sum);
		}
	}
}
