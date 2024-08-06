package week02_2;

import java.util.Scanner;
import java.util.Stack;

public class _1222_계산기1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {
			int N = sc.nextInt();
			String str = sc.next();
//			sc.nextLine(); // 없어도 되는지 확인해 보기
			System.out.println("#" + t + " " + postfix(str));
		}
	}

	static int postfix(String infix) {

		int postfix = 0;
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);

			if (c >= '0' && c <= '9') {
				int num = Character.getNumericValue(c);
				postfix += num;
			} else if (c == '+')
				stack.push(c);
		}

		return postfix;
	}

}
