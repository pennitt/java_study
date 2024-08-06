package week02_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class _1224_계산기3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {
			int N = sc.nextInt();
			String str = sc.next();
			String postfix = postfix(str);
			System.out.println("#" + t + " " + evalPostfix(postfix));
		}
	}

	static String postfix(String infix) {

		// 스택 쌓을 배열
		Stack<Character> stack = new Stack<>();
		// 계산 결과 저장 배열
		Stack<Character> res = new Stack<>();
		// 후위식 만들 String
		String postfix = "";

		// 각 연산자에 순위 배정
		Map<Character, Integer> map = new HashMap<>();
		map.put('+', 1);
		map.put('*', 2);
		map.put('(', 0);

		// 받아온 infix 각각에 작업 수행
		for (int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);

			if (c >= '0' && c <= '9') {
				postfix += c;
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				char popItem = stack.pop();
				while (popItem != '(') {
					postfix += popItem;
					popItem = stack.pop();
				}
			} else {
				while (!stack.isEmpty() && stack.peek() != '(' && map.get(stack.peek()) >= map.get(c)) {
					char popItem = stack.pop();
					postfix += popItem;
				}
				stack.push(c);
			}

		}
		// 스택 비워주기????
		while (!stack.isEmpty()) {
			postfix += stack.pop();
		}

		return postfix;
	}

	static int evalPostfix(String postfix) {

		// 계산 결과 저장 배열
		Stack<Integer> res = new Stack<>();

		for (int i = 0; i < postfix.length(); i++) {
			char c = postfix.charAt(i);

			if (c >= '0' && c <= '9') {
				res.push(Character.getNumericValue(c));

			} else {
				int num1 = res.pop();
				int num2 = res.pop();
				int sum = 0;

				if (c == '+') {
					sum = num2 + num1;
				} else if (c == '*') {
					sum = num2 * num1;
				}
				res.push(sum);
			}
		}
		return res.pop();
	}
}