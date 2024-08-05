package week02;

import java.util.Scanner;
import java.util.Stack;

public class _1218_괄호짝짓기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {
			int len = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();

			char[] arr = str.toCharArray();

			// 스택에 투입
			Stack<Character> stack = new Stack<>();
			for (char c : arr) {
				stack.push(c);
			}

			int a = 0; // ()
			int b = 0; // []
			int c = 0; // {}
			int d = 0; // <>

			for (int i = 0; i < len; i++) {
				char pp = stack.pop();

				if (pp == ')') 
					a++;
			 else if (pp == '(')
				 a--;
			 else if (pp == '[')
				 b++;
			 else if (pp == ']')
				 b--;
			 else if (pp == '{')
				 c++;
			 else if (pp == '}')
				 c--;
			 else if (pp == '<')
				 d++;
			 else if (pp == '>')
				 d--;
				
			}
			if (a == 0 && b == 0 && c == 0 && d == 0) {
				System.out.println("#" + t + " " + 1);
			} else
				System.out.println("#" + t + " " + 0);
		}
	}
}
